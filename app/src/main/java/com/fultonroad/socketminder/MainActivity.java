package com.fultonroad.socketminder;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void onClick(View view) {
        Intent intent = new Intent(MainActivity.this, PointsActivity.class);
        if (view.getId() == R.id.btnStandard) {
            intent.putExtra("is-standard", true);
        } else {
            intent.putExtra("is-standard", false);
        }
        startActivity(intent);
    }

}
