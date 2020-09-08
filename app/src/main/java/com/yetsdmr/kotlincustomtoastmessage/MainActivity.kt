package com.yetsdmr.kotlincustomtoastmessage

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Gravity
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.custom_toast.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

       val customLayout = layoutInflater.inflate(R.layout.custom_toast,toast_layout)

        button.setOnClickListener {
            val toast = Toast(this)
            toast.duration = Toast.LENGTH_SHORT
            toast.setGravity(Gravity.CENTER_VERTICAL,0,0)
            toast.view = customLayout
            toast.show()
        }
    }
}