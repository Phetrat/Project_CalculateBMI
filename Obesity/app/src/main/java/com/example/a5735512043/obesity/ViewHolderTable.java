package com.example.a5735512043.obesity;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

/**
 * Created by 5735512043 on 4/14/2019.
 */

public class ViewHolderTable extends RecyclerView.ViewHolder {
    View mView;

    public ViewHolderTable(View itemView) {
        super(itemView);

        mView = itemView;
    }

    public void setDetails(Context ctx,String breakfast,String lunch,String dinner){
        //Views
       // TextView mDay = mView.findViewById(R.id.rtDayTv);
        TextView mBreakfast = mView.findViewById(R.id.rtBreakfastTv);
        TextView mLunch = mView.findViewById(R.id.rtLunchTv);
        TextView mDinner = mView.findViewById(R.id.rtDinnerTv);

        //set data views
       // mDay.setText(day);
        mBreakfast.setText(breakfast);
        mLunch.setText(lunch);
        mDinner.setText(dinner);
    }


}
