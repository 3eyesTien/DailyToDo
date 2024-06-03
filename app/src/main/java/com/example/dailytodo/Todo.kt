package com.example.dailytodo

// data class' purpose is to hold data. Will not have any logic in this class
data class Todo (
    val title: String,
    val isChecked: Boolean = false
)