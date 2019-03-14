import java.util.Scanner;

class SPOJ1 {
    public static void main(String[] args) {
        int number = 0;
        Scanner input = new Scanner(System.in);
        while (true) {
            number = input.nextInt();
            if (number == 42) {
                break;
            }
        }
        input.close();
    }
}