package com.example.examen.data.local

import android.content.Context
import androidx.room.*
import com.example.examen.data.model.AnimeEntity

@Dao
interface AnimeDao {
    @Query("SELECT * FROM favorites_anime")
    suspend fun getAllFavorites(): List<AnimeEntity>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertFavorite(anime: AnimeEntity)

    @Delete
    suspend fun deleteFavorite(anime: AnimeEntity)

    @Query("SELECT EXISTS(SELECT * FROM favorites_anime WHERE id = :id)")
    suspend fun isFavorite(id: Int): Boolean
}

@Database(entities = [AnimeEntity::class], version = 1)
abstract class AppDatabase : RoomDatabase() {
    abstract fun animeDao(): AnimeDao

    companion object {
        @Volatile private var INSTANCE: AppDatabase? = null

        fun getDatabase(context: Context): AppDatabase {
            return INSTANCE ?: synchronized(this) {
                val instance = Room.databaseBuilder(
                    context.applicationContext,
                    AppDatabase::class.java,
                    "haikyuu_db"
                ).build()
                INSTANCE = instance
                instance
            }
        }
    }
}