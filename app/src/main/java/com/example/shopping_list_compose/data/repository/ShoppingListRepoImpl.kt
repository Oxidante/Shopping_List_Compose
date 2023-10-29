package com.example.shopping_list_compose.data.repository

import com.example.shopping_list_compose.data.dao.ShoppingListDao
import com.example.shopping_list_compose.data.item.ShoppingListItem
import kotlinx.coroutines.flow.Flow

class ShoppingListRepoImpl(
    private val dao: ShoppingListDao
) : ShoppingListRepository {
    override suspend fun insertItem(item: ShoppingListItem) {
        dao.insertItem(item)
    }

    override suspend fun deleteItem(item: ShoppingListItem) {
        dao.deleteItem(item)
    }

    override fun getAllItems(): Flow<List<ShoppingListItem>> {
        return dao.getAllItems()
    }
}