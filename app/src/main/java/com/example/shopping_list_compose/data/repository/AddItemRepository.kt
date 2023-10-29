package com.example.shopping_list_compose.data.repository

import com.example.shopping_list_compose.data.item.AddItem
import com.example.shopping_list_compose.data.item.ShoppingListItem
import kotlinx.coroutines.flow.Flow

interface AddItemRepository {
    suspend fun insertItem(item: AddItem)
    suspend fun deleteItem(item: AddItem)
    fun getAllItemsById(listId: Int): Flow<List<AddItem>>
    suspend fun getListItemById(listId: Int): ShoppingListItem
    suspend fun insertItem(item: ShoppingListItem)
}