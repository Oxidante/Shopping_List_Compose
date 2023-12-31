package com.example.shopping_list_compose.data.di

import android.app.Application
import androidx.room.Room
import com.example.shopping_list_compose.data.MainDb
import com.example.shopping_list_compose.data.repository.AddItemRepoImpl
import com.example.shopping_list_compose.data.repository.AddItemRepository
import com.example.shopping_list_compose.data.repository.NoteRepoImpl
import com.example.shopping_list_compose.data.repository.NoteRepository
import com.example.shopping_list_compose.data.repository.ShoppingListRepoImpl
import com.example.shopping_list_compose.data.repository.ShoppingListRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {
    @Provides
    @Singleton
    fun provideMainDb(app: Application): MainDb {
        return Room.databaseBuilder(
            app,
            MainDb::class.java,
            "shop_list_db"
        ).build()
    }

    @Provides
    @Singleton
    fun provideShopRepo(db: MainDb): ShoppingListRepository {
        return ShoppingListRepoImpl(db.shoppingListDao)
    }

    @Provides
    @Singleton
    fun provideAddItemRepo(db: MainDb): AddItemRepository {
        return AddItemRepoImpl(db.addItemDao)
    }

    @Provides
    @Singleton
    fun provideNoteRepo(db: MainDb): NoteRepository {
        return NoteRepoImpl(db.noteDao)
    }
}