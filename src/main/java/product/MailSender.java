package product;

/**
 * @author liyh
 * @date 2016/6/24
 */
public class MailSender implements Sender {
    @Override
    public void Send() {
        System.out.println("this is mailsender!");
    }
}