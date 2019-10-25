package Rusakov.lesson3;

public class UserSocial extends User {
    private String userName;
    private int userAge;

    public UserSocial(int id, String login, String password, String userName, int userAge) {
        super(id, login, password);
        this.userName = userName;
        this.userAge = userAge;
    }

    public UserSocial(String userName, int userAge) {
        this.userName = userName;
        this.userAge = userAge;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public int getUserAge() {
        return userAge;
    }

    public void setUserAge(int userAge) {
        this.userAge = userAge;
    }
    
}
