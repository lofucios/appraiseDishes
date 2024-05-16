import java.util.Date;

public class CopyrightInfo {
    // 私有静态成员变量，用于存储单例实例
    private static CopyrightInfo instance;

    // 私有构造方法，避免外部类实例化
    private CopyrightInfo() {}

    // 公有静态方法，返回单例实例
    public static CopyrightInfo getInstance() {
        // 判断单例实例是否已经被创建，如果没有则创建一个新实例
        if(instance == null) {
            instance = new CopyrightInfo();
        }
        return instance;
    }

    // 成员变量，用于存储版权信息
    private String author;
    private Date timestamp;

    // 公有方法，用于设置版权信息
    public void setCopyright(String author) {
        this.author = author;
        this.timestamp = new Date();
    }

    // 公有方法，用于获取版权信息
    public String getCopyright() {
        return "Author: " + author + ", Time: " + timestamp;
    }
}
