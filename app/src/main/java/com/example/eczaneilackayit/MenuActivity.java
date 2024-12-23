package com.example.eczaneilackayit;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class MenuActivity extends AppCompatActivity {

    private Button registerMedicineButton;
    private Button searchMedicineButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        registerMedicineButton = findViewById(R.id.register_medicine_button);
        searchMedicineButton = findViewById(R.id.search_medicine_button);

        registerMedicineButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MenuActivity.this, RegisterMedicineActivity.class);
                startActivity(intent);
            }
        });

        searchMedicineButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MenuActivity.this, SearchMedicineActivity.class);
                startActivity(intent);
            }
        });
    }
}