package com.example.a5735512043.obesity;

import android.view.View;
import android.view.animation.RotateAnimation;
import android.widget.ImageView;
import android.widget.TextView;

import com.thoughtbot.expandablerecyclerview.viewholders.ChildViewHolder;

import static android.view.animation.Animation.RELATIVE_TO_SELF;

/**
 * Created by 5735512043 on 5/4/2019.
 */

public class ProductViewHolder extends ChildViewHolder {
    private TextView mTextView;

    public ProductViewHolder(View itemView) {
        super(itemView);

        mTextView = itemView.findViewById(R.id.tvprodect);
    }

    public void bind (Company company){
        mTextView.setText(company.getTitle());

    }

    public void bind(Product product ){
        mTextView.setText(product.name);
    }

}
