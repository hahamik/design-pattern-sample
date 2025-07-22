package ex99;

public class NaverAdapter extends UserProfile {
    private NaverProfile naverProfile;

    public NaverAdapter(NaverProfile naverProfile) {
        this.naverProfile = naverProfile;
    }

    @Override
    public String getUsername() {
        return naverProfile.getMainName();
    }

    @Override
    public int getId() {
        return naverProfile.getId();
    }
}
