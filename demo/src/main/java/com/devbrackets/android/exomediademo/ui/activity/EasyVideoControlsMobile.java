/*
 * Copyright (C) 2016 Brian Wernick
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.devbrackets.android.exomediademo.ui.activity;

import android.annotation.TargetApi;
import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;

import com.devbrackets.android.exomedia.ui.widget.VideoControlsMobile;
import com.devbrackets.android.exomedia.util.TimeFormatUtil;
import com.devbrackets.android.exomediademo.R;

public class EasyVideoControlsMobile extends VideoControlsMobile {
    VideoController videoController;

    public EasyVideoControlsMobile(Context context) {
        super(context);
    }

    public EasyVideoControlsMobile(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public EasyVideoControlsMobile(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @TargetApi(Build.VERSION_CODES.LOLLIPOP)
    public EasyVideoControlsMobile(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
    }

    @Override
    protected void setup(final Context context) {
        super.setup(context);
        videoController = (VideoController) findViewById(R.id.videoController);
        videoController.setVideoControls(this);
        videoController.setOnSeekBarChangeListener(new VideoControllerChangedListener());
        titleTextView.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                Activity activity = (Activity) context;
                activity.onBackPressed();
            }
        });
    }


    public long getCurrentPosition() {
        return videoView.getCurrentPosition();
    }

    public long getDuration() {
        return videoView.getDuration();
    }

    @Override
    protected int getLayoutResource() {
        return com.devbrackets.android.exomediademo.R.layout.exo_playback_control_view;
    }

    protected class VideoControllerChangedListener {
        private long seekToTime;

        public void onProgressChanged(int progress) {
            seekToTime = progress;
            if (currentTimeTextView != null) {
                currentTimeTextView.setText(TimeFormatUtil.formatMs(seekToTime));
            }
        }

        public void onStartTrackingTouch() {
            userInteracting = true;
            if (seekListener == null || !seekListener.onSeekStarted()) {
                internalListener.onSeekStarted();
            }
        }

        public void onStopTrackingTouch() {
            userInteracting = false;
            if (seekListener == null || !seekListener.onSeekEnded(seekToTime)) {
                internalListener.onSeekEnded(seekToTime);
            }
        }
    }
}