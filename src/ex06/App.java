package ex06;

import ex06.notification.BasicNotifier;
import ex06.notification.EmailNotifier;

public class App {
    public static void main(String[] args) {
        BasicNotifier b1 = new BasicNotifier();
        b1.send();
        EmailNotifier e1 = new EmailNotifier();
        System.out.println("__end");
    }
}
