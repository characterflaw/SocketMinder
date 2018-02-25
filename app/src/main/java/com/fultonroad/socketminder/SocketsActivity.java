package com.fultonroad.socketminder;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class SocketsActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {

    private boolean mIsStandard;
    private int mPoints;
    private int mDrive;
    SocketsAdapter mAdapter;
    ListView mListView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sockets);

        mListView = (ListView)findViewById(R.id.list_view);

        mListView.setOnItemClickListener(this);

        mIsStandard = getIntent().getBooleanExtra("is-standard", true);
        mPoints = getIntent().getIntExtra("points", 6);
        mDrive = getIntent().getIntExtra("drive", 14);

        if (mIsStandard) {
            if (mPoints == 6) {
                if (mDrive == 14) {
                    mAdapter = new SocketsAdapter(this, R.layout.list_element, getResources().getStringArray(R.array.standard_14_drive_6_point));

                } else if (mDrive == 38) {
                    mAdapter = new SocketsAdapter(this, R.layout.list_element, getResources().getStringArray(R.array.standard_38_drive_6_point));

                } else {    //  drive == 1/2
                    mAdapter = new SocketsAdapter(this, R.layout.list_element, getResources().getStringArray(R.array.standard_12_drive_6_point));

                }
            } else {    //  points == 12
                if (mDrive == 14) {
                    mAdapter = new SocketsAdapter(this, R.layout.list_element, getResources().getStringArray(R.array.standard_14_drive_12_point));

                } else if (mDrive == 38) {
                    mAdapter = new SocketsAdapter(this, R.layout.list_element, getResources().getStringArray(R.array.standard_38_drive_12_point));

                } else {    //  drive == 1/2
                    mAdapter = new SocketsAdapter(this, R.layout.list_element, getResources().getStringArray(R.array.standard_12_drive_12_point));

                }
            }
        } else {
            if (mPoints == 6) {
                if (mDrive == 14) {
                    mAdapter = new SocketsAdapter(this, R.layout.list_element, getResources().getStringArray(R.array.metric_14_drive_6_point));

                } else if (mDrive == 38) {
                    mAdapter = new SocketsAdapter(this, R.layout.list_element, getResources().getStringArray(R.array.metric_38_drive_6_point));

                } else {    //  drive == 1/2
                    mAdapter = new SocketsAdapter(this, R.layout.list_element, getResources().getStringArray(R.array.metric_12_drive_6_point));

                }
            } else {    //  points == 12
                if (mDrive == 14) {
                    mAdapter = new SocketsAdapter(this, R.layout.list_element, getResources().getStringArray(R.array.metric_14_drive_12_point));

                } else if (mDrive == 38) {
                    mAdapter = new SocketsAdapter(this, R.layout.list_element, getResources().getStringArray(R.array.metric_38_drive_12_point));

                } else {    //  drive == 1/2
                    mAdapter = new SocketsAdapter(this, R.layout.list_element, getResources().getStringArray(R.array.metric_12_drive_12_point));

                }
            }
        }

        mListView.setAdapter(mAdapter);
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        System.out.println();
    }
}
