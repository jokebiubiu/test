package com.example.starbuzz

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.ViewGroup
import android.widget.AdapterView
import android.widget.BaseAdapter
import android.widget.ListAdapter
import android.widget.ListView
import androidx.core.view.get
import androidx.core.view.size
import kotlinx.android.synthetic.main.activity_top_level.*


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_top_level)
        list_options.setOnItemClickListener { adapterView, view, position, id ->
            if(position == 0){
                val intent = Intent(this,DrinkCategoryActivity::class.java)
                startActivity(intent)
            }
        }
    }
}




