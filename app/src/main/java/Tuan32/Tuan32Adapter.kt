package Tuan32

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView
import com.example.firstandroid.R
import com.example.firstandroid.Tuan31.ViewAX

class Tuan32Adapter(context: Context,ls:ArrayList<Tuan32Contact>): BaseAdapter() {
    var ls:ArrayList<Tuan32Contact> = ls
    var context: Context = context

    //lay ve tong so item
    override fun getCount(): Int {
        return ls.size
    }
    //lay ve item hien tai
    override fun getItem(position: Int): Any {
        return ls.get(position)
    }
    //lay ve id cua item
    override fun getItemId(position: Int): Long {
        return position.toLong()
    }
    //tao view
    //gan du lieu cho view
    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        var c = convertView
        //1.tao view
        var vax: ViewAX
         //1.1.Neu chua co view-> tao view moi
        if(convertView==null)
        {
            vax=ViewAX()//tao view moi
            //Tao layout
            c=LayoutInflater.from(context).inflate(R.layout.tuan32_item_view,null)
            //anh xa tung thanh phan cua layout
            vax.img_hinh=c.findViewById(R.id.tuan32ItemHinh)
            vax.tv_ten=c.findViewById(R.id.tuan32ItemTen)
            vax.tv_tuoi=c.findViewById(R.id.tuan32ItemTuoi)
            //tao template de lam sau su dung
            c.tag=vax
        }
         //1.2.Neu da co view -> su dung view cu
        else
        {
            vax=c!!.tag as ViewAX
        }
         //2.Gan du lieu cho view
        vax.img_hinh!!.setImageResource(ls[position].hinh!!)
        vax.tv_ten!!.text=ls[position].ten!!
        vax.tv_tuoi!!.text=ls[position].tuoi!!
        return  c!!

    }
    //khai bao anh xa Itemview
    inner class ViewAX{
        var img_hinh:ImageView? = null
        var tv_ten: TextView? = null
        var tv_tuoi: TextView? = null
    }
}