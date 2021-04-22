package singleton;

/**
 * 单例模式-饿汉
 *
 * @author: mf
 * @create: 2021/04/15
 **/
public class HungrySingleton {

    /**
     * 声明时实例化对象
     */
    private static final HungrySingleton hungrySingleton = new HungrySingleton();

    /**
     * 私有化构造函数，防止其他类通过new的方式实例化本对象
     */
    private HungrySingleton() {
    }

    /**
     * 提供静态方法获取本对象的实例
     *
     * @return
     */
    public static HungrySingleton getInstance() {
        return hungrySingleton;
    }
}
