package com.blogspot.yourfavoritekaisar.dzikirpagisenja;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class dzikirPagi_activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dzikir_pagi_activity);
    }

    public void dkrPagi(View view) {
        Intent pindah = new Intent(this, isiDzikirMorn_activity.class);
        startActivity(pindah);
    }


    public void dkrSenja(View view) {
        Intent pindah = new Intent(this, IsiDzkrSenjaActivity.class);
    }
}


