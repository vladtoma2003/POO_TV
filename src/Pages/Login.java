package Pages;

import Data.Page;

import java.util.Arrays;

public class Login extends Page {
    private final static String name = "login";
    private final static String destinations[] = {};
    private final static String actions[] = {"login"};

    public static boolean canDoAction(String action) {
        return Arrays.asList(actions).contains(action);
    }

    @Override
    public String getName() {
        return name;
    }

    public String[] getDestinations() {
        return destinations;
    }

    public String[] getActions() {
        return actions;
    }
}
