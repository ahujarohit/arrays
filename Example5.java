import java.util.Scanner;
class Example5 {
    public static void main(String args[]) {
        int num[][] = new int[2][3];
        int i, j, sum = 0;
        int rowSum[] = new int[num.length];         //3
        int columnSum[] = new int[num[0].length];   //4
        Scanner in = new Scanner(System.in);
        for(i = 0; i < num.length; i++) {
            for(j = 0; j < num[i].length; j++) {
                System.out.print("Enter Element [" + i + "," + j + "] : ");
                num[i][j] = in.nextInt();
                rowSum[i] += num[i][j];
                columnSum[j] += num[i][j];
                sum += num[i][j];
            }
        }
        for(i = 0; i < num.length; i++) {
            for(j = 0; j < num[i].length; j++) {
                System.out.print(num[i][j] + "\t");
            }
            System.out.println(rowSum[i]);
        }
        for(j = 0; j < columnSum.length; j++)
            System.out.print(columnSum[j] + "\t");
        System.out.println(sum);

    }
}