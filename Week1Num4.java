public class Week1Num4 {
    public static void main(String[] args) {
        Point p = new Point();
        Point p1 = new Point();
        p1.x = 2;
        p1.y = 3;
        Point p2 = new Point();
        p2.x = 7;
        p2.y = -1;
        p.addKoordinat(p1, p2);
        System.out.println(p1.x+","+p1.y);
    }
}