package com.example.starbuzz

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_drink.*

data class Drink(val name:String, val description:String, val imageResourceId:Int)
val drinkmsg = arrayOf(Drink("Latte","A couple of espresso shots with steamed milk",R.drawable.latte),
    Drink("Cappuccino","Espresso,hot milk,and a steamed milk foam",R.drawable.cappuccino),
    Drink("Filter","Highest quality beans roasted and brewed fresh",R.drawable.filter))

class DrinkActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_drink)
        val intent2 = getIntent()
        val index = intent2.getIntExtra(EXTRA_DRINKID,0)
        photo.setImageResource(drinkmsg[index].imageResourceId)
        name.text = drinkmsg[index].name
        description.text = drinkmsg[index].description
    }
}
