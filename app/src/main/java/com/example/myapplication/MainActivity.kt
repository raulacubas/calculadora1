package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    var res: Int = 0
    var resdiv: Float = 0.000000f

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        suma()
        resta()
        multi()
        division()

    }

    fun suma() {
        btnsum.setOnClickListener {
            res = num1.text.toString().toInt() + num2.text.toString().toInt()
            textres.text = res.toString()
        }
    }

    fun resta() {
        btnres.setOnClickListener {
            res = num1.text.toString().toInt() - num2.text.toString().toInt()
            textres.text = res.toString()
        }

    }

    fun multi() {
        btnmul.setOnClickListener {
            res = (num1.text.toString().toInt()) * (num2.text.toString().toInt())
            textres.text = res.toString()

        }
    }

    fun division() {
        btndiv.setOnClickListener {
            resdiv = (num1.text.toString().toFloat()) / (num2.text.toString().toFloat())
            textres.text = resdiv.toString()
        }

    }

    }



