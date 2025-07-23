package ex08.polling;

public class App {
    public static void main(String[] args) {
        LotteMart lotteMart = new LotteMart();
        Customer1 customer1 = new Customer1();

        // 1. 마트는 입고 준비
        new Thread(() -> lotteMart.received()).start(); // 5초)

        // 2. 입고 확인 (데몬)
        while (true) {
            try {
                // 폴링에서 가장 중요한 점(기억해야 할 점) 비지니스 파악을 잘 해야 한다.(sleep시간(주기)를 잘 알아야 한다.), 요청 주기/횟수의 선택이 폴링의 주요 포인트
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            if (lotteMart.getValue() != null) { // request polling
                customer1.update(lotteMart.getValue() + "이 들어왔습니다.");
                break;
            } else {
                System.out.println("상품 안 들어옴");
            }
        }
        
    }
}
