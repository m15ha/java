package Rusakov.lesson6;

public class User {
    private String login;

    public void setLogin(String login) throws UserExeption{
        if (login.length() <= 3) throw new UserExeption(UserExeption.SHORT);
        if (login.length() > 6) throw new UserExeption(UserExeption.LONG);
        this.login = login;
    }

    public String getLogin() {
        return login;
    }

}
