package product;

/**
 * @author liyh
 * @date 2016/6/24
 */
public class SmsSender implements Sender {

    @Override
    public void Send() {
        System.out.println("this is sms sender!");
    }
}
