class VarArgs {
    public static int sum(int... num) {
        int sum = 0;
        for(int i = 0; i < num.length; i++)
            sum += num[i];
        return sum;
    }
    public static void main(String... args) {
        System.out.println(sum(10, 20, 30));
        System.out.println(sum());
        System.out.println(sum(10, 20, 30, 40, 50));
        int num[] = {10, 20, 30, 40, 50, 60};
        System.out.println(sum(num));
    }
}