package sumaverager;

import java.util.Scanner;

public class SumAverager {

    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        final int ROW = 3, COL = 4;
        int[][] score = new int[ROW][COL];
        int data, sum = 0;
        for (int i = 0; i < ROW; i++) {
            for (int j = 0; j < COL; j++) {
                System.out.print("ใสค่า" + i + "][" + j + "]=");
                data = reader.nextInt();
                score[i][j] = data;
                sum = score[i][j];
            }

        }
        System.out.println("\t ผลรวม ");
        System.out.println();

        for (int l = 1; l <= 100; l++){
            System.out.print("..!..");
        }
        
        System.out.println();
        for (int i = 0; i < ROW; i++) {
            for (int j = 0; j < COL; j++) {
                System.out.print("\t" + score[i][j]);
            }

            System.out.println();

        }
        System.out.println("แสดงผม" + sum);
        System.out.println("(ค่าเฉลี่ย=" + (float) sum / (ROW) * (COL));
    }
}
