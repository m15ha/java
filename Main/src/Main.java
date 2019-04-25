public class Main {
    public static void main(String[] args) {
        Box myBox = new Box();
        myBox.height = 12;
        myBox.width = 1;
        myBox.length = 13;
        myBox.ShowVolume();
        double volume = myBox.volume();
        System.out.println(volume);
    }
}
