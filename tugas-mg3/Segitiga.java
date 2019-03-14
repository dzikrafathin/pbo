import java.util.Scanner;

class Segitiga {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukan angka : ");
        int n = input.nextInt();
        int number = 0;
        for (int i=0;i<n;i++) {
            number++;
            for (int j=0;j<=i;j++) {
                System.out.print(number + " ");
            }
            System.out.print("\n");
        }
    }
}