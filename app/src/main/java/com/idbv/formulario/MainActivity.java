package com.idbv.formulario;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.DatePicker;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void summit(View v){
        EditText nombre = findViewById(R.id.editTextTextPersonName);
        DatePicker birthday = findViewById(R.id.date);
        EditText telefono = findViewById(R.id.editTextPhone);
        EditText email = findViewById(R.id.editTextTextEmailAddress);
        EditText descripcion = findViewById(R.id.editTextTextMultiLine);

        Intent nextActivity = new Intent(MainActivity.this, MainActivity2.class);
        nextActivity.putExtra("EXTRA_FORM_DATA_NAME", nombre.getText().toString());
        nextActivity.putExtra("EXTRA_FORM_DATA_BIRTH_DAY", String.valueOf(birthday.getDayOfMonth()));
        nextActivity.putExtra("EXTRA_FORM_DATA_BIRTH_MONTH", String.valueOf(birthday.getMonth()));
        nextActivity.putExtra("EXTRA_FORM_DATA_BIRTH_YEAR", String.valueOf(birthday.getYear()));
        nextActivity.putExtra("EXTRA_FORM_DATA_PHONE", telefono.getText().toString());
        nextActivity.putExtra("EXTRA_FORM_DATA_EMAIL", email.getText().toString());
        nextActivity.putExtra("EXTRA_FORM_DATA_DESCRIPTION", descripcion.getText().toString());
        startActivity(nextActivity);
    }
}