package ex06.notification;

public class SMSNotifier implements Notifier {
    private Notifier notifier;

    public SMSNotifier(Notifier notifier) {
        this.notifier = notifier;
    }

    public SMSNotifier() {
    }

    public void send() {
        System.out.println("문자 알림");
        if (notifier != null) {
            notifier.send();
        }
    }
}
