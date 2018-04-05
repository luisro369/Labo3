package com.luisro00005513.labo3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //-----------------------------------
        final EditText edit = findViewById(R.id.Escribe);
        Button but = findViewById(R.id.Boton);

        but.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                Intent sendIntent = new Intent();
                sendIntent.setAction(Intent.ACTION_SEND);
                sendIntent.setType("text/plain");
                sendIntent.putExtra(Intent.EXTRA_TEXT, edit.getText().toString());

                if (sendIntent.resolveActivity(getPackageManager()) != null){
                    startActivity(sendIntent);
                }//if

            }//on click

        });//stonclickListener

    }
}
