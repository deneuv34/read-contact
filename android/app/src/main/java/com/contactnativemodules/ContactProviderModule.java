package com.contactnativemodules;

import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.google.gson.Gson;
//import com.contactnativemodules.Injector;
import com.contactnativemodules.Contact;
import com.contactnativemodules.ContactProvider;

import java.util.List;

import javax.inject.Inject;

/**
 * Contact provider module
 */
public class ContactProviderModule extends ReactContextBaseJavaModule {
    public final static String TAG = ContactProviderModule.class.getSimpleName();

    public ContactProvider contactProvider;

    public ContactProviderModule(ReactApplicationContext context) {
        super(context);

    }

    @Override
    public String getName() {
        return TAG;
    }

    @ReactMethod
    public void search(String query, Promise promise) {
        List<Contact> contacts = contactProvider.searchContactFromPhonebook(query);
        promise.resolve((new Gson()).toJson(contacts));
    }
}
