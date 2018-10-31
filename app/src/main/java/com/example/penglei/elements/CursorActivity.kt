package com.example.penglei.elements

import android.os.Bundle
import android.widget.Button
import kotlinx.android.synthetic.main.activity_cursor.*

class CursorActivity : BaseActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cursor)
        val btn1 = Button(this).apply {
            text = "Hello"
        }
        container_cursor.addView(btn1)
    }
}