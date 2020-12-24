/*
 * Copyright (c) 2019-2020 QMJY.CN All rights reserved.
 */

package cn.devkits.client;

import java.io.File;
import java.util.HashSet;

import com.google.common.collect.Sets;

/**
 * <p>
 * 系统常量
 * </p>
 *
 * @author Shaofeng Liu
 * @since 2020/8/14
 */
public interface DKConstants {
    String DEVKIT_WORKSPACE = System.getenv("USERPROFILE") + File.separator + ".devkits" + File.separator;

    /**
     * 待办通知类型，枚举内容顺序不能调整，顺序业务有依赖，新增类型依次往后追加
     */
    enum TODO_REMINDER {
        TRAY, EMAIL, DIALOG;
    }

    // 截屏
    int DK_HOTKEY_SCR_CAP = 0;
    // 环境变量
    int DK_HOTKEY_ENV_EDIT = 1;
    // 新建待办
    int DK_HOTKEY_NEW_TODO = 2;

    HashSet<String> FILE_TYPE_DOC = Sets.newHashSet(".doc", ".dot", ".wbk", ".docx", ".docm",
            ".dotx", ".dotm", ".docb", ".xls", ".xlt", ".xlm", ".xlsx", ".xlsm", ".xltx", ".xltm",
            ".xlsb", ".xla", ".xlam", ".xll", ".xlw", "ppt", ".pot", ".pps", ".pptx", ".pptm", ".potx",
            ".potm", ".ppam", ".ppsx", ".sldx", ".sldm", ".pdf", ".txt", ".log");

    HashSet<String> FILE_TYPE_IMG = Sets.newHashSet(".jpg", ".jpeg", ".gif", ".png", ".psd", ".ai");

    HashSet<String> FILE_TYPE_AUDIO = Sets.newHashSet(".mp3", ".dvf", ".flac", ".m4a", ".m4b",
            ".m4p", ".mmf", ".nmf", ".nsf", ".msv", ".mpc", ".gsm", ".iklax", ".ivs", ".wma", ".wav",
            ".wv", ".webm", ".aac", ".aax", ".act", ".aiff", ".dss", ".alac", ".amr", ".3gp", ".aa",
            ".ape", ".au", ".dct", ".awb", ".ogg", ".oga", ".mogg", ".opus", ".ra", ".rm", ".raw",
            ".sln", ".tta", ".voc", ".vox", ".8svx");

    HashSet<String> FILE_TYPE_VEDIO = Sets.newHashSet(".webm", ".mkv", ".flv", ".vob", ".ogv",
            ".ogg", ".drc", ".mng", ".avi", ".mts", ".m2ts", ".ts", ".mov", ".qt", ".wmv", ".yuv", ".rm",
            ".rmvb", ".asf", ".amv", ".mp4", ".m4p", ".m4v", ".mpg", ".mp2", ".mpeg", ".mpe", ".mpv",
            ".m4v", ".svi", ".3gp", ".3g2", ".mxf", ".roq", ".nsv", ".f4v", ".f4p", ".f4a", ".f4b");
}
