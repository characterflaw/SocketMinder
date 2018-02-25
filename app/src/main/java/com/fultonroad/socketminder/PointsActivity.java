package com.fultonroad.socketminder;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class PointsActivity extends AppCompatActivity {

    private boolean mIsStandard;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_points);
        mIsStandard = getIntent().getBooleanExtra("is-standard", true);
        System.out.println();
    }

    public void onClick(View view) {
        Intent intent = new Intent(PointsActivity.this, DriveActivity.class);
        intent.putExtra("is-standard", mIsStandard);

        if (view.getId() == R.id.btnPoints6) {
            intent.putExtra("points", 6);
        } else {
            intent.putExtra("points", 12);
        }

        startActivity(intent);
    }

}
