package fr.omegasolutions.plugin;

import org.apache.cordova.*;
import org.apache.cordova.CallbackContext;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import android.view.WindowManager;

public class KeepScreenOn extends CordovaPlugin {

   @Override
    public void initialize(CordovaInterface cordova, CordovaWebView webView) {
        super.initialize(cordova, webView);

        cordova.getActivity().getWindow().addFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON);
    }
}
