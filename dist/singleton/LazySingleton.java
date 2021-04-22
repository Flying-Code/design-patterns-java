package singleton;

/**
 * 单例模式-懒汉
 *
 * @author: mf
 * @create: 2021/04/15
 **/
public class LazySingleton {

    private static volatile LazySingleton lazySingleton;

    /**
     * 私有化构造函数，防止其他类通过new的方式实例化本对象
     */
    private LazySingleton(){}

    /**
     * 线程安全的懒汉模式；锁了整个方法，性能并不好
     * @return
     */
    public static synchronized LazySingleton getInstance(){
        if(lazySingleton == null){
            lazySingleton = new LazySingleton();
        }
        return lazySingleton;
    }

    /**
     * 线程安全的懒汉模式；锁了初始化的代码块，性能相对较高
     * @return
     */
    public static LazySingleton getLazySingleton(){
        if(lazySingleton==null){
            synchronized (LazySingleton.class){
                if(lazySingleton==null){
                    lazySingleton = new LazySingleton();
                }
            }
        }
        return lazySingleton;
    }
}
