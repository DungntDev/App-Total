package com.example.firstandroid.Tuan31;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.firstandroid.R;

import java.util.ArrayList;

public class T31Adapter extends BaseAdapter {
    private ArrayList<T31Contact> ls;
    private Context context;

    public T31Adapter(ArrayList<T31Contact> ls, Context context) {
        this.ls = ls;
        this.context = context;
    }
    //lay ve so luong item
    @Override
    public int getCount() {
        return ls.size();
    }
    //lay ve item
    @Override
    public Object getItem(int position) {
        return ls.get(position);
    }
    //lay ve id
    @Override
    public long getItemId(int position) {
        return position;
    }
    //tao view
    //gan du lieu
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        //b1-tao view
        ViewAX vax;
        //neu chua co view thi ta tao view moi
        if(convertView==null)
        {
            vax=new ViewAX();//tao view moi
            //anh xa layout
            convertView= LayoutInflater.from(context).inflate(R.layout.tuan31_listview_item,null);
            //anh xa tung thanh phan trong layout
            vax.img_hinh=convertView.findViewById(R.id.T31ItemHinh);
            vax.tv_ten=convertView.findViewById(R.id.T31ItemTen);
            vax.tv_tuoi=convertView.findViewById(R.id.T31ItemTuoi);
            //tao template de lan sau su dung
            convertView.setTag(vax);
        }
        //neu da co view -> su dung lai view cu
        else
        {
            vax=(ViewAX) convertView.getTag();//lay view cu
        }
        //gan du lieu cho layout
        vax.img_hinh.getResources();
        vax.tv_ten.setTextDirection(Integer.parseInt(ls.get(position).getTen()));
        vax.tv_tuoi.setTextDirection(Integer.parseInt(ls.get(position).getTuoi()));
        return convertView;//tra ve ket qua
    }
    //dinh nghia view
    class ViewDN{
        ImageView img_hinh;
        TextView tv_ten,tv_tuoi;
    }
}
