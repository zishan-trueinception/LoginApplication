package com.example.androidprac.core.data.repositories.topCategories

import com.example.androidprac.R
import com.example.androidprac.core.models.CategoryModel
import com.example.androidprac.presentataion.components.DynamicImageSource

class TopCategoriesRepoImpl : TopCategoriesRepo {
    override fun getAllTopCategories(): List<CategoryModel> {
        return listOf(
            CategoryModel(
                label = "3D Printer",
               image = DynamicImageSource.Local(R.drawable.image_3d_printer)
            ),
            CategoryModel(
                label = "Development Boards",
                image = DynamicImageSource.Local(R.drawable.image_development)
            ),
            CategoryModel(
                label = "Raspberry Pi",
                image = DynamicImageSource.Local(R.drawable.image_raspberry_pi)
            ),
            CategoryModel(
                label = "Arduino",
                image = DynamicImageSource.Local(R.drawable.image_arduino)
            ),
            CategoryModel(
                label = "Wires",
                image = DynamicImageSource.Local(R.drawable.image_wires)
            ),
            CategoryModel(
                label = "Cameras & Sensors",
                image = DynamicImageSource.Local(R.drawable.image_camera)
            ),

        )
    }
}