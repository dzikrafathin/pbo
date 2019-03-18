public class CounterMain {
    public static void main(String args[]) {
        Counter c1 = new Counter();
        Counter c2 = new Counter();
        Counter c3 = new Counter();

        Counter.addScore(100);
        c1.addScore(120);
        c2.addScore(44);
        c3.addScore(67);
        System.out.println(c1.showScore());
        System.out.println(c2.showScore());
        System.out.println(c3.showScore());
    }
}