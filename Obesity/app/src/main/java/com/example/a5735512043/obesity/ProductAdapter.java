package com.example.a5735512043.obesity;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.thoughtbot.expandablerecyclerview.ExpandableRecyclerViewAdapter;
import com.thoughtbot.expandablerecyclerview.models.ExpandableGroup;

import java.util.List;

/**
 * Created by 5735512043 on 5/4/2019.
 */

public class ProductAdapter extends ExpandableRecyclerViewAdapter <CompanyViewHolder, ProductViewHolder>{
    public ProductAdapter(List<? extends ExpandableGroup> groups) {
        super(groups);
    }

    @Override
    public CompanyViewHolder onCreateGroupViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.recyclerview_company,parent,false);
        return new CompanyViewHolder(v);
    }

    @Override
    public ProductViewHolder onCreateChildViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.recyclerview_product,parent,false);
        return new ProductViewHolder(v);
    }

    @Override
    public void onBindChildViewHolder(ProductViewHolder holder, int flatPosition, ExpandableGroup group, int childIndex) {

        final Product product = (Product) group.getItems().get(childIndex);
        holder.bind(product);
    }

    @Override
    public void onBindGroupViewHolder(CompanyViewHolder holder, int flatPosition, ExpandableGroup group) {

        final Company company = (Company)group;
        holder.bind(company);
    }
}
