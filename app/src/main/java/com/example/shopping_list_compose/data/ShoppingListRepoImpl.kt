package com.example.shopping_list_compose.data

import kotlinx.coroutines.flow.Flow

class ShoppingListRepoImpl(
    private val dao: ShoppingListDao
) : ShoppingListRepository {
    override suspend fun insertItem(item: ShoppingListItem) {

    }

    override suspend fun deleteItem(item: ShoppingListItem) {

    }

    override fun getAllItems(): Flow<List<ShoppingListItem>> {

    }
}