package ex06;

import ex06.notification.BasicNotifier;
import ex06.notification.EmailNotifier;
import ex06.notification.Notifier;
import ex06.notification.SMSNotifier;

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
        Notifier e2 = new EmailNotifier(null);
        e2.send();
        System.out.println("__end");

        // 2. 기본 알림 + 이메일 알림
        EmailNotifier n2 = new EmailNotifier(new BasicNotifier());
        n2.send();
        System.out.println("__end");

        // 3. 문자 알림 + 이메일 알림
        EmailNotifier n3 = new EmailNotifier(new BasicNotifier());
        n3.send();
        System.out.println("__end");

        // 4. 문자 알림
        SMSNotifier n4 = new SMSNotifier();
        n4.send();
        System.out.println("__end");

        // 5. 문자 알림 + 이메일 알림 + 기본 알림
        SMSNotifier n5 = new SMSNotifier(new EmailNotifier(new BasicNotifier()));
        n5.send();
        System.out.println("__end");

        // 6. 문자 + 문자 +이메일 + 기본
        SMSNotifier n6 = new SMSNotifier(new SMSNotifier(new EmailNotifier(new BasicNotifier())));
        ClientNotification.send(n6);
        System.out.println("__end");
    }
}
