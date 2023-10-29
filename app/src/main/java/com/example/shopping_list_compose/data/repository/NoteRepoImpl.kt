package com.example.shopping_list_compose.data.repository

import com.example.shopping_list_compose.data.item.NoteItem
import com.example.shopping_list_compose.data.dao.NoteDao
import kotlinx.coroutines.flow.Flow

class NoteRepoImpl(
    private val dao: NoteDao
) : NoteRepository {
    override suspend fun insertItem(item: NoteItem) {
        dao.insertItem(item)
    }

    override suspend fun deleteItem(item: NoteItem) {
        dao.deleteItem(item)
    }

    override fun getAllItems(): Flow<List<NoteItem>> {
        return dao.getAllItems()
    }

    override suspend fun getListItemById(id: Int): NoteItem {
        return dao.getListItemById(id)
    }
}