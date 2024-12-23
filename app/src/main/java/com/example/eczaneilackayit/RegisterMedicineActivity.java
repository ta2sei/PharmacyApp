package com.example.eczaneilackayit;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import androidx.appcompat.app.AppCompatActivity;

public class RegisterMedicineActivity extends AppCompatActivity {

    private EditText medicineNameEditText;
    private EditText medicineBrandEditText;
    private Button saveMedicineButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register_medicine);

        medicineNameEditText = findViewById(R.id.medicine_name);
        medicineBrandEditText = findViewById(R.id.medicine_brand);
        saveMedicineButton = findViewById(R.id.save_medicine_button);

        saveMedicineButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // İlaç kaydetme işlemi
                String medicineName = medicineNameEditText.getText().toString();
                String medicineBrand = medicineBrandEditText.getText().toString();

                // Veritabanına kaydetme işlemi burada yapılacak
            }
        });
    }
}
