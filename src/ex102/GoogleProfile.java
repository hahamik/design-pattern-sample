package ex102;

public class GoogleProfile {
    private int id;
    private String username;

    public GoogleProfile(int id, String username) {
        this.id = id;
        this.username = username;
    }

    public int getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }
}