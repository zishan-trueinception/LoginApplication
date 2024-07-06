package com.example.androidprac.todoscreen

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Delete
import androidx.compose.material3.Button
import androidx.compose.material3.Checkbox
import androidx.compose.material3.FilledTonalButton
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.ListItem
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun Screen() {

    // Mutable list to hold tasks,
    val task = remember {
        mutableStateListOf("Tasks") // Initial list with a placeholder task
    }

    // State for the text input field
    val taskText = remember {
        mutableStateOf("")
    }

    // Main layout of the screen
    Box(modifier = Modifier.fillMaxSize()) {
        Column(
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier.padding(horizontal = 16.dp)
        ) {
            // Title of the app
            Text(
                text = "TODO APP",
                style = TextStyle(
                    fontSize = 26.sp,
                    fontWeight = FontWeight.Medium,
                    color = MaterialTheme.colorScheme.primary
                ),
                modifier = Modifier.padding(vertical = 26.dp, horizontal = 24.dp)
            )

            // Text input field for entering new tasks
            OutlinedTextField(
                value = taskText.value,
                onValueChange = { taskText.value = it },
                label = { Text(text = "Enter Task Here") },
                modifier = Modifier.fillMaxWidth()
            )
            Spacer(modifier = Modifier.size(5.dp))

            // Button to add tasks to the list
            Button(
                onClick = {
                    task.add(taskText.value)
                    taskText.value = ""
                },
                modifier = Modifier.fillMaxWidth()
            ) {
                Text(text = "ADD TASK")
            }

            // Row for displaying "Tasks" label and "CLEAR ALL" button
            Row(
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceBetween,
                modifier = Modifier.fillMaxWidth()
            ) {
                Text(
                    text = "Tasks : -",
                    color = Color.Black,
                    fontWeight = FontWeight.Bold,
                    fontStyle = FontStyle.Italic
                )
                FilledTonalButton(onClick = { task.clear() }) {
                    Text(
                        text = "CLEAR ALL",
                        fontWeight = FontWeight.Bold,
                        fontStyle = FontStyle.Italic
                    )
                }
            }

            // LazyColumn for displaying the list of tasks
            LazyColumn(
                modifier = Modifier.fillMaxWidth(),
                verticalArrangement = Arrangement.spacedBy(4.dp)
            ) {
                // Iterating through the list of tasks
                itemsIndexed(task) { index, tasks ->
                    // State to manage whether the task is checked or not
                    val checked = remember { mutableStateOf(false) }

                    // ListItem representing each task
                    ListItem(
                        headlineContent = {
                            Text(
                                text = tasks, // Displaying the task text
                                textDecoration = if (checked.value) TextDecoration.LineThrough else TextDecoration.None
                            )
                        },
                        modifier = Modifier.fillMaxWidth(),
                        leadingContent = {
                            // Checkbox to mark the task as done
                            Checkbox(
                                checked = checked.value,
                                onCheckedChange = {
                                    checked.value = it
                                }
                            )
                        },
                        trailingContent = {
                            // IconButton to delete the task
                            IconButton(
                                onClick = {
                                    task.removeAt(index)
                                }
                            ) {
                                Icon(
                                    imageVector = Icons.Default.Delete,
                                    contentDescription = "Delete Task",
                                    tint = MaterialTheme.colorScheme.primary
                                )
                            }
                        }
                    )
                    HorizontalDivider() // Divider between each ListItem
                }
            }
        }
    }
}







