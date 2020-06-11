package Sumin.lesson17;

public class UserExeption extends Exception{
    final static public int SHORT_LOGIN = 1;
    final static public int LONG_LOGIN = 2;
    private int code;

    public UserExeption(int code) {
        this.code = code;
    }

    public int getCode() {
        return code;
    }
}
