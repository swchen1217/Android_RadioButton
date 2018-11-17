package com.example.student.android_radiobbutton;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView tv;
    Button btn;
    RadioButton rb1;
    RadioButton rb2;
    RadioButton rb3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rb1 = (RadioButton) findViewById(R.id.rb1);
        rb1.setOnClickListener(listener);
        rb2 = (RadioButton) findViewById(R.id.rb2);
        rb2.setOnClickListener(listener);
        rb3 = (RadioButton) findViewById(R.id.rb3);
        rb3.setOnClickListener(listener);
    }
    RadioButton.OnClickListener listener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            RadioButton tmp = (RadioButton) findViewById(v.getId());
            btn.setText(tmp.getText().toString());
        }
    };
}
