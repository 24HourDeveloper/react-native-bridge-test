package com.moduletest;

import android.content.Context;
import android.graphics.Color;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReactContext;

public class BulbView extends android.support.v7.widget.AppCompatButton {

    //create boolean to switch button off and on
    public Boolean isOn = false;

    public BulbView(Context context){
        super(context);
        this.setTextColor(Color.BLUE);
        this.setTextSize(25);
        this.setOnClickListener(changeStatusListener);
        updateButton();
    }

    public BulbView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public BulbView(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
    }

    public void setIsOn (Boolean initialBulbStatus){
        isOn = initialBulbStatus;
        updateButton();
    }

    private OnClickListener changeStatusListener = new OnClickListener() {
        @Override
        public void onClick(View view) {
            isOn = !isOn;
            updateButton();
        }
    };

    private void updateButton(){
        if(isOn){
            this.setTextColor(Color.YELLOW);
            this.setText("Switch Off");
        }else{
            this.setTextColor(Color.RED);
            this.setText("Switch On");
        }
    }
}
