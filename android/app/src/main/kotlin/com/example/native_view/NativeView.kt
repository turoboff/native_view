package com.example.native_view

import android.content.Context
import android.graphics.Color
import android.view.LayoutInflater
import android.view.View
import android.widget.TextView
import io.flutter.plugin.platform.PlatformView

internal class NativeView(context: Context, id: Int, creationParams: Map<String?, Any?>?) : PlatformView {
    private val view: View


    override fun getView(): View {
        return view
    }

    override fun dispose() {}

    init {
        view = LayoutInflater.from(context).inflate(R.layout.native_view, null)
    }
}