package anotherExperiments.SOLID.DIP;

public class LoginManager {
    SimpleLogin simpleLogin = new SimpleLogin();

    public void login(User user) {
        simpleLogin.authentificate(user);
    }
}
