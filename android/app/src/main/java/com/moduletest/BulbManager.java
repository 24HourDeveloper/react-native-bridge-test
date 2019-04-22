package com.moduletest;

import com.facebook.react.uimanager.SimpleViewManager;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.annotations.ReactProp;

import javax.annotation.Nonnull;

public class BulbManager extends SimpleViewManager<BulbView> {

    @Nonnull
    @Override
    public String getName() {
        return "Bulb";
    }

    @Nonnull
    @Override
    protected BulbView createViewInstance(@Nonnull ThemedReactContext reactContext) {
        return new BulbView(reactContext);
    }

    @ReactProp(name="isOn")
    public void setBulbStatus(BulbView bulbView, Boolean isOn) {
        bulbView.setIsOn(isOn);
    }
}
