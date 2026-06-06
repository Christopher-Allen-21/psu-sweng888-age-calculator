package com.example.agecalculator;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class MainActivity extends AppCompatActivity {

    private EditText mFirstName;
    private EditText mLastName;
    private EditText mDateOfBirth;
    private Button mCaculateAgeButton;
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
        mDateOfBirth = findViewById(R.id.date_of_birth);
        mCaculateAgeButton = findViewById(R.id.calculate_age_button);
        mResultAge = findViewById(R.id.result_age);

        mCaculateAgeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String dobText = mDateOfBirth.getText().toString();

                try {
                    int age = calculateAge(dobText);

                    String resultAgeText =
                            mFirstName.getText().toString() + " " +
                                    mLastName.getText().toString() +
                                    " is " + age + " years old.";

                    mResultAge.setText(resultAgeText);
                    mResultAge.setVisibility(View.VISIBLE);
                }
                catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });

    }

    public int calculateAge(String dobText) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy", Locale.US);

        Date dateOfBirth = sdf.parse(dobText);

        Calendar dob = Calendar.getInstance();
        dob.setTime(dateOfBirth);

        Calendar today = Calendar.getInstance();

        int age = today.get(Calendar.YEAR) - dob.get(Calendar.YEAR);

        if (today.get(Calendar.DAY_OF_YEAR) < dob.get(Calendar.DAY_OF_YEAR)) {
            age--;
        }

        return age;
    }
}