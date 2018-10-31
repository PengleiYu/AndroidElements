package com.example.penglei.elements

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.ArrayAdapter
import android.widget.ListView
import com.example.penglei.elements.loader.LoaderActivity

class MainActivity : AppCompatActivity() {
    private val map: Map<String, Class<*>> = mapOf(
            "Fragment" to FragmentTestActivity::class.java
            , "CursorAdapter" to CursorActivity::class.java
            , "Loader" to LoaderActivity::class.java
    )
    private val list: List<String>
        get() = map.keys.toList()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val listView = ListView(this)
        setContentView(listView)
        listView.adapter = ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, list)
        listView.setOnItemClickListener { parent, view, position, id ->
            startActivity(Intent(this, map[list[position]]))
        }
    }
}
