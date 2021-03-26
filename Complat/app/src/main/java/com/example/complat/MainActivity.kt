package com.example.complat

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_rl.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_rl)

        val clickableViews: List<View> =
            listOf(summaPredOplat, priceTbo, minusHodka, relativeLayout)

        for (item in clickableViews) {
            item.setOnClickListener { payment(it) }
        }

        findViewById<Button>(R.id.raschet).setOnClickListener {
            payment(it)
        }
    }

    private fun payment(view: View) {
        //when(view:id) {
                val summaPredOplat =
                findViewById<EditText>(R.id.summaPredOplat).text.toString().toDouble()
            //var sPO =summaPredOplat.toInt()
                val priceTbo = findViewById<EditText>(R.id.priceTbo).text.toString().toDouble()
                val itogPay = findViewById<TextView>(R.id.itogPayShow)

            itogPay.text = (summaPredOplat / priceTbo).toString()
       // }
    }
}
