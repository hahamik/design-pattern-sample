package ex08.push.sub;

public interface Customer { // 핵심 : 알림,  -> 구독자임 구독의 책임x 구독을 호출하기만 함
    void update(String msg);
}
