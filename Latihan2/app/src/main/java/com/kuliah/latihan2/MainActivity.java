package com.kuliah.latihan2;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import androidx.appcompat.app.AppCompatActivity;

import com.kuliah.latihan2.personal;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Tombol pindah ke halaman personal
        ImageButton button1 = findViewById(R.id.button1);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, personal.class);
                startActivity(intent);
            }
        });

        // Tombol buka Instagram
        ImageButton button2 = findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String linkedinUrl = "https://www.linkedin.com/in/vargalangit";
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(linkedinUrl));
                intent.setPackage("com.linkedin.android");
                startActivity(intent);

            }
        });

        // Tombol buka LinkedIn
        ImageButton button3 = findViewById(R.id.button3);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String instagramUrl = "https://www.instagram.com/vargalangit";
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(instagramUrl));
                intent.setPackage("com.instagram.android");
                startActivity(intent);
            }
        });
    }
}
