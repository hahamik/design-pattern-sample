package ex06;

import ex06.notification.BasicNotifier;
import ex06.notification.EmailNotifier;
import ex06.notification.Notifier;

public class App {
    public static void main(String[] args) {
//        Notifier b1 = new BasicNotifier();
//        b1.send();
//        System.out.println("__end");
//        Notifier e1 = new EmailNotifier();
//        e1.send();
//        System.out.println("__end");
//        Notifier s1 = new SMSNotifier();
//        s1.send();
//        System.out.println("__end");

        // 1. 이메일 알림 + 기본
        Notifier b2 = new BasicNotifier();
        Notifier e2 = new EmailNotifier();
        b2.send();
        e2.send();
        System.out.println("__end");
    }
}
