package cn.rongcloud.im;

/**
 * Created by AMing on 16/5/26.
 * Company RongCloud
 */
public class SealConst {
    public static final int DISCUSSION_REMOVE_MEMBER_REQUEST_CODE = 1;
    public static final int DISCUSSION_ADD_MEMBER_REQUEST_CODE = 2;
    public static final boolean ISOPENDISCUSSION = false;
    public static final int PERSONALPROFILEFROMCONVERSATION = 3;
    public static final int PERSONALPROFILEFROMGROUP = 4;
    public static final String GROUP_LIST_UPDATE = "GROUP_LIST_UPDATE";
    /**
     * 广播的Action 通知用户退出登录
     */
    public static final String EXIT = "EXIT";
    /**
     * 广播的Action  （用户信息发生改变  发送此广播）通知各页面更新用户信息
     */
    public static final String CHANGEINFO = "CHANGEINFO";
    public static final String SEALTALKVERSION = "1.1.11";
    /**
     * 偏好文件索引值   保存当前用户Id
     */
    public static final String SEALTALK_LOGIN_ID = "loginid";
    /**
     * 偏好文件索引值   保存当前用户Name
     */
    public static final String SEALTALK_LOGIN_NAME = "loginnickname";
    /**
     * 偏好文件索引值   保存当前用户头像
     */
    public static final String SEALTALK_LOGING_PORTRAIT = "loginPortrait";
    /**
     * 偏好文件索引值   保存当前用户手机Number
     */
    public static final String SEALTALK_LOGING_PHONE = "loginphone";
    /**
     * 偏好文件索引值   保存当前用户PassWord
     */
    public static final String SEALTALK_LOGING_PASSWORD = "loginpassword";

}
