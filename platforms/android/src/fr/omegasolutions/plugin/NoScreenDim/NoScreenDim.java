package fr.omegasolutions.plugin.NoScreenDim;

import org.apache.cordova.*;
import org.apache.cordova.CallbackContext;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import android.view.WindowManager;

/**
 * This class echoes a string called from JavaScript.
 */
public class NoScreenDim extends CordovaPlugin {

   @Override
    public void initialize(CordovaInterface cordova, CordovaWebView webView) {
        super.initialize(cordova, webView);

        cordova.getActivity().getWindow().addFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON);
    }

}
