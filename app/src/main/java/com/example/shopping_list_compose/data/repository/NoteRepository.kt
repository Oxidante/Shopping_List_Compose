package com.example.shopping_list_compose.data.repository

import com.example.shopping_list_compose.data.item.NoteItem
import kotlinx.coroutines.flow.Flow

interface NoteRepository {
    suspend fun insertItem(item: NoteItem)
    suspend fun deleteItem(item: NoteItem)
    fun getAllItems(): Flow<List<NoteItem>>
    suspend fun getListItemById(id: Int): NoteItem
}