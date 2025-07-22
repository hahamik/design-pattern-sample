package ex03;

public class App {
    public static void main(String[] args) {
        Animal mouse = new Mouse();
        Doorman doorman = new Doorman();
        doorman.쫓아내(mouse);

        TigerAdapter tigerAdapter = new TigerAdapter(new OuterTiger());
        doorman.쫓아내(tigerAdapter);
    }
}
