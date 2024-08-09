import java.util.Scanner;
class Example1 {
    public static void main(String args[]) {
        int num[] = new int[10];
        Scanner in = new Scanner(System.in);
        float sum = 0f, avg = 0f;
        for(int i = 0; i < num.length; i++) {
            System.out.print("Enter Number " + (i + 1) + " : ");
            num[i] = in.nextInt();
            sum += num[i];
        }
        avg = sum / num.length;
        System.out.println("Sum : " + sum);
        System.out.println("Average : " + avg);
        in.close();
    }
}