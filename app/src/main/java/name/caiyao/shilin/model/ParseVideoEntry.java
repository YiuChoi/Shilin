package name.caiyao.shilin.model;

import java.util.Comparator;

/**
 * Created by 蔡尧 on 2015/12/27 0027.
 */
public class ParseVideoEntry {
    public String videoFormat;
    public String videoQuality;
    public String videoURL;

    public ParseVideoEntry(String paramString, String paramVideoFormat, String paramVideoQuality) {
        this.videoFormat = paramVideoFormat;
        this.videoURL = paramString;
        this.videoQuality = paramVideoQuality;
    }
}
