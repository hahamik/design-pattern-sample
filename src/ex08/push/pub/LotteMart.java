package ex08.push.pub;

import ex08.push.sub.Customer;

import java.util.ArrayList;
import java.util.List;

public class LotteMart implements Mart {
    // 메서드를 구현할 때는 각 메서드의 책임을 분명히 알아야 한다.

    // 구독자 명단
    private List<Customer> customerList = new ArrayList<>();

    // 구독 등록
    @Override
    public void add(Customer customer) {
        customerList.add(customer);
    }

    // 구독 취소
    @Override
    public void remove(Customer customer) {
        customerList.remove(customer);
    }

    // 출판의 핵심 :
    @Override
    public void received() {

        for (int i = 0; i < 5; i++) {
            System.out.println(".");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        notify("롯데마트 바나나 입고됨");
    }

    @Override
    public void notify(String msg) {
        customerList.forEach(customer -> customer.update(msg));
    }
}
