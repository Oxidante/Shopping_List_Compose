package com.example.shopping_list_compose.data

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.shopping_list_compose.data.dao.ShoppingListDao

@Database(
    entities = [AddItem::class, ShoppingListItem::class, NoteItem::class],
    version = 1
)
abstract class MainDb: RoomDatabase() {
    abstract val shoppingListDao: ShoppingListDao
}