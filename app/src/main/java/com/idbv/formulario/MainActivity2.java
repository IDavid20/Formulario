package com.idbv.formulario;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        final String NOMBRE = getIntent().getStringExtra("EXTRA_FORM_DATA_NAME");
        final String DIA = getIntent().getStringExtra("EXTRA_FORM_DATA_BIRTH_DAY");
        final String MES = getIntent().getStringExtra("EXTRA_FORM_DATA_BIRTH_MONTH");
        final String YEAR = getIntent().getStringExtra("EXTRA_FORM_DATA_BIRTH_YEAR");
        final String TEL = getIntent().getStringExtra("EXTRA_FORM_DATA_PHONE");
        final String EMAIL = getIntent().getStringExtra("EXTRA_FORM_DATA_EMAIL");
        final String DESCRIP = getIntent().getStringExtra("EXTRA_FORM_DATA_DESCRIPTION");
        String data = NOMBRE +
                "\nFecha de Nacimiento: " + DIA + "/" + MES + "/" + YEAR +
                "\nTel: " + TEL +
                "\nEmail: " + EMAIL +
                "\nDescripción: " + DESCRIP;
        TextView confirmarDatosTextView = findViewById(R.id.form_data);
        confirmarDatosTextView.setText(data);

        Button boton = findViewById(R.id.edit_button);
        boton.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers category is clicked on.
            @Override
            public void onClick(View view) {
                MainActivity2.this.finish();
//                // Create a new intent to open the {@link NumbersActivity}
//                Intent prevActivityIntent = new Intent(Intent.ACTION_MAIN);
//                // Start the new activity
//                startActivity(prevActivityIntent);
            }
        });
    }
}