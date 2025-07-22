package ex99;

public class NaverAuthentication implements Authentication {

    public UserProfile login() {
        System.out.println("네이버 로그인 완료");
        return new NaverProfile(4, "haha");
    }
}
