package com.example.widgets;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button mainButton = findViewById(R.id.button);
        final CheckBox checkbox1 = findViewById(R.id.checkBox1);
        final CheckBox checkbox2 = findViewById(R.id.checkBox2);
        final CheckBox checkbox3 = findViewById(R.id.checkBox3);
        final CheckBox checkbox4 = findViewById(R.id.checkBox4);

        mainButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mainButton.setText("Confirmed");
                checkbox1.setChecked(false);
                checkbox2.setChecked(false);
                checkbox3.setChecked(false);
                checkbox4.setChecked(false);
                Log.d("==>","We clicked on button!");
            }
        });
    }
}
