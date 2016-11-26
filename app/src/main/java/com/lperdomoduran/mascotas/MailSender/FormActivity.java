package com.lperdomoduran.mascotas.MailSender;

import android.support.design.widget.TextInputEditText;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.lperdomoduran.mascotas.R;

public class FormActivity extends AppCompatActivity {

    TextInputEditText editName, editPhone, editMail, editDescription, editDate;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form);

        Toolbar action_bar = (Toolbar) findViewById(R.id.miActionBar);
        setSupportActionBar(action_bar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        //Inicializando los TextFields
        editName = (TextInputEditText) findViewById(R.id.tInUserName);
        editMail = (TextInputEditText) findViewById(R.id.tInEmail);
        editDescription = (TextInputEditText) findViewById(R.id.tInDescription);

        final Button send = (Button) this.findViewById(R.id.btn_next);
        send.setOnClickListener(new View.OnClickListener() {



            public void onClick(View v) {
                try {
                    GMailSender sender = new GMailSender("leonardop763@gmail.com",
                            "Diff(f(x));");
                    sender.sendMail("Coments", editName.getText().toString() +  "," + editDescription.getText().toString(),
                            "leonardop763@gmail.com", editMail.getText().toString());
                    Toast.makeText(FormActivity.this, "Mail Send Successfully.....", Toast.LENGTH_LONG).show();
                } catch (Exception e) {
                    Log.e("SendMail", e.getMessage(), e);
                }

            }
        });

    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home: //hago un case por si en un futuro agrego mas opciones
                Log.i("ActionBar", "Atrás!");
                finish();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}
