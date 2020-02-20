package Sumin.lesson2;

public class Monster {
    int qtyArm;
    int qtyLegs;
    int qtyEyes;

    public Monster() {
        this.qtyArm = 2;
        this.qtyLegs = 2;
        this.qtyEyes = 2;
    }

    public Monster(int qtyEyes) {
        this.qtyEyes = qtyEyes;
        this.qtyArm = 2;
        this.qtyLegs = 2;
    }

    public Monster(int qtyArm, int qtyEyes) {
        this.qtyArm = qtyArm;
        this.qtyEyes = qtyEyes;
        this.qtyLegs = 2;
    }

    public Monster(int qtyArm, int qtyLegs, int qtyEyes) {
        this.qtyArm = qtyArm;
        this.qtyLegs = qtyLegs;
        this.qtyEyes = qtyEyes;
    }

    public void voice() {
        System.out.println("voice");
    }

    public void voice(int qtyVoice) {
        String result = "";
        for (int i = 0; i < qtyVoice; i++) {
            result += "voice";
        }
        System.out.println(result);
    }

    public void voice(int qtyVoice, String soundVoice) {
        String result = "";
        for (int i = 0; i < qtyVoice; i++) {
            result += soundVoice;
        }
        System.out.println(result);
    }

}
