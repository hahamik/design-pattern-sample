package ex06.notification;

public class SMSNotifier implements Notifier {
    public void send() {
        System.out.println("문자 알림");
    }
}
