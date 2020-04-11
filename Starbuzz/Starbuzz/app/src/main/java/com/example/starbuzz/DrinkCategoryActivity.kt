package com.example.starbuzz

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import kotlinx.android.synthetic.main.activity_drink_category.*


val drinks = arrayOf("Latte","Cappuccino","Filter")
const val EXTRA_DRINKID = "drinkid"
class DrinkCategoryActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_drink_category)
        var arrayAdapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, drinks)
        list_drinks.adapter = arrayAdapter
        list_drinks.setOnItemClickListener { adapterView, view, position, id ->
            val intent1 = Intent(this,DrinkActivity::class.java)
            intent1.putExtra(EXTRA_DRINKID,id.toInt())
            startActivity(intent1)
        }
    }
}
