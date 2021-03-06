/*
 * Copyright 2013 Xi CHEN
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * 	http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.seanchenxi.gwt.webrtc.client;

import com.google.gwt.core.client.JavaScriptObject;
import com.seanchenxi.gwt.webrtc.client.connection.*;
import com.seanchenxi.gwt.webrtc.client.media.UserMediaCallback;
import com.seanchenxi.gwt.webrtc.client.media.UserMediaConstraints;

/**
 * User: Xi
 */
public class WebRTCImplMozilla extends WebRTCImpl {

    @Override
    public final boolean isGecko() {
        return true;
    }

    @Override
    public final boolean isWebkit() {
        return false;
    }

    @Override
    public final native void getUserMedia(UserMediaConstraints constraints, UserMediaCallback callback) /*-{
        var successCallback = $entry(function(localMediaStream) {
            @com.seanchenxi.gwt.webrtc.client.WebRTCImpl::handleUserMediaCallback(Lcom/seanchenxi/gwt/webrtc/client/media/UserMediaCallback;Lcom/seanchenxi/gwt/webrtc/client/media/MediaStreamNative;Ljava/lang/String;)(callback, localMediaStream, "");
        });
        var errorCallback = $entry(function(err) {
            @com.seanchenxi.gwt.webrtc.client.WebRTCImpl::handleUserMediaCallback(Lcom/seanchenxi/gwt/webrtc/client/media/UserMediaCallback;Lcom/seanchenxi/gwt/webrtc/client/media/MediaStreamNative;Ljava/lang/String;)(callback, err, JSON.stringify(err));
        });
        $wnd.navigator.mozGetUserMedia(constraints, successCallback, errorCallback);
    }-*/;

    @Override
    public final native RTCPeerConnectionNative createRTCPeerConnectionNative(RTCConfiguration configuration, Constraints constraints) /*-{
        return new mozRTCPeerConnection(configuration, constraints);
    }-*/;

    @Override
    public final native RTCSessionDescription createRTCSessionDescription(RTCSessionDescriptionInit init) /*-{
        return new mozRTCSessionDescription(init);
    }-*/;

    @Override
    public final native RTCIceCandidate createRTCIceCandidate(RTCIceCandidateInit candidateInitDict) /*-{
        return new mozRTCIceCandidate(candidateInitDict);
    }-*/;

    @Override
    public final native String createObjectURL(JavaScriptObject object) /*-{
        return $wnd.URL.createObjectURL(object);
    }-*/;

    @Override
    public final native String revokeObjectURL(String objectURL) /*-{
        return $wnd.URL.revokeObjectURL(objectURL);
    }-*/;
}
