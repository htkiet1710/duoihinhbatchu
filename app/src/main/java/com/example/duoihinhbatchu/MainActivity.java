package com.example.duoihinhbatchu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.example.duoihinhbatchu.api.LayCauHoi;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        new LayCauHoi().execute();
    }

    public void choiGame(View view) {
        if (DATA.getData().arrCauDo.size()>0){
            startActivity(new Intent(this,ChoiGameActivity.class));
        }
    }
}