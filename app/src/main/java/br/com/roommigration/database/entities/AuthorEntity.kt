package br.com.roommigration.database.entities

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class AuthorEntity(
    @PrimaryKey(autoGenerate = false)
    val id: Int,
    val name: String
)
