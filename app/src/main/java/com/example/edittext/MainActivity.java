package com.example.edittext;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    Button btn;
    EditText eT;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        eT=(EditText)findViewById(R.id.Et);
        btn=findViewById(R.id.btn);
    }

    public void Clicked(View view) {
        String st =eT.getText().toString();
        int ans = Integer.parseInt(st);
        if(ans%7==0){
            btn.setText("boom!");

        }
        else{
            btn.setText(Integer.toString(ans));
        }
    }
}