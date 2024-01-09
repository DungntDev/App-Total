package Tuan32

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView
import com.example.firstandroid.R

class Tuan32MainActivity : AppCompatActivity() {
    var adap:Tuan32Adapter? = null
    var ls:ArrayList<Tuan32Contact> = ArrayList()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tuan32_main)
        var lv=findViewById<ListView>(R.id.tuan32lv)//anh xa
        //tao nguon du lieu
        ls.add(Tuan32Contact("Nguyen Van A", "18", R.drawable.minho))
        ls.add(Tuan32Contact("Nguyen Van B", "19", R.drawable.chaeunwoo))
        ls.add(Tuan32Contact("Nguyen Van C", "20", R.drawable.songjoongki))
        ls.add(Tuan32Contact("Nguyen Van D", "21", R.drawable.seojun))
        ls.add(Tuan32Contact("Nguyen Van E", "22", R.drawable.huynbin))
        //gan vao adapter
        adap=Tuan32Adapter(this,ls)
        lv.adapter=adap
    }
}