package ex08.polling;

public class App {
    public static void main(String[] args) {
        LotteMart lotteMart = new LotteMart();
        Customer1 customer1 = new Customer1();

        // 1. 마트는 입고 준비
        new Thread(() -> lotteMart.received()).start(); // 5초)

        // 2. 입고 확인
        String value = lotteMart.getValue();
        System.out.println("받은 값 : " + value);
    }
}
