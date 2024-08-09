import java.util.Scanner;
class Example4 {
    public static void main(String args[]) {
        String str[];
        int i, j;
        str = new String[10];
        Scanner in = new Scanner(System.in);
        for(i = 0 ; i < str.length; i++) {
            System.out.print("Enter String " + (i + 1) + " : ");
            str[i] = in.nextLine();
        }
        for(i = 0; i < str.length - 1; i++) {
            for(j = i + 1; j < str.length; j++) {
                if(str[i].compareTo(str[j]) > 0) {
                    String temp = str[i];
                    str[i] = str[j];
                    str[j] = temp;
                }
            }
        }
        for(String x : str)
            System.out.print(x + " ");
    }
}