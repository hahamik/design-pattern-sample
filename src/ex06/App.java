package ex06;

import ex06.notification.BasicNotifier;
import ex06.notification.EmailNotifier;
import ex06.notification.Notifier;
import ex06.notification.SMSNotifier;

public class App {
    public static void main(String[] args) {
        Notifier b1 = new BasicNotifier();
        b1.send();
        System.out.println("__end");
        Notifier e1 = new EmailNotifier();
        e1.send();
        System.out.println("__end");
        Notifier s1 = new SMSNotifier();
        s1.send();
        System.out.println("__end");
    }
}
