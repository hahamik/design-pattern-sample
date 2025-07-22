package ex100;

public class GoogleProfile extends Profile {
    private int id;
    private String username;

    public GoogleProfile(int id, String username) {
        this.id = id;
        this.username = username;
    }

    @Override
    public int getId() {
        return id;
    }

    @Override
    public String getName() {
        return username;
    }
}