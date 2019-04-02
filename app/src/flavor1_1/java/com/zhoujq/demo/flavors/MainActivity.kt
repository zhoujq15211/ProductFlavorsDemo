package com.zhoujq.demo.flavors

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.zhoujq.demo.flavor1.Test1
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val test1 = Test1()
        text.text = test1.getText()
    }
}
