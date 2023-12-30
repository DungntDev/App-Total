package com.example.firstandroid.tuan2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import com.example.firstandroid.R

class Tuan22LvMainActivity : AppCompatActivity() {
    var lv:ListView? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tuan22_lv_main)
        lv=findViewById(R.id.Tuan22Listview)
        //nguon du lieu
        val arr = arrayOf("item1","item2","so3","so4","so5","so6")
        //adapter
        val adapter=ArrayAdapter(this,
            android.R.layout.simple_expandable_list_item_1,arr)
        //hien thi len listview
        lv!!.setAdapter(adapter)
    }
}