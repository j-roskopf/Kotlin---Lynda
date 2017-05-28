package com.kotlin.models

import java.io.Serializable

/**
 * Created by Joe on 5/28/2017.
 */
data class Photo (val id : String,
                  val likes: Int,
                  val favorites: Int,
                  val tags: String,
                  val previewURL: String,
                  val webformatURL: String) : Serializable{
}