package bridge;

/**
 * @author liyh
 * @date 2016/8/25
 */
public class SourceSub1 implements Sourceable {

    @Override
    public void method() {
        System.out.println("this is the first sub!");
    }
}
