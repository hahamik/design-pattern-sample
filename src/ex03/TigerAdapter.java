package ex03;

public class TigerAdapter extends Animal {
    private OuterTiger outerTiger;

    public TigerAdapter(OuterTiger outerTiger) {
        this.outerTiger = outerTiger;
    }

    public String getName() {
        return outerTiger.getFullName();
    }
}
