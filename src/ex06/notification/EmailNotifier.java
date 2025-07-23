package ex06.notification;

public class EmailNotifier implements Notifier {
    private Notifier notifier;

    public EmailNotifier(Notifier notifier) {
        this.notifier = notifier;
    }

    public EmailNotifier() {
    }

    @Override
    public void send() {
        System.out.println("이메일 전송");
        if (notifier != null) {
            notifier.send();
        }
    }
}
