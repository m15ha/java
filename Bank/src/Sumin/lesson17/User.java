package Sumin.lesson17;

public class User {
    private String Login;

    public void setLogin(String login) throws UserExeption {
        if (login.length() < 3) throw new UserExeption(UserExeption.SHORT_LOGIN);
        if (login.length() > 6) throw new UserExeption(UserExeption.LONG_LOGIN);
        Login = login;
    }

    public String getLogin() {
        return Login;
    }

}
