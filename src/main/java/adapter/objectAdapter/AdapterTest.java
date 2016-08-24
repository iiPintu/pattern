package adapter.objectAdapter;

import adapter.classAdapter.Source;
import adapter.classAdapter.Targetable;

/**
 * @author liyh
 * @date 2016/8/24
 */
public class AdapterTest {

    public static void main(String[] args) {
        Source source = new Source();
        Targetable target = new Wrapper(source);
        target.method1();
        target.method2();
    }
}
