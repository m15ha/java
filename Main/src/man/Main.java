package man;

public class Main {
    public static void main(String[] args) {
        String s = "This is Ivan, his 34 yo. Hi is programmer, his 165.4";
        String name = s.substring(8, 12);
        String positions = s.substring(15, 19);
//                String positions = s.substring(23, 29);
//                String height = s.substring(35, 40);
        Man myMan = new Man(name, positions);
        System.out.println(myMan.getName() + myMan.getPositions());
    }
}
