package ex08.push;

import ex08.push.pub.EMart;
import ex08.push.pub.LotteMart;
import ex08.push.sub.Cus1;
import ex08.push.sub.Cus2;

public class App {
    public static void main(String[] args) {
        // 1. 객체 초기화
        LotteMart lotteMart = new LotteMart();
        EMart eMart = new EMart();
        Cus1 customer1 = new Cus1();
        Cus2 customer2 = new Cus2();

        // 2. 구독
        lotteMart.add(customer1);
        lotteMart.add(customer2);

        eMart.add(customer1);
        eMart.add(customer2);


        // 3. 구독 취소
        lotteMart.remove(customer2);

        // 3. 출판 (누가 할지는 나중에 정하면 됨) // callback 메서드 콜백이 안된다는건 동기 함수라는 거임.
        new Thread(() -> lotteMart.received()).start();
        new Thread(() -> eMart.received()).start();
    }
}
