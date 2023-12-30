package com.example.firstandroid.tuan2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import com.example.firstandroid.R

class Tuan22KlMainActivity : AppCompatActivity() {
    var txt1: EditText? = null
    var txt2: EditText? = null
    var btn1: Button? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tuan22_kl_main)
        txt1=findViewById(R.id.Tuan22KlTxt1)
        txt2=findViewById(R.id.Tuan22KlTxt2)
        btn1=findViewById(R.id.Tuan22KlBtn1)
        btn1!!.setOnClickListener(View.OnClickListener {
             var i=Intent(this@Tuan22KlMainActivity,
                 Tuan22KlSecondMainActivity::class.java)
            i.putExtra("so1",txt1!!.text.toString())
            i.putExtra("so2",txt2!!.text.toString())
            startActivity(i)
        })
    }

}