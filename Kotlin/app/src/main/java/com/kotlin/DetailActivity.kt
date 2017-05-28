package com.kotlin

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.Toolbar
import android.util.Log
import android.widget.ImageView
import com.bumptech.glide.Glide
import com.kotlin.models.Photo

class DetailActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)
        val toolbar = findViewById(R.id.toolbar) as Toolbar
        setSupportActionBar(toolbar)

        val imageView = findViewById(R.id.imageView) as ImageView
        val photo = intent.getSerializableExtra(PHOTO) as Photo?

        Log.d("D", "photoDebug with photo = " + photo?.webformatURL)

        photo?.webformatURL.let{
            Glide.with(this).load(photo?.webformatURL)
                    .into(imageView)
        }

        imageView.setOnClickListener{
            finish()
        }
    }

    companion object {
        val PHOTO = "PHOTO"
    }
}
