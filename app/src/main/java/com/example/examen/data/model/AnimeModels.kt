package com.example.examen.data.model

import android.os.Parcelable
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.google.gson.annotations.SerializedName
import kotlinx.parcelize.Parcelize

data class JikanResponse(
    @SerializedName("data") val data: List<JikanAnimeData>
)

data class JikanAnimeData(
    @SerializedName("mal_id") val malId: Int,
    @SerializedName("title") val title: String,
    @SerializedName("synopsis") val synopsis: String?,
    @SerializedName("score") val score: Double?,
    @SerializedName("images") val images: JikanImages
)

data class JikanImages(
    @SerializedName("jpg") val jpg: JikanJpg
)

data class JikanJpg(
    @SerializedName("image_url") val imageUrl: String
)

@Parcelize
@Entity(tableName = "favorites_anime")
data class AnimeEntity(
    @PrimaryKey val id: Int,
    val title: String,
    val synopsis: String,
    val imageUrl: String,
    val score: Double
) : Parcelable