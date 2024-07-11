package com.example.androidprac.androidpractice

import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.TextFieldColors
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Shape

@Composable
fun Any.CustomInputField(
    value: String,
    onValueChange: (String) -> Unit,
    placeholder: @Composable() (() -> Unit)? = null,
    leadingIcon: @Composable() (() -> Unit)? = null,
    trailingIcon: @Composable() (() -> Unit)? = null,
    label: @Composable() (() -> Unit)? = null,
    modifier: Modifier,
    shape: Shape = OutlinedTextFieldDefaults.shape,
    colors: TextFieldColors = OutlinedTextFieldDefaults.colors(),
    keyboardActions: KeyboardActions = KeyboardActions.Default,
) {
    OutlinedTextField(
        value = value,
        onValueChange = onValueChange,
        placeholder = placeholder,
        leadingIcon = leadingIcon,
        trailingIcon = trailingIcon,
        label = label,
        modifier = Modifier,
        shape = shape,
        colors = colors,
        keyboardActions = keyboardActions
    )

}

