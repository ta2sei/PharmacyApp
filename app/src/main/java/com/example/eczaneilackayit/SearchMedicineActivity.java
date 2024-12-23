package com.example.eczaneilackayit;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class SearchMedicineActivity extends AppCompatActivity {

    private EditText searchMedicineNameEditText;
    private Button searchButton;
    private TextView medicineBrandResultTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search_medicine);

        searchMedicineNameEditText = findViewById(R.id.search_medicine_name);
        searchButton = findViewById(R.id.search_button);
        medicineBrandResultTextView = findViewById(R.id.medicine_brand_result);

        searchButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // İlaç sorgulama işlemi
                String medicineName = searchMedicineNameEditText.getText().toString();

                // Veritabanından ilaç markasını sorgulama işlemi burada yapılacak
                // Örnek: String medicineBrand = database.getMedicineBrand(medicineName);
                //String medicineBrand = database.getMedicineBrand(medicineName);
                // Sonucu gösterme
                //String medicineBrand;
               // medicineBrandResultTextView.setText("Markası: " + medicineBrand);
                medicineBrandResultTextView.setVisibility(View.VISIBLE);
            }
        });
    }
}