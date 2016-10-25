/*
       Myket.ir helper for Cordova Projects

       Created by Mohammad Reza Maghoul (IVIR3zaM)

       Home Page: https://github.com/ivir3zam/myket


       Licensed to the Apache Software Foundation (ASF) under one
       or more contributor license agreements.  See the NOTICE file
       distributed with this work for additional information
       regarding copyright ownership.  The ASF licenses this file
       to you under the Apache License, Version 2.0 (the
       "License"); you may not use this file except in compliance
       with the License.  You may obtain a copy of the License at

         http://www.apache.org/licenses/LICENSE-2.0

       Unless required by applicable law or agreed to in writing,
       software distributed under the License is distributed on an
       "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
       KIND, either express or implied.  See the License for the
       specific language governing permissions and limitations
       under the License.
*/
package org.apache.cordova.plugin;

import org.apache.cordova.CordovaPlugin;
import org.apache.cordova.CallbackContext;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import android.content.Intent;
import android.net.Uri;

import com.farsitel.bazaar.IUpdateCheckService;

public class Myket extends CordovaPlugin {
    String packageName;
    String refId;

    @Override
    public boolean execute(String action, JSONArray args, CallbackContext callbackContext) throws JSONException {
        if (action.equals("details")) {
            try{
                packageName = args.getString(0);
                refId = args.getString(1);
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("myket://details?id=" + packageName + "&refId=" + refId));
                intent.setPackage("ir.mservices.market");
                this.cordova.getActivity().startActivity(intent);
                callbackContext.success("Details Intent Sent");
                return true;
            } catch (JSONException e) {
                callbackContext.error(e.getMessage());
                return false;
            }
        }

        if (action.equals("comment")) {
            try{
                packageName = args.getString(0);
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("comment?id=" + packageName));
                intent.setPackage("ir.mservices.market");
                this.cordova.getActivity().startActivity(intent);
                callbackContext.success("Comment Intent Sent");
                return true;
            } catch (JSONException e) {
                callbackContext.error(e.getMessage());
                return false;
            }
        }

        if (action.equals("download")) {
            try{
                packageName = args.getString(0);
                refId = args.getString(1);
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("myket://download/" + packageName + "?refId=" + refId));
                intent.setPackage("ir.mservices.market");
                this.cordova.getActivity().startActivity(intent);
                callbackContext.success("Download Intent Sent");
                return true;
            } catch (JSONException e) {
                callbackContext.error(e.getMessage());
                return false;
            }
        }

        if (action.equals("video")) {
            try{
                packageName = args.getString(0);
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("myket://video?id=" + packageName));
                intent.setPackage("ir.mservices.market");
                this.cordova.getActivity().startActivity(intent);
                callbackContext.success("Video Intent Sent");
                return true;
            } catch (JSONException e) {
                callbackContext.error(e.getMessage());
                return false;
            }
        }

        return false;
    }
}