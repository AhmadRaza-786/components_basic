package com.example.componentsbasic;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private TextView resultText;
    private EditText editName;
    private EditText editEmail;

    private CheckBox checkWhite;
    private CheckBox checkBlack;
    private CheckBox checkRed;

    private RadioButton radioMale, radioFemale;
    private RadioGroup mRadioGroup;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editName = findViewById(R.id.editName);
        editEmail = findViewById(R.id.editEmail);
        resultText = findViewById(R.id.resultText);

        checkWhite = findViewById(R.id.checkWhite);
        checkBlack = findViewById(R.id.checkBlack);
        checkRed = findViewById(R.id.checkRed);

        radioMale = findViewById(R.id.radioMale);
        radioFemale = findViewById(R.id.radioFemale);

        mRadioGroup = findViewById(R.id.radioGroupGender);
        radioButton();

    }

    public void radioButton() {
//        String text = "";
//        if (radioMale.isChecked()) {
//            text = "Radio male is check";
//        }
//        if (radioFemale.isChecked()) {
//            text = "Radio female is check";
//        }
//        resultText.setText(text);
        mRadioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (i == R.id.radioMale) {
                    resultText.setText("Male");
                } else if (i == R.id.radioFemale) {
                    resultText.setText("Female");
                }
            }
        });
    }

    public void checkBox() {
//        String text = "";
//        if (checkWhite.isChecked()) {
//            text = "White is checked";
//        }
//        if (checkBlack.isChecked()) {
//            text = "Black is checked";
//        }
//        if (checkRed.isChecked()) {
//            text = "Red is checked";
//        }
//        resultText.setText(text);
    }

    public void send(View view) {
       // checkBox();
//        radioButton();

//        String date = "Your name " + editName.getText() + " your email " + editEmail.getText().toString();
//        resultText.setText(date);
    }
}