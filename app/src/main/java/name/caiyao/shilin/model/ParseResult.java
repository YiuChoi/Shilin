package name.caiyao.shilin.model;

import java.util.ArrayList;

/**
 * Created by 蔡尧 on 2015/12/27 0027.
 */
public class ParseResult {
    public static final int ERROR_NETWORKERROR = 2;
    public static final int ERROR_NOVIDEOFOUND = 1;
    public static final int ERROR_OK = 0;
    public static final int ERROR_REGIONRESTRICTED = 3;
    public static final int ERROR_SERVERERROR = 5;
    public static final int ERROR_TIMEERROR = 6;
    public static final int ERROR_VIDEONOTEXIST = 4;
    public int error = 0;
    public String errorinfo;
    public boolean nodirect = false;
    public String referer;
    public ArrayList<ParseVideoEntry> videoEntries = new ArrayList<>();
    public String videoUID;
}
