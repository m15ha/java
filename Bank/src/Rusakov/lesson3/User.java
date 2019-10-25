package Rusakov.lesson3;

public class User {
    int id;
    String login;
    String password;

    public User(int id, String login, String password) {
        this.id = id;
        this.login = login;
        this.password = password;
    }

    public User(){
        this(18, "Default", "Default");
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;

    }

    public String getInfo() {
        System.out.println("id = " + id + "; Login: " + login + "; Password: " + password);
        return null;
    }

    public void whoIsOlder(User u) {
        if (this.id > u.id) {
            System.out.println(this.id + " bigger " + u.id);
        } else if (this.id < u.id) {
            System.out.println(this.id + " smaller " + u.id);
        } else System.out.println(this.id + " the same " + u.id);
    }
}
