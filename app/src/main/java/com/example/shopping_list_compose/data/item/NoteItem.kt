package com.example.shopping_list_compose.data.item

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "not_table")
data class NoteItem(
    @PrimaryKey
    val id: Int? = null,
    val title: String,
    val description: String,
    val time: String
)
