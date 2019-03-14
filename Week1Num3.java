public class Week1Num3 {
    public static void main(String[] args) {
        Point p1 = new Point();
        p1.x = 25;
        p1.y = 7;
        System.out.println(p1.x+","+p1.y);

        Point p2 = new Point();
        p2.x = 32;
        p2.y = -17;
        System.out.println(p2.x+","+p2.y);
    
        Point p3 = p2;

        System.out.println(p3.x+","+p3.y);
    
        p3 = p1;

        System.out.println(p3.x+","+p3.y);
    
    }
}