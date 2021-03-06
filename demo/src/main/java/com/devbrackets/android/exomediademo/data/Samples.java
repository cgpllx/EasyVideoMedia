package com.devbrackets.android.exomediademo.data;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Samples {
    @NonNull
    private static final List<Sample> audioSamples;
    @NonNull
    private static final List<Sample> videoSamples;

    static {
        String audioImage = "https://ia902708.us.archive.org/3/items/count_monte_cristo_0711_librivox/Count_Monte_Cristo_1110.jpg?cnt=0";

        //Audio items
        audioSamples = new LinkedList<>();
        audioSamples.add(new Sample("Marseilles -- The Arrival", "https://archive.org/download/count_monte_cristo_0711_librivox/count_of_monte_cristo_001_dumas.mp3", audioImage));
        audioSamples.add(new Sample("Father and Son", "https://archive.org/download/count_monte_cristo_0711_librivox/count_of_monte_cristo_002_dumas.mp3", audioImage));
        audioSamples.add(new Sample("The Catalans", "https://archive.org/download/count_monte_cristo_0711_librivox/count_of_monte_cristo_003_dumas.mp3", audioImage));
        audioSamples.add(new Sample("Conspiracy", "https://archive.org/download/count_monte_cristo_0711_librivox/count_of_monte_cristo_004_dumas.mp3", audioImage));


        //Video items
        videoSamples = new ArrayList<>();
        videoSamples.add(new Sample("MP4", "http://14.29.86.11/variety.tc.qq.com/A6diuBB6fzES_-7qMElBlRJIHDnNEyK7-PzCAx40j4E8/u0200syx3f5.p202.1.mp4?vkey=85751CEDD75B37BCC542416731E0431CEAE6F6698AC0D14871930DC8B720237179405251795625FA34C89D7F6107108A0F6CEBE841383CC7E7A527260A1243049C995ED0E2AF9578B75CACBB851EA722C49078876A2140DF&platform=10201&sdtfrom=&fmt=hd&level=0&locid=35f5cb8c-af15-40b7-bc56-20e5efef94b9&size=1111245&ocid=350887852"));
        videoSamples.add(new Sample("MP4", "http://14.29.86.11/variety.tc.qq.com/A6diuBB6fzES_-7qMElBlRJIHDnNEyK7-PzCAx40j4E8/u0200syx3f5.p202.1.mp4?vkey=85751CEDD75B37BCC542416731E0431CEAE6F6698AC0D14871930DC8B720237179405251795625FA34C89D7F6107108A0F6CEBE841383CC7E7A527260A1243049C995ED0E2AF9578B75CACBB851EA722C49078876A2140DF&platform=10201&sdtfrom=&fmt=hd&level=0&locid=35f5cb8c-af15-40b7-bc56-20e5efef94b9&size=1111245&ocid=350887852"));
        videoSamples.add(new Sample("MP4", "http://14.29.86.11/variety.tc.qq.com/A6diuBB6fzES_-7qMElBlRJIHDnNEyK7-PzCAx40j4E8/u0200syx3f5.p202.1.mp4?vkey=85751CEDD75B37BCC542416731E0431CEAE6F6698AC0D14871930DC8B720237179405251795625FA34C89D7F6107108A0F6CEBE841383CC7E7A527260A1243049C995ED0E2AF9578B75CACBB851EA722C49078876A2140DF&platform=10201&sdtfrom=&fmt=hd&level=0&locid=35f5cb8c-af15-40b7-bc56-20e5efef94b9&size=1111245&ocid=350887852"));
        videoSamples.add(new Sample("MP4", "http://14.29.86.11/variety.tc.qq.com/A6diuBB6fzES_-7qMElBlRJIHDnNEyK7-PzCAx40j4E8/u0200syx3f5.p202.1.mp4?vkey=85751CEDD75B37BCC542416731E0431CEAE6F6698AC0D14871930DC8B720237179405251795625FA34C89D7F6107108A0F6CEBE841383CC7E7A527260A1243049C995ED0E2AF9578B75CACBB851EA722C49078876A2140DF&platform=10201&sdtfrom=&fmt=hd&level=0&locid=35f5cb8c-af15-40b7-bc56-20e5efef94b9&size=1111245&ocid=350887852"));
        videoSamples.add(new Sample("MP4", "http://14.29.86.11/variety.tc.qq.com/A6diuBB6fzES_-7qMElBlRJIHDnNEyK7-PzCAx40j4E8/u0200syx3f5.p202.1.mp4?vkey=85751CEDD75B37BCC542416731E0431CEAE6F6698AC0D14871930DC8B720237179405251795625FA34C89D7F6107108A0F6CEBE841383CC7E7A527260A1243049C995ED0E2AF9578B75CACBB851EA722C49078876A2140DF&platform=10201&sdtfrom=&fmt=hd&level=0&locid=35f5cb8c-af15-40b7-bc56-20e5efef94b9&size=1111245&ocid=350887852"));
        videoSamples.add(new Sample("MP4", "http://14.29.86.11/variety.tc.qq.com/A6diuBB6fzES_-7qMElBlRJIHDnNEyK7-PzCAx40j4E8/u0200syx3f5.p202.1.mp4?vkey=85751CEDD75B37BCC542416731E0431CEAE6F6698AC0D14871930DC8B720237179405251795625FA34C89D7F6107108A0F6CEBE841383CC7E7A527260A1243049C995ED0E2AF9578B75CACBB851EA722C49078876A2140DF&platform=10201&sdtfrom=&fmt=hd&level=0&locid=35f5cb8c-af15-40b7-bc56-20e5efef94b9&size=1111245&ocid=350887852"));
        videoSamples.add(new Sample("MP4", "http://14.29.86.11/variety.tc.qq.com/A6diuBB6fzES_-7qMElBlRJIHDnNEyK7-PzCAx40j4E8/u0200syx3f5.p202.1.mp4?vkey=85751CEDD75B37BCC542416731E0431CEAE6F6698AC0D14871930DC8B720237179405251795625FA34C89D7F6107108A0F6CEBE841383CC7E7A527260A1243049C995ED0E2AF9578B75CACBB851EA722C49078876A2140DF&platform=10201&sdtfrom=&fmt=hd&level=0&locid=35f5cb8c-af15-40b7-bc56-20e5efef94b9&size=1111245&ocid=350887852"));
        videoSamples.add(new Sample("MP4", "http://14.29.86.11/variety.tc.qq.com/A6diuBB6fzES_-7qMElBlRJIHDnNEyK7-PzCAx40j4E8/u0200syx3f5.p202.1.mp4?vkey=85751CEDD75B37BCC542416731E0431CEAE6F6698AC0D14871930DC8B720237179405251795625FA34C89D7F6107108A0F6CEBE841383CC7E7A527260A1243049C995ED0E2AF9578B75CACBB851EA722C49078876A2140DF&platform=10201&sdtfrom=&fmt=hd&level=0&locid=35f5cb8c-af15-40b7-bc56-20e5efef94b9&size=1111245&ocid=350887852"));
        videoSamples.add(new Sample("MP4", "http://14.29.86.11/variety.tc.qq.com/A6diuBB6fzES_-7qMElBlRJIHDnNEyK7-PzCAx40j4E8/u0200syx3f5.p202.1.mp4?vkey=85751CEDD75B37BCC542416731E0431CEAE6F6698AC0D14871930DC8B720237179405251795625FA34C89D7F6107108A0F6CEBE841383CC7E7A527260A1243049C995ED0E2AF9578B75CACBB851EA722C49078876A2140DF&platform=10201&sdtfrom=&fmt=hd&level=0&locid=35f5cb8c-af15-40b7-bc56-20e5efef94b9&size=1111245&ocid=350887852"));
        videoSamples.add(new Sample("MP4", "http://14.29.86.11/variety.tc.qq.com/A6diuBB6fzES_-7qMElBlRJIHDnNEyK7-PzCAx40j4E8/u0200syx3f5.p202.1.mp4?vkey=85751CEDD75B37BCC542416731E0431CEAE6F6698AC0D14871930DC8B720237179405251795625FA34C89D7F6107108A0F6CEBE841383CC7E7A527260A1243049C995ED0E2AF9578B75CACBB851EA722C49078876A2140DF&platform=10201&sdtfrom=&fmt=hd&level=0&locid=35f5cb8c-af15-40b7-bc56-20e5efef94b9&size=1111245&ocid=350887852"));
        videoSamples.add(new Sample("MP48", "http://ugcbsy.qq.com/flv/150/138/o0368o0q3mz.p712.1.mp4?sdtfrom=v1010&guid=8bb66cdf9c6aabed4e1ce3f5c308a2bb&vkey=0887287B1050E23F47AB306931786C6C8919957D1D84648FF342E185F605AEF20755541F6AAEC7813E1AE55CA48C6F21EA61819CF55ABB7DB298A4AE63AF4843DB996B362B01B0DA085EC7CF07A1E4B72F20BA5BD2531D50ECDED2E47D66723CDADF40347D510D37C0CC98EE5F3CDCBE"));
        videoSamples.add(new Sample("FLV - Big Buck Bunny by Blender", "http://video19.ifeng.com/video07/2013/11/11/281708-102-007-1138.mp4"));
        videoSamples.add(new Sample("MP4MP4", "http://zhenxue.oss-cn-hangzhou.aliyuncs.com/20170914/7873icQRd8.mp4"));
        videoSamples.add(new Sample("FLV - Big Buck Bunny by Blender", "http://vod.leasewebcdn.com/bbb.flv?ri=1024&rs=150&start=0"));
        videoSamples.add(new Sample("HLS - ArtBeats", "http://cdn-fms.rbs.com.br/vod/hls_sample1_manifest.m3u8"));
        videoSamples.add(new Sample("HLS - Sintel by Blender", "https://bitdash-a.akamaihd.net/content/sintel/hls/playlist.m3u8"));
        videoSamples.add(new Sample("MKV - Android Screens", "http://storage.googleapis.com/exoplayer-test-media-1/mkv/android-screens-lavf-56.36.100-aac-avc-main-1280x720.mkv"));
        videoSamples.add(new Sample("MP4 (VP9) - Google Glass", "http://demos.webmproject.org/exoplayer/glass.mp4"));
        videoSamples.add(new Sample("MPEG DASH - Sintel by Blender", "https://bitdash-a.akamaihd.net/content/sintel/sintel.mpd"));
        videoSamples.add(new Sample("MPEG DASH - Big Buck Bunny by Blender, Live", "https://wowzaec2demo.streamlock.net/live/bigbuckbunny/manifest_mpm4sav_mvtime.mpd"));
        videoSamples.add(new Sample("Smooth Stream - Caminandes: Llama Drama by Blender", "http://amssamples.streaming.mediaservices.windows.net/634cd01c-6822-4630-8444-8dd6279f94c6/CaminandesLlamaDrama4K.ism/manifest"));
        videoSamples.add(new Sample("Smooth Stream - Tears of Steel Teaser by Blender", "http://amssamples.streaming.mediaservices.windows.net/3d7eaff9-39fa-442f-81cc-f2ea7db1797e/TearsOfSteelTeaser.ism/manifest"));
        videoSamples.add(new Sample("WEBM - Big Buck Bunny", "http://dl1.webmfiles.org/big-buck-bunny_trailer.webm"));
        videoSamples.add(new Sample("WEBM - Elephants Dream", "http://dl1.webmfiles.org/elephants-dream.webm"));
    }

    @NonNull
    public static List<Sample> getAudioSamples() {
        return audioSamples;
    }

    @NonNull
    public static List<Sample> getVideoSamples() {
        return videoSamples;
    }

    /**
     * A container for the information associated with a
     * sample media item.
     */
    public static class Sample {
        @NonNull
        private String title;
        @NonNull
        private String mediaUrl;
        @Nullable
        private String artworkUrl;

        public Sample(@NonNull String title, @NonNull String mediaUrl) {
            this(title, mediaUrl, null);
        }

        public Sample(@NonNull String title, @NonNull String mediaUrl, @Nullable String artworkUrl) {
            this.title = title;
            this.mediaUrl = mediaUrl;
            this.artworkUrl = artworkUrl;
        }

        @NonNull
        public String getTitle() {
            return title;
        }

        @NonNull
        public String getMediaUrl() {
            return mediaUrl;
        }

        @Nullable
        public String getArtworkUrl() {
            return artworkUrl;
        }
    }
}
