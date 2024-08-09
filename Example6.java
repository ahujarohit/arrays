class Example6 {
    public static void main(String args[]) {
        int[] []num[] = {
            {{10,20,30},{30,40}},
            {{10,20,30,42,52}},
            {{123},{10,20,30},{30,40}},
            {{10,20,30,40,50,60},{30,40},{40},{33,40}},
            {{10,20,30,40,50}}
        };
        System.out.println(num.length);     //5
        System.out.println(num[2].length);  //3
        System.out.println(num[3][2].length);   //1  
        System.out.println(num[3][3][0]);   //33  
        System.out.println(num[2][0][0]);   //123
        
        // for(int i = 0; i < num.length; i++) {
        //     for(int j = 0; j < num[i].length; j++) {
        //         for(int k = 0; k < num[i][j].length; k++)
        //                 System.out.print(num[i][j][k] + ",");
        //         System.out.println();        
        //     }
        // }

        for(int i[][] : num) {
            for(int j[] : i) {
                for(int k : j)
                    System.out.print(k + ",");
                System.out.println();
            }
        }
    }
}









