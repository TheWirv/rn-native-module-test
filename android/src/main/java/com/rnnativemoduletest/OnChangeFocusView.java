package com.rnnativemoduletest;

import android.content.Context;
import android.view.View;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.RCTEventEmitter;
import com.facebook.react.views.view.ReactViewGroup;

public class OnChangeFocusView extends ReactViewGroup implements View.OnFocusChangeListener {
    public OnChangeFocusView(Context context) {
        super(context);
    }

    private void dispatchOnBlur() {
        WritableMap event = Arguments.createMap();
        ReactContext reactContext = (ReactContext) getContext();
        reactContext.getJSModule(RCTEventEmitter.class).receiveEvent(getId(), "onBlur", event);
    }

    private void dispatchOnFocus() {
        WritableMap event = Arguments.createMap();
        ReactContext reactContext = (ReactContext) getContext();
        reactContext.getJSModule(RCTEventEmitter.class).receiveEvent(getId(), "onFocus", event);
    }

    @Override
    public void onFocusChange(View v, boolean hasFocus) {
        if (hasFocus) {
            dispatchOnFocus();
        } else {
            dispatchOnBlur();
        }
    }
}
