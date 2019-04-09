package com.mbieniek.facebookimagepicker.facebook.util

import android.content.Context
import android.graphics.drawable.Drawable
import android.widget.ImageView
import com.squareup.picasso.Picasso

object PicassoImageLoader {
    fun loadImage(context: Context, url: String, imageView: ImageView, placeholder: Drawable? = null) {
        Picasso.with(context)
                .load(url)
                .placeholder(placeholder)
                .into(imageView)
    }

    fun loadImage(context: Context, url: String, imageView: ImageView, placeholder: Int) {
        Picasso.with(context)
                .load(url)
                .placeholder(placeholder)
                .into(imageView)
    }
}