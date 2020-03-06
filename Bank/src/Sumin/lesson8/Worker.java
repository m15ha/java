package Sumin.lesson8;

public class Worker {
    private String name;

    public String getName() {
        return name;
    }

    public Worker(String name) {
        this.name = name;
    }

    public void voice(){
        System.out.println(name);
    }
}
