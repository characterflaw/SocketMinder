package com.fultonroad.socketminder;

import android.content.Context;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.RadioButton;
import android.widget.TextView;

/**
 * Created by jeff.davey on 2/13/18.
 */

public class SocketsAdapter extends ArrayAdapter<String> {

    Context mContext;

    public SocketsAdapter(@NonNull Context context, @LayoutRes int resource, @NonNull String[] objects) {
        super(context, resource, objects);
        mContext = context;

    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        TextView tv;
        RadioButton rb;

        if (convertView == null) {
            convertView = LayoutInflater.from(mContext).inflate(R.layout.view_adapter_item, null, false);

            tv = (TextView) convertView.findViewById(R.id.label);
            rb = (RadioButton) convertView.findViewById(R.id.radio_button);
            tv.setText(getItem(position));

//            if (mSelectionModeEnabled) {
//                cb.setChecked(mListView.isItemChecked(position));
//                cb.setVisibility(View.VISIBLE);
//                tv.setTextSize(14);
//
//            } else {
//                tv.setTextSize(16);
//                cb.setVisibility(GONE);
//            }
//            return convertView;
        }

        return convertView;
    }
}

