package com.example.a25_test;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText pass, log;
    Button btn;
    TextView txt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        pass= findViewById(R.id.pass);
        txt = findViewById(R.id.txt);
        btn = findViewById(R.id.btn);
        log= findViewById(R.id.log);
        View.OnClickListener listener=new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (v.getId()) {
                    case R.id.btn:
                if ( log.getText().toString().equals("log") && pass.getText().toString().equals("pass") ) {
                    txt.setTextColor(Color.rgb(0,255,0));
                    txt.setText("Верно");
                } else {
                    txt.setTextColor(Color.rgb(255,0,0));
                    txt.setText("Вы ошиблись в логине или пароле");
                    log.setText("");
                    pass.setText("");
                }
                break;
            }
            }
        };
        btn.setOnClickListener(listener);
    }
}
