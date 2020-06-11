package GUI.lesson3;

public class UserException extends Exception {
    public static final int NO_NAME = 1;
    public static final int NO_EMAIL = 2;
    private int code;

    public UserException(int code) {
        this.code = code;
    }

    public int getCode() {
        return this.code;
    }
}

