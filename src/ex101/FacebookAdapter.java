package ex101;

public class FacebookAdapter extends Profile {
    private FacebookProfile facebookProfile;

    public FacebookAdapter(FacebookProfile facebookProfile) {
        this.facebookProfile = facebookProfile;
    }

    @Override
    public int getId() {
        return facebookProfile.getuId();
    }

    @Override
    public String getName() {
        return facebookProfile.getuName();
    }
}
