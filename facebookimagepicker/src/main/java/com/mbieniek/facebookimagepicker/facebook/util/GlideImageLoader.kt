package com.mbieniek.facebookimagepicker.facebook.util

import android.content.Context
import android.graphics.drawable.Drawable
import android.widget.ImageView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions

object GlideImageLoader {
    fun loadImage(context: Context, url: String, imageView: ImageView, placeholder: Drawable? = null) {
        val options = RequestOptions().placeholder(placeholder)
        Glide.with(context)
                .setDefaultRequestOptions(options)
                .load(url)
                .into(imageView)
    }

    fun loadImage(context: Context, url: String, imageView: ImageView, placeholder: Int) {
        val options = RequestOptions().placeholder(placeholder)
        Glide.with(context)
                .setDefaultRequestOptions(options)
                .load(url)
                .into(imageView)
    }
}