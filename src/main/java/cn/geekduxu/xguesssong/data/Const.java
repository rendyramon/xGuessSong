package cn.geekduxu.xguesssong.data;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;

import java.util.LinkedList;
import java.util.List;
import java.util.Random;

import cn.geekduxu.xguesssong.model.Music;

public class Const {

    public static final String SONG_INFO[][] = {
            {"__00000.m4a", "1", "征服"},
            {"__00001.m4a", "1", "童话"},
            {"__00002.m4a", "1", "同桌的你"},
            {"__00003.m4a", "1", "七里香"},
            {"__00004.m4a", "1", "传奇"},
            {"__00005.m4a", "1", "大海"},
            {"__00006.m4a", "1", "后来"},
            {"__00007.m4a", "1", "你的背包"},
            {"__00008.m4a", "1", "再见"},
            {"__00009.m4a", "1", "老男孩"},
            {"__00010.m4a", "1", "龙的传人"},
            {"V4900341_1.mp3", "1", "可惜不是你"},
            {"V185369_1.mp3", "1", "我怀念的"},
            {"403427_1.mp3", "2", "庾澄庆"},
            {"6069_1.mp3", "2", "陈奕迅"},
            {"618034_1.mp3", "1", "想你的夜"},
            {"V262255_1.mp3", "1", "如果这都不算爱"},
            {"103234_1.mp3", "2", "刘德华"},
            {"V536380_1.mp3", "1", "一生中最爱"},
            {"228450_1.mp3", "1", "再回首"},
            {"V1121156_1.mp3", "2", "王力宏"},
            {"V1037907_1.mp3", "1", "恋爱大过天"},
            {"V1010495_1.mp3", "2", "莫文蔚"},
            {"V1234505_1.mp3", "1", "月球上的人"},
            {"103848_1.mp3", "3", "还是要爱你"},
            {"V231651_1.mp3", "1", "一眼万年"},
            {"V564704_1.mp3", "1", "野百合也有春天"},
            {"104002_1.mp3", "3", "就让我回到家乡"},
            {"V1406968_1.mp3", "2", "陈慧琳"},
            {"421344_1.mp3", "2", "陈小春"},
            {"V1125315_1.mp3", "1", "为你我受冷风吹"},
            {"V186019_1.mp3", "2", "孙燕姿"},
            {"V1411906_1.mp3", "1", "心的距离"},
            {"V417734_1.mp3", "3", "命运不堪"},
            {"V497539_1.mp3", "2", "蔡琴"},
            {"V669052_1.mp3", "1", "我们没有在一起"},
            {"M100103_1.mp3", "1", "流星雨"},
            {"V4776068_1.mp3", "1", "走在红毯那一天"},
            {"V826048_1.mp3", "3", "每当我闭上眼"},
            {"V883466_1.mp3", "2", "孟庭苇"},
            {"V1137509_1.mp3", "1", "寂寞先生"},
            {"102770_1.mp3", "2", "刘欢"},
            {"6199_1.mp3", "2", "王杰"},
            {"105987_1.mp3", "1", "冬季到台北来看雨"},
            {"103652_1.mp3", "2", "王心凌"},
            {"408744_1.mp3", "1", "外滩十八号"},
            {"V466375_1.mp3", "2", "张学友"},
            {"V1129539_1.mp3", "1", "那么爱你为什么"},
            {"1054410_1.mp3", "1", "无人之境"},
            {"100916_1.mp3", "2", "谢霆锋"},
            {"412987_1.mp3", "1", "电灯胆"},
            {"V646223_1.mp3", "2", "五月天"},
            {"V1042030_1.mp3", "1", "别来无恙"},
            {"7151_1.mp3", "2", "萧亚轩"},
            {"V638445_1.mp3", "1", "我不懂爱"},
            {"V4709019_1.mp3", "2", "齐秦"},
            {"813241_1.mp3", "1", "最重要的决定"},
            {"V435779_1.mp3", "2", "谢安琪"},
            {"V642409_1.mp3", "1", "似水流年"},
            {"V4760446_1.mp3", "2", "辛晓琪"},
            {"V694572_1.mp3", "1", "沙龙"},
    };

   /* private static List<Integer> MUSICS_LIST;

    static {
        MUSICS_LIST = new LinkedList<Integer>();
        for (int i = 0; i < SONG_INFO.length; i++) {
            MUSICS_LIST.add(i);
        }
    }*/

    public static Music loadNextMusic(Context context) {

        SharedPreferences sp = context.getSharedPreferences("config", Context.MODE_PRIVATE);
        String s = sp.getString("done", "0");
        int pos = Integer.parseInt(s);

        Music music = new Music();
        music.setFilename(SONG_INFO[pos][0]);
        music.setMode(Integer.parseInt(SONG_INFO[pos][1]));
        music.setMusicName(SONG_INFO[pos][2]);

        return music;
    }

    public static boolean hasMoreMusic(int done) {
        return done < SONG_INFO.length - 1;
    }

}
