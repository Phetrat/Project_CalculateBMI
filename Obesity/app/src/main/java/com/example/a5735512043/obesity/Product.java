package com.example.a5735512043.obesity;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by 5735512043 on 5/3/2019.
 */

public class Product implements Parcelable {
   public final String name;

    public Product(String name) {
        this.name = name;
    }

    protected Product(Parcel in) {
        name = in.readString();
    }

    public static final Creator<Product> CREATOR = new Creator<Product>() {
        @Override
        public Product createFromParcel(Parcel in) {
            return new Product(in);
        }

        @Override
        public Product[] newArray(int size) {
            return new Product[size];
        }
    };

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(name);

    }
}
