package com.example.shopping_list_compose.data.item

import androidx.room.Entity

@Entity(tableName = "add_item")
data class AddItem(
    val id: Int? = null,
    val name: String,
    val isCheck: Boolean,
    val listId: Int
)
