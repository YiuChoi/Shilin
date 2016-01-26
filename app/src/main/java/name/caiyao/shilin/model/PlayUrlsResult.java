package name.caiyao.shilin.model;

import com.google.gson.annotations.SerializedName;

/**
 * Created by 蔡尧 on 2015/12/27 0027.
 */
public class PlayUrlsResult {
    @SerializedName("error")
    public boolean err;
    public int errorCode;

    @SerializedName("errorinfo")
    public String errorinfo;

    @SerializedName("m3u8")
    public M3U8 m3u8;

    @SerializedName("mp4")
    public MP4 mp4;
}
