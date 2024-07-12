package com.example.androidprac.androidpractice

import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Check
import androidx.compose.material.icons.filled.Email
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldColors
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.unit.dp

@Composable
fun CustomInputField(
    value: TextFieldValue,
    onValueChange: (TextFieldValue) -> Unit,
    label: @Composable (() -> Unit)? = null,
    placeholder: @Composable (() -> Unit)? = null,
    leadingIcon: @Composable (() -> Unit)? = null,
    trailingIcon: @Composable (() -> Unit)? = null,
    visualTransformation: VisualTransformation = VisualTransformation.None,
    enabled: Boolean = true,
    readOnly: Boolean = false,
    singleLine: Boolean = false,
    modifier: Modifier = Modifier,
    shape: Shape = MaterialTheme.shapes.small,
    colors: TextFieldColors = TextFieldDefaults.colors(),
    keyboardActions: KeyboardActions = KeyboardActions.Default,
) {
    val interactionSource = remember { MutableInteractionSource() }

    TextField(
        value = value,
        onValueChange = onValueChange,
        label = label,
        placeholder = placeholder,
        leadingIcon = leadingIcon,
        trailingIcon = trailingIcon,
        visualTransformation = visualTransformation,
        enabled = enabled,
        readOnly = readOnly,
        singleLine = singleLine,
        modifier = modifier
            .padding(top = if (label != null) 5.dp else 0.dp),
        shape = shape,
        colors = colors,
        keyboardActions = keyboardActions,
        interactionSource = interactionSource,
    )
}

@Composable
fun MyCustomInputField() {
    var text by remember { mutableStateOf(TextFieldValue()) }

    CustomInputField(
        value = text,
        onValueChange = {
            text = it
        },
        label = { Text("Email") },
        placeholder = { Text("johnexample@gmail.com") },
        leadingIcon = { Icon(Icons.Filled.Email, contentDescription = "emailIcon") },
        trailingIcon = { Icon(Icons.Filled.Check, contentDescription = "checkIcon") },
        singleLine = true,
        modifier = Modifier.fillMaxWidth()
    )
}


