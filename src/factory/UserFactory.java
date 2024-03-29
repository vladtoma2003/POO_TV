package factory;

import data.User;
import fileio.Credentials;
import fileio.Userio;

public final class UserFactory {
    private static final int CINCISPE = 15;

    /**
     * Creates a new User type object
     *
     * @param user
     * @return
     */
    public static User newUser(final Userio user) {
        User newUser = new User();
        newUser.setCredentials(new Credentials());
        newUser.getCredentials().setName(user.getCredentials().getName());
        newUser.getCredentials().setPassword(user.getCredentials().getPassword());
        newUser.getCredentials().setBalance(user.getCredentials().getBalance());
        newUser.getCredentials().setCountry(user.getCredentials().getCountry());
        newUser.getCredentials().setAccountType(user.getCredentials().getAccountType());
        newUser.setTokensCount(0);
        newUser.setNumFreePremiumMovies(CINCISPE);
        newUser.getCredentials().setIntBalance(Integer.parseInt(newUser
                .getCredentials().getBalance()));
        return newUser;
    }

    /**
     * Creates a new User type object
     *
     * @param credentials
     * @return
     */
    public static User newUser(final Credentials credentials) {
        User newUser = new User();
        newUser.setCredentials(new Credentials());
        newUser.getCredentials().setName(credentials.getName());
        newUser.getCredentials().setPassword(credentials.getPassword());
        newUser.getCredentials().setBalance(credentials.getBalance());
        newUser.getCredentials().setCountry(credentials.getCountry());
        newUser.getCredentials().setAccountType(credentials.getAccountType());
        newUser.setTokensCount(0);
        newUser.setNumFreePremiumMovies(CINCISPE);
        newUser.getCredentials().setIntBalance(0);
        return newUser;
    }

    /**
     * Creates a new User type object
     *
     * @param user
     * @return
     */
    public static User newUser(final User user) {
        User newUser = new User();
        newUser.setCredentials(new Credentials());
        newUser.getCredentials().setName(user.getCredentials().getName());
        newUser.getCredentials().setPassword(user.getCredentials().getPassword());
        newUser.getCredentials().setBalance(user.getCredentials().getBalance());
        newUser.getCredentials().setCountry(user.getCredentials().getCountry());
        newUser.getCredentials().setAccountType(user.getCredentials().getAccountType());
        newUser.addMovies(user);
        newUser.setTokensCount(user.getTokensCount());
        newUser.setNumFreePremiumMovies(user.getNumFreePremiumMovies());
        newUser.getCredentials().setIntBalance(user.getCredentials().getIntBalance());
        return newUser;
    }

    private UserFactory() {

    }
}
