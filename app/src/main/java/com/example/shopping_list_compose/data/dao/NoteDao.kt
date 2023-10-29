package com.example.shopping_list_compose.data.dao

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.example.shopping_list_compose.data.NoteItem
import kotlinx.coroutines.flow.Flow

@Dao
interface NoteDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertItem(item: NoteItem)
    @Delete
    suspend fun deleteItem(item: NoteItem)
    @Query("SELECT * FROM not_table")
    fun getAllItems(): Flow<List<NoteItem>>
    @Query("SELECT * FROM shop_list_name WHERE id = :id")
    suspend fun getListItemById(id: Int): NoteItem
}