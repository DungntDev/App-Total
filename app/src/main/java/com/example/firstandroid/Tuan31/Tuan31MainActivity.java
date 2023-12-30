package com.example.firstandroid.Tuan31;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import com.example.firstandroid.R;

import java.util.ArrayList;

public class Tuan31MainActivity extends AppCompatActivity {
    ListView lv;
    T31Adapter adapter;
    ArrayList<T31Contact> ls=new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tuan31_main);
        lv=findViewById(R.id.Tuan31Lv);
        //tao nguon du lieu
        ls.add(new T31Contact("Nguyen Van A","18",R.drawable.ic_launcher_background));
        ls.add(new T31Contact("Nguyen Van B","19",R.drawable.ic_launcher_background));
        ls.add(new T31Contact("Nguyen Van C","20",R.drawable.ic_launcher_background));
        ls.add(new T31Contact("Nguyen Thi D","21",R.drawable.ic_launcher_background));
        ls.add(new T31Contact("Nguyen Thi E","22",R.drawable.ic_launcher_background));
        ls.add(new T31Contact("Nguyen Thi F","23",R.drawable.ic_launcher_background));
        //tao adapter
        adapter=new T31Adapter(ls,this);
        lv.setAdapter(adapter);
    }
}