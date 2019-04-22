package com.moduletest;

import com.facebook.react.uimanager.SimpleViewManager;
import com.facebook.react.uimanager.ThemedReactContext;

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
}
