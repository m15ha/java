package GUI.lesson3;

    import java.util.ArrayList;
            import java.util.function.Consumer;

public class User {
    private String name;
    private String email;
    private boolean news;
    private static ArrayList<User> users = new ArrayList();

    public User(String name, String email, boolean news) throws UserException {
        if (name.length() == 0) {
            throw new UserException(1);
        } else if (email.length() == 0) {
            throw new UserException(2);
        } else {
            this.name = name;
            this.email = email;
            this.news = news;
        }
    }

    public static void add(User user) {
        users.add(user);
    }

    public static void printAllUsers() {
        users.forEach((t) -> {
            System.out.println(t);
        });
    }

    public String toString() {
        return "Пользователь name=" + this.name + "; email=" + this.email + "; news=" + this.news;
    }
}
