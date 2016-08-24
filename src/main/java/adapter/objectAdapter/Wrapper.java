package adapter.objectAdapter;

import adapter.classAdapter.Source;
import adapter.classAdapter.Targetable;

/**
 * @author liyh
 * @date 2016/8/24
 */
public class Wrapper implements Targetable {

    private Source source;

    public Wrapper(Source source){
        super();
        this.source = source;
    }
    @Override
    public void method2() {
        System.out.println("this is the targetable method!");
    }

    @Override
    public void method1() {
        source.method1();
    }
}
