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

package com.seanchenxi.gwt.webrtc.client.media;

import com.google.gwt.dom.client.EventTarget;

/**
 * User: Xi
 * @see: http://dev.w3.org/2011/webrtc/editor/getusermedia.html#mediastream
 */
public class MediaStreamNative extends EventTarget {

    protected MediaStreamNative() {
    }

    public final native String getId() /*-{
        return this.id;
    }-*/;

    public final native boolean isEnded() /*-{
        return this.ended;
    }-*/;

    public final native void addTrack(MediaStreamTrack track) /*-{
        this.addTrack(track);
    }-*/;

    public final native void removeTrack(MediaStreamTrack track) /*-{
        this.removeTrack(track);
    }-*/;

    public final native MediaStreamTrackList getVideoTracks() /*-{
        return this.getVideoTracks();
    }-*/;

    public final native MediaStreamTrackList getAudioTracks() /*-{
        return this.getAudioTracks();
    }-*/;

    public final native MediaStreamNative clone() /*-{
        return this.clone();
    }-*/;

}
