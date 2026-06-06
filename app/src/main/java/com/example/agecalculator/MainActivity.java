package com.example.agecalculator;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.Date;

public class MainActivity extends AppCompatActivity {

    private EditText mFirstName;
    private EditText mLastName;
    private EditText mAgeDateOfBirth;
    private Button mCaculateAge;
    private TextView mResultAge;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
//        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
//            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
//            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
//            return insets;
//        });

        mFirstName = findViewById(R.id.first_name);
        mLastName = findViewById(R.id.last_name);
        mAgeDateOfBirth = findViewById(R.id.date_of_birth);
        mCaculateAge = findViewById(R.id.calculate_age_button);
        mResultAge = findViewById(R.id.result_age);
    }

    public int calculateAge(Date dateOfBirth){
        return 0;
    }
}