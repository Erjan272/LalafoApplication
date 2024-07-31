package com.example.lalafoapplication


import android.widget.ImageView
import com.bumptech.glide.Glide
import java.net.URL

object Extension {
    fun ImageView.loadImage(photoURL:String){
        Glide.with(this).load(photoURL).into(this)
    }
}