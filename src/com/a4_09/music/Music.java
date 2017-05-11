package com.a4_09.music;

/**
 * Created by HongWeiPC on 2017/4/11.
 */
public class Music {
    public String style;
    public String author;
    public String time;

    public String tostring() {
        return "音乐类型:" + this.style + "\t歌手:" + this.author + "\t时长:" + this.time;
    }
}
