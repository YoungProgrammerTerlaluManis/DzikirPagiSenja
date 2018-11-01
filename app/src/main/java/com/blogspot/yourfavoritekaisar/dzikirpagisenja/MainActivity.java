package com.blogspot.yourfavoritekaisar.dzikirpagisenja;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void btn_jalan(View view) {
        Intent pindah1 = new Intent(this, dzikirPagi_activity.class);
        startActivity(pindah1);
    }
}
