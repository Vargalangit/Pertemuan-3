package com.kuliah.belajarintent;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button pindah1, pindah2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        pindah1 = findViewById(R.id.pindah1);
        pindah2 = findViewById(R.id.pindah2);
        pindah1.setOnClickListener(this);
        pindah2.setOnClickListener(this);

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.pindah1) {
            Intent intent = new Intent(this, halaman2.class);
            startActivity(intent);
        } else if (v.getId() == R.id.pindah2) {
            Intent intent2 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.instagram.com/vargalangit/"));
            startActivity(intent2);
        }
    }
}