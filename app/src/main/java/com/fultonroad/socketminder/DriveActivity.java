package com.fultonroad.socketminder;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class DriveActivity extends AppCompatActivity {

    private boolean mIsStandard;
    private int mPoints;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_drive);
        mIsStandard = getIntent().getBooleanExtra("is-standard", true);
        mPoints =  getIntent().getIntExtra("points", 6);
    }

    public void onClick(View view) {
        Intent intent = new Intent(DriveActivity.this, SocketsActivity.class);
        intent.putExtra("is-standard", mIsStandard);
        intent.putExtra("points", mPoints);

        if (view.getId() == R.id.btnDrive14) {
            intent.putExtra("drive", 14);
        } else if (view.getId() == R.id.btnDrive38) {
            intent.putExtra("drive", 38);
        } else if (view.getId() == R.id.btnDrive12) {
            intent.putExtra("drive", 12);
        }

        startActivity(intent);
    }
}
