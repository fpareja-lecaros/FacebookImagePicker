package com.mbieniek.facebookimagepicker.facebook.util

import android.content.Context
import android.graphics.drawable.Drawable
import android.widget.ImageView
import com.mbieniek.facebookimagepicker.facebook.FacebookImagePickerSettings

fun loadImage(context: Context, url: String, imageView: ImageView, placeholder: Drawable? = null) {
    when {
        FacebookImagePickerSettings.glideAvailable -> {
            GlideImageLoader.loadImage(context, url, imageView, placeholder)
        }
        FacebookImagePickerSettings.picassoAvailable -> {
            PicassoImageLoader.loadImage(context, url, imageView, placeholder)
        }
        else -> throw RuntimeException("No Image Loading Library Detected")
    }
}

fun loadImage(context: Context, url: String, imageView: ImageView, placeholder: Int) {
    when {
        FacebookImagePickerSettings.glideAvailable -> {
            GlideImageLoader.loadImage(context, url, imageView, placeholder)
        }
        FacebookImagePickerSettings.picassoAvailable -> {
            PicassoImageLoader.loadImage(context, url, imageView, placeholder)
        }
        else -> throw RuntimeException("No Image Loading Library Detected")
    }
}