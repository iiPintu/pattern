package adapter.classAdapter;

/**
 * @author liyh
 * @date 2016/8/24
 */
public class AdapterTest {

    public static void main(String[] args) {
        Targetable target = new Adapter();
        target.method1();
        target.method2();
    }
}
