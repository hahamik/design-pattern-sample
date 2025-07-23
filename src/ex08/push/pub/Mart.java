package ex08.push.pub;

import ex08.push.sub.Customer;

public interface Mart { // 퍼블리셔 인터페이스 출판자는 2가지 책임이 있음(구독,출판(알림))
    // 1. 구독 -> 컬렉션에 고객을 저장함
    void add(Customer customer);

    // 2. 구독 취소
    void remove(Customer customer);

    // 3. 출판 -> 물건 받음
    void received();

    // 4. 알림
    void notify(String msg);
}
