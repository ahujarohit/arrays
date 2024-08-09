import java.util.Scanner;
class Example3 {
    public static void main(String args[]) {
        int num[], i, j;
        num = new int[10];
        Scanner in = new Scanner(System.in);
        for(i = 0 ; i < num.length; i++) {
            System.out.print("Enter Number " + (i + 1) + " : ");
            num[i] = in.nextInt();
        }
        for(i = 0; i < num.length - 1; i++) {
            for(j = i + 1; j < num.length; j++) {
                if(num[i] < num[j]) {
                    int temp = num[i];
                    num[i] = num[j];
                    num[j] = temp;
                }
            }
        }
        for(int x : num)
            System.out.print(x + " ");
    }
}