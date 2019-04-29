package rect;

public class Rect {
    int lenght;
    int width;
    void setRect1 (int lenght, int width){
        this.lenght = lenght;
        this.width = width;
    }
    int Rect1(){
        return width * lenght;
    }
    int Rect2(){
        return width + lenght;
    }
}
