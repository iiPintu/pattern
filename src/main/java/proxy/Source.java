package proxy;

/**
 * @author liyh
 * @date 2016/8/24
 */
public class Source implements Sourceable {

    @Override
    public void method() {
        System.out.println("the original method!");
    }
}
