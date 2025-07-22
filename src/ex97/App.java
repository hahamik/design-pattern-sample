package ex97;


interface 나이프 {
    void 킬();

    void 요리();
}

abstract class 전투칼 implements 나이프 {
    @Override
    public void 요리() {

    }
}

abstract class 요리칼 implements 나이프 {
    @Override
    public void 킬() {

    }
}

class 덱스 extends 전투칼 {

    @Override
    public void 킬() {

    }
}

class 백종원 {

}

public class App {
    public static void main(String[] args) {

    }
}