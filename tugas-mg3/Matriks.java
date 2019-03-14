import java.util.Scanner;

class Matriks {
    Scanner input = new Scanner(System.in);
    void input_matrix(int matrix[][]) {
        for (int i=0;i<2;i++) {
            for (int j=0;j<2;j++) {
                System.out.print("matriks kolom ke " + i+1 + " Baris ke " + j+1 + " : " );
                matrix[i][j] = input.nextInt();
            }
        }
    }
    int[][] tambah_matrix(int a[][],int b[][]) {
        int result[][] = new int[2][2];
        for (int i=0;i<2;i++) {
            for (int j=0;j<2;j++) {
                result[i][j] = a[i][j] + b[i][j];
            }
        }
        return result;
    }
    void show_matrix(int matrix[][]) {
        for (int i=0;i<2;i++) {
            for (int j=0;j<2;j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.print("\n");
        }
    }
    public static void main(String[] args) {
        Matriks mat1 = new Matriks();
        int a[][] = new int[2][2];
        int b[][] = new int[2][2];
        mat1.input_matrix(a);
        mat1.show_matrix(a);
        mat1.input_matrix(b);
        mat1.show_matrix(b);
        System.out.println("Hasil pertambahan matrix : ");
        mat1.show_matrix(mat1.tambah_matrix(a,b));
    }
}