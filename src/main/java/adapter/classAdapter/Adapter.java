package adapter.classAdapter;

/**
 * @author liyh
 * @date 2016/8/24
 */
public class Adapter extends Source implements Targetable {

    @Override
    public void method2() {
        System.out.println("this is the targetable method!");
    }
}