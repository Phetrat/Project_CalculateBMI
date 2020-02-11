package com.example.a5735512043.obesity;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

/**
 * Created by 5735512043 on 2/17/2019.
 */

public class ViewHolder extends RecyclerView.ViewHolder {
    View mView;
    public ViewHolder(View itemView) {
        super(itemView);
        mView = itemView;

        //item click
        itemView.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                mClickListener.onItemClick(view,getAdapterPosition());
            }
        });
        //item long click
        itemView.setOnLongClickListener(new View.OnLongClickListener(){

            @Override
            public boolean onLongClick(View view) {
                mClickListener.onItemLongClick( view,getAdapterPosition());
                return true;
            }
        });
        //item click
//        itemView.setOnClickListener(new View.OnClickListener(){
//
//            @Override
//            public void onClick(View view) {
//                mClickListener.onItemClick(view,getAdapterPosition());
//            }
//        });
//        //item long click
//        itemView.setOnLongClickListener(new View.OnLongClickListener(){
//
//            @Override
//            public boolean onLongClick(View view) {
//                mClickListener.onItemLongClick( view,getAdapterPosition());
//                return true;
//            }
//        });
    }

    //set details to recyclerview row
    public void setDetais (Context ctx, String name, String description, String image){
        //views

        TextView mName = mView.findViewById(R.id.rNameTv);
        TextView mDetail = mView.findViewById(R.id.rDescriptionTv);
        ImageView mImage = mView.findViewById(R.id.rImageView);

        //set data to views
        mName.setText(name);
        mDetail.setText(description);
        //Picasso.get().load(image).into(mImage);
        Picasso.with(ctx).load(image).into(mImage);


    }
    private ViewHolder.ClickListener mClickListener;

    //inferface to send callback
    public interface  ClickListener{
        void onItemClick(View view, int position);
        void onItemLongClick(View view, int position);
    }

    public void setOnclickListener(ViewHolder.ClickListener clickListener){

        mClickListener = clickListener;
    }

}
