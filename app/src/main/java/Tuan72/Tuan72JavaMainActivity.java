package Tuan72;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.firstandroid.R;

public class Tuan72JavaMainActivity extends AppCompatActivity {
    Button btnGetData;
    TextView tvKQ;
    Context context=this;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tuan72_java_main);
        Tuan72JavaVolleyFn volleyFn=new Tuan72JavaVolleyFn();
        tvKQ=findViewById(R.id.Tuan72JavaTvKQ);
        btnGetData=findViewById(R.id.Tuan72JavaBtn);
        btnGetData.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                volleyFn.getJsonArrayOfObject(context,tvKQ);
            }
        });
    }
}