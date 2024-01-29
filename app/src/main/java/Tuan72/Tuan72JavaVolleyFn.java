package Tuan72;

import android.content.Context;
import android.view.PixelCopy;
import android.widget.TextView;

import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonArrayRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class Tuan72JavaVolleyFn {
    String strJSON="";
    public  void getJsonArrayOfObject(Context context, TextView textView)
    {
        //1. Tao request
        RequestQueue queue=Volley.newRequestQueue(context);
        //2. Url
         String url="http://192.168.1.63/ajson/a.json";
        //3. Goi Request
        //JsonArrayRequest(url, thanhCong, ThatBai)
        JsonArrayRequest request=new JsonArrayRequest(url,
                new Response.Listener<JSONArray>() {
                    @Override
                    public void onResponse(JSONArray response) {
                        //chuyen mang sang cac doi tuong
                        for (int i=0;i<response.length();i++)
                        {
                            try {
                                JSONObject person=response.getJSONObject(i);//lay tung doi tuong
                                String id= person.getString("id");//Lay ve id
                                String name=person.getString("name");//Lay ve name
                                String email=person.getString("email");//Lay email
                                //
                                strJSON +="Id: "+id+"\n";
                                strJSON +="name: "+name+"\n";
                                strJSON +="email: "+email+"\n";
                            } catch (JSONException e) {
                                throw new RuntimeException(e);
                            }
                            textView.setText(strJSON);
                        }
                    }
                }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                textView.setText(error.getMessage());
            }
        });
        //4. Thuc thi request
        queue.add(request);
    }
}
