package anotherExperiments.SOLID.DIP;

public class SimpleLogin implements Authenticator {

    @Override
    public boolean authentificate(User user) {
        // something logic database
        return true;
    }
}
