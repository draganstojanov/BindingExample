package com.example.bindingexample;

import android.content.Context;
import android.widget.TextView;

import androidx.core.content.ContextCompat;
import androidx.databinding.BindingAdapter;

public class BindingAdapters {


    @BindingAdapter("maliTest")
    public static void maliTestBindingAdaptera(TextView textView, String text) {

        //todo: ovde moze da se radi "svasta"

        Context context = textView.getContext();
        textView.setText(text);
        textView.setAllCaps(true);
        textView.setBackgroundColor(ContextCompat.getColor(context, android.R.color.black));
        textView.setTextColor(ContextCompat.getColor(context, android.R.color.white));
    }
}
