package com.rnnativemoduletest;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.facebook.react.common.MapBuilder;
import com.facebook.react.module.annotations.ReactModule;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.ViewGroupManager;

import java.util.Map;

@ReactModule(name = OnChangeFocusViewManager.REACT_CLASS)
public class OnChangeFocusViewManager extends ViewGroupManager<OnChangeFocusView> {
    public static final String REACT_CLASS = "OnChangeFocusView";

    @Override
    @NonNull
    public String getName() {
        return REACT_CLASS;
    }

    @Override
    @NonNull
    public OnChangeFocusView createViewInstance(@NonNull ThemedReactContext context) {
        return new OnChangeFocusView(context);
    }

    @Override
    public @Nullable
    Map<String, Object> getExportedCustomDirectEventTypeConstants() {
        return MapBuilder.of(
                "onFocus",
                MapBuilder.of("phasedRegistrationNames", "onFocus"),
                "onBlur",
                MapBuilder.of("phasedRegistrationNames", "onBlur"));
    }
}
