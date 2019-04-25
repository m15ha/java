package monster;

import java.sql.SQLOutput;

public class Monster {
    int Head;
    int Arm;
    int Legs;

    public Monster() {
        this.Head = 2;
        this.Arm = 2;
        this.Legs = 2;
    }

    public Monster(int head) {
        Head = head;
        this.Arm = 2;
        this.Legs = 2;
    }

    public Monster(int head, int arm) {
        Head = head;
        Arm = arm;
    }

    public Monster(int head, int arm, int legs) {
        Head = head;
        Arm = arm;
        Legs = legs;
    }
    void voice(){
        System.out.println("Voice");
    }
    void voice (int iz){
        for (int i = 0; i < iz; i++){
            System.out.println("voice");
        }
    }
    void voice (int iz, String ez){
        for (int i = 0; i < iz; i++){
            System.out.println(ez);
        }

    }
}
