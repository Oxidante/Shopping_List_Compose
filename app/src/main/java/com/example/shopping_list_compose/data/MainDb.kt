package com.example.shopping_list_compose.data

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.shopping_list_compose.data.dao.AddItemDao
import com.example.shopping_list_compose.data.dao.NoteDao
import com.example.shopping_list_compose.data.dao.ShoppingListDao
import com.example.shopping_list_compose.data.item.AddItem
import com.example.shopping_list_compose.data.item.NoteItem
import com.example.shopping_list_compose.data.item.ShoppingListItem

@Database(
    entities = [AddItem::class, ShoppingListItem::class, NoteItem::class],
    version = 1
)
abstract class MainDb: RoomDatabase() {
    abstract val shoppingListDao: ShoppingListDao
    abstract val noteDao: NoteDao
    abstract val addItemDao: AddItemDao
}