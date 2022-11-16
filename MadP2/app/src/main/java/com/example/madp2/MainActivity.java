package com.example.madp2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    int player=1;
    public void load(View view){
        ImageView v=(ImageView)view;
        int tag=Integer.parseInt(v.getTag().toString());
        if(player==1){
            v.setImageResource(R.drawable.t);
            Toast.makeText(this,tag+""+"Tom",Toast.LENGTH_SHORT).show();
            player=0;
        }else{
            v.setImageResource(R.drawable.j);
            Toast.makeText(this,tag+""+"Jerry",Toast.LENGTH_SHORT).show();
            player=1;
        }
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}