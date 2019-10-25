package Rusakov.lesson3;

public class WebMaster extends User{
    private String webAddress;

    public WebMaster(int id, String login, String password, String webAddress) {
        super(id, login, password);
        this.webAddress = webAddress;
    }

    public WebMaster(String webAddress) {
        this.webAddress = webAddress;
    }

    public String getWebAddress() {
        return webAddress;
    }

    public void setWebAddress(String webAddress) {
        this.webAddress = webAddress;
    }

    @Override
    public String getInfo() {
        String s = super.getInfo();
        s += "; www " + this.webAddress;
        return s;
    }
}
