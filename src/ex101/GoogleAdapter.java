package ex101;

public class GoogleAdapter extends Profile {
    private GoogleProfile googleProfile;

    public GoogleAdapter(GoogleProfile googleProfile) {
        this.googleProfile = googleProfile;
    }

    @Override
    public int getId() {
        return 0;
    }

    @Override
    public String getName() {
        return "";
    }
}
