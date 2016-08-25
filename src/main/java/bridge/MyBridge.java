package bridge;

/**
 * @author liyh
 * @date 2016/8/25
 */
public class MyBridge extends Bridge {
    public void method(){
        getSource().method();
    }
}
