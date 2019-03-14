class PassedByValue {
    public static void main(String[] args) {
        int x,y;
        TestPass z;
        z = new TestPass(50,100);
        x = 10;
        y = 20;

        System.out.println("BEFORE PASSED BY VALUE : ");
        System.out.println("X = " + x);
        System.out.println("Y = " + y);

        z.calculate(x,y);
        
        System.out.println("AFTER PASS VALUE : ");
        System.out.println("X = " + x);
        System.out.println("Y = " + y);

        System.out.println("BEFORE PASSED BY REF : ");
        System.out.println("z.i = " + z.i);
        System.out.println("z.j = " + z.j);

        z.calculate(z);

        System.out.println("AFTER PASSED BY REF : ");
        System.out.println("z.i = " + z.i);
        System.out.println("z.j = " + z.j);

    }
}