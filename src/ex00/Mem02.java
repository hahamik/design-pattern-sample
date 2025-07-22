package ex00;

abstract class Car {
    abstract void run();
}

class Genesis extends Car {
    // 재정의
    void run() {
        System.out.println("Genesis run");
    }
}

class Sonata extends Car {
    void run() {
        System.out.println("Sonata run");
    }
}

public class Mem02 {
    static void start(Car car) { // 타입 하나로 묶어서 사용 가능
        car.run();
    }

    public static void main(String[] args) {
        Car car1 = new Sonata();
        Car car2 = new Genesis();
        start(car1);
        start(car2);
    }
}
