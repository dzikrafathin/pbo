public class Counter {
    private static int num = 0;

    public int showScore() {
        return num;
    }

    public static void addScore(int add) {
        num += add;
    }
}