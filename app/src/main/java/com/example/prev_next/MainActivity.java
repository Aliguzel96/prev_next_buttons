package com.example.prev_next;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity implements  View.OnClickListener{
    Button btnprev, btnext;
    ImageView imageView;
    public int i=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnprev=findViewById(R.id.btnpre);
        btnext=findViewById(R.id.btnext);

        btnprev.setOnClickListener(this);
        btnext.setOnClickListener(this);

    }
    @Override
    public void onClick(View v){
        switch (v.getId()){
            case R.id.btnpre:
            i++;

            if(i==4){
                i=3;
            }
            ResimDegistir();
            break;
            case R.id.btnext:
            i--;

            if (i==-1)
            {
                i=0;
            }
            ResimDegistir();
            break;
        }
    }
    public void ResimDegistir(){
        imageView=findViewById(R.id.imageView);
        switch(i)
        {
            case 0:
            imageView.setImageResource(R.drawable.kylie);
            break;
            case 1:
            imageView.setImageResource(R.drawable.stan);
            break;
            case 2:
            imageView.setImageResource(R.drawable.cartman);
            break;
            case 3:
            imageView.setImageResource(R.drawable.kenny);
        }
    }
}