package com.kai.stackoverflow.gifExample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import com.bumptech.glide.Glide

class MainActivity : AppCompatActivity() {
    private lateinit var imageView: ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        imageView = findViewById(R.id.imageView)
        loadImage()
    }

    private fun loadImage() {
        val url = "https://media.giphy.com/media/3o7527pa7qs9kCG78A/giphy.gif"
        Glide.with(this)
            .load(url)
            .into(imageView)

    }
}