package anotherExperiments.SOLID.DIP;

public class LoginManager {
    Authenticator authenticator;

    public LoginManager(Authenticator authenticator) {
        this.authenticator = authenticator;
    }

    public void login(User user) {
        authenticator.authentificate(user);
    }
}
