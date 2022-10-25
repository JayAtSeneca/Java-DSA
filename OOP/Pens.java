public class Pens{
    public static void main(String[] args) {
        Pen p = new Pen();
        Pen.tip = 30;
        System.out.print(Pen.tip);
    }
}
class Pen{
    String color;
    static int tip;
    void setColor(String newColor){
        this.color = newColor;
    }
    void setTip(int newTip){
        this.tip = newTip;
    }
}