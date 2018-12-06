package com.chestnut.sample.falvor.app;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.btn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                switch (BuildConfig.FLAVOR) {
                    case "A":
                        Toast.makeText(MainActivity.this, "A", Toast.LENGTH_SHORT).show();
                        break;
                    case "B":
                        Toast.makeText(MainActivity.this, "B", Toast.LENGTH_SHORT).show();
                        break;
                    case "C":
                        Toast.makeText(MainActivity.this, "C", Toast.LENGTH_SHORT).show();
                        break;
                    default:
                        Toast.makeText(MainActivity.this, "Default", Toast.LENGTH_SHORT).show();
                        break;
                }


            }
        });

    }
}
