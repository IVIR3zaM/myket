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

var exec = require("cordova/exec");

var Myket = {
  details: function(packageName, successCallback, errorCallback, refId) {
    var success = (typeof successCallback == "function" ? successCallback : function(){});
    var error = (typeof errorCallback == "function" ? errorCallback : function(){});
    exec(success, error, "Myket", "details", [packageName, refId]);
  },
  comment: function(packageName, successCallback, errorCallback) {
    var success = (typeof successCallback == "function" ? successCallback : function(){});
    var error = (typeof errorCallback == "function" ? errorCallback : function(){});
    exec(success, error, "Myket", "comment", [packageName]);
  },
  download: function(packageName, successCallback, errorCallback, refId) {
    var success = (typeof successCallback == "function" ? successCallback : function(){});
    var error = (typeof errorCallback == "function" ? errorCallback : function(){});
    exec(success, error, "Myket", "download", [packageName, refId]);
  },
  video: function(packageName, successCallback, errorCallback) {
    var success = (typeof successCallback == "function" ? successCallback : function(){});
    var error = (typeof errorCallback == "function" ? errorCallback : function(){});
    exec(success, error, "Myket", "video", [packageName]);
  }
};

module.exports = Myket;