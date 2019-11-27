package Rusakov.lesson6;

public class UserExeption extends Exception {
    final static public int LONG = 1;
    final static public int SHORT = 2;
    private int code;

    public UserExeption(int code) {
        this.code = code;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
