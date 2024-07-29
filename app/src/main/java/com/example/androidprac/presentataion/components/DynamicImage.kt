package com.example.androidprac.presentataion.components

import android.graphics.drawable.Drawable
import android.net.Uri
import android.util.Log
import androidx.compose.foundation.Image
import androidx.compose.material3.Icon
import androidx.compose.material3.LocalContentColor
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.vectorResource
import coil.compose.AsyncImage
import coil.compose.rememberAsyncImagePainter
import coil.request.ImageRequest
import com.example.androidprac.R

/* sealed class for define the DynamicImageSource of the image */
sealed class DynamicImageSource {
    data class Url(
        val url: String?,
        val placeholder: Int = R.drawable.image_loading,
        val fallback: Int = R.drawable.image_fall_back
    ) : DynamicImageSource()

    data class Local(val localImage: Int, val asVector: Boolean = false) : DynamicImageSource()
    data class Vector(val vectorImage: ImageVector) : DynamicImageSource()
    data class ImageUri(val uri: Uri) : DynamicImageSource()
    data class DrawableObject(val drawable: Drawable) : DynamicImageSource()
}

data class ImageCustomization(
    val modifier: Modifier = Modifier,
    val contentScale: ContentScale = ContentScale.FillWidth,
    val alignment: Alignment = Alignment.Center,
    val colorFilter: ColorFilter? = null,
    val tint: Color? = null,
) {
    companion object {
        val Default
            @Composable get() = ImageCustomization(
                tint = LocalContentColor.current
            )
    }
}

/* DynamicImage provides a flexible way to display images */
@Composable
fun DynamicImage(
    imageSource: DynamicImageSource,
    description: String? = null,
    customization: ImageCustomization = ImageCustomization.Default
) {
    when (imageSource) {
        is DynamicImageSource.Url -> {

            // image load from url
            AsyncImage(model = ImageRequest.Builder(LocalContext.current).data(imageSource.url)
                .build(),
                contentDescription = description,
                contentScale = customization.contentScale,
                alignment = customization.alignment,
                colorFilter = customization.colorFilter,
                modifier = customization.modifier,
                placeholder = painterResource(id = imageSource.placeholder),
                error = painterResource(id = imageSource.fallback),
                onError = { error ->
                    Log.e("DynamicImage", "URL: ${imageSource.url} DynamicImage Error: $error")
                })
        }
        // image load from local
        is DynamicImageSource.Local -> {
            if (imageSource.asVector) {
                Icon(
                    imageVector = ImageVector.vectorResource(id = imageSource.localImage),
                    contentDescription = null,
                    modifier = customization.modifier,
                    tint = customization.tint ?: LocalContentColor.current,
                )
            } else {
                Image(
                    painter = painterResource(id = imageSource.localImage),
                    contentDescription = description,
                    contentScale = customization.contentScale,
                    alignment = customization.alignment,
                    colorFilter = customization.colorFilter,
                    modifier = customization.modifier
                )
            }
        }
        // image load from vector
        is DynamicImageSource.Vector -> {
            Icon(
                imageVector = imageSource.vectorImage,
                contentDescription = null,
                modifier = customization.modifier,
                tint = customization.tint ?: LocalContentColor.current,
            )
        }
//        image load from uri
        is DynamicImageSource.ImageUri -> {
            // load image from uri
            Image(
                painter = rememberAsyncImagePainter(imageSource.uri),
                contentDescription = description,
                contentScale = customization.contentScale,
                alignment = customization.alignment,
                colorFilter = customization.colorFilter,
                modifier = customization.modifier
            )
        }
//        image load from drawable
        is DynamicImageSource.DrawableObject -> Image(
            painter = rememberAsyncImagePainter(imageSource.drawable),
            contentDescription = description,
            contentScale = customization.contentScale,
            alignment = customization.alignment,
            colorFilter = customization.colorFilter,
            modifier = customization.modifier
        )
    }
}

