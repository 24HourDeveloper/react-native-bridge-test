package com.moduletest;

import android.content.Context;
import android.graphics.Color;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReactContext;

public class BulbView extends android.support.v7.widget.AppCompatButton {

    public BulbView(Context context){
        super(context);
        this.setTextColor(Color.RED);
        this.setText("Java Button");
    }

    public BulbView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public BulbView(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
    }
}
