package br.com.roommigration.database.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import br.com.roommigration.database.entities.AuthorEntity
import br.com.roommigration.database.entities.BookEntity

@Dao
interface MyDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertBooks(books: List<BookEntity>)

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertAuthors(authors: List<AuthorEntity>)
}