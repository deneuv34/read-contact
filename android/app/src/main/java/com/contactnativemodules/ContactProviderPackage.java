package com.contactnativemodules;

import android.app.Activity;

import com.facebook.react.uimanager.ViewManager;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.JavaScriptModule;
import com.facebook.react.ReactPackage;

import com.contactnativemodules.ContactProviderPackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class ContactProviderPackage implements ReactPackage {

  private Activity mActivity = null;

  @Override
    public List<NativeModule> createNativeModules(ReactApplicationContext reactContext) {
        List<NativeModule> modules = new ArrayList<>();
        modules.add(new ContactProviderModule(reactContext));
        return modules;
    }

  @Override
  public List<Class<? extends JavaScriptModule>> createJSModules() {
    return Collections.emptyList();
  }

  @Override
  public List<ViewManager>
  createViewManagers(ReactApplicationContext reactContext) {
    return Collections.emptyList();
  }
}
