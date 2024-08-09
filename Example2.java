class Example2 {
    public static void main(String args[]) {
        int num[], i, j;
        for(i = 100, j = 1; i < 200; i += 5, j++);  // j = 21
        num = new int[j];
        for(i = 100, j = 0; j < num.length; i += 5 , j++)
            num[j] = i;
        for(int x : num)
            System.out.println(x);

        for(i = 0; i < num.length; i++)
            System.out.println(num[i]);
    }
}