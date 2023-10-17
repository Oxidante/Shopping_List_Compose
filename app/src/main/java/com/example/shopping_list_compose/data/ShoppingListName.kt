package com.example.shopping_list_compose.data

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "shop_list_name")
data class ShoppingListName(
    @PrimaryKey
    val id: Int? = null,
    val name: String,
    val time: String,
    val allItemsCount: Int,
    val allSelectedItemsCount: Int
)