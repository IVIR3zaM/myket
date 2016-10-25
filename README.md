Myket Intents
==========================

Myket Intents Plugin for Cordova 3.0+ Android

This plugin in based on documentation from https://kb.myket.ir/pages/viewpage.action?pageId=753698

Installation
===========

For Cordova CLI -
`cordova plugin add cordova-plugin-myket`

For PhoneGap Build -
Add `<gap:plugin name="cordova-plugin-myket" version="1.0.1" />` to config.xml

Usages (in javascript anywhere in your project)
===============================================

- Myket.details("com.your.package", successCallback, errorCallback);
- Myket.developer("dev-xxxx", successCallback, errorCallback); // your developer Id on myket.ir
- Myket.comment("com.your.package", successCallback, errorCallback);
- Myket.download("com.your.package", successCallback, errorCallback, "refId"); // refId is optional
- Myket.video("com.your.package", successCallback, errorCallback);
