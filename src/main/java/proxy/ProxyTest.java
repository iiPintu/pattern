package proxy;

/**
 * @author liyh
 * @date 2016/8/24
 */
public class ProxyTest {

    public static void main(String[] args) {
        Sourceable source = new Proxy();
        source.method();
    }
}
