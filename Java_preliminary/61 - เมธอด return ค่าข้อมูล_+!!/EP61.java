public class EP61 {
    public static void main(String[] args) {
        System.out.println("ddd"+a());
        String a=a();
        System.out.println("a"+a);

        // int b=b();

        double c=c();
        System.out.println("c"+c);

        double d=d();
        System.out.println("d"+d);

        // int d2=d();
        // System.out.println(d2); ไม่ได้

        float f=f();
        System.out.println("f"+f);

        // int f2=f();
        // System.out.println(f2); ไม่ได้

        float g=100;
        System.out.println("g"+g);
        // float g2=100.0; ไม่ได้

        double h=100;
        System.out.println("h"+h);
        double i=100.0;
        System.out.println("i"+i);

        // System.out.println(z());
    }


    static String a(){
        return "ddd";
    }
    // static String b(){
    //     return "55";
    // } ไม่ได้

    static int c(){
        return 100;
    }

    static double d(){
        return 100;
    }

    // static int e(){
    //     return 100.0;
    // } ไม่ได้

    static float f(){
        // return 100.0; ไม่ได้
        return 100;
    }
    // static int z(){
    //     int x=10+20;
    //     System.out.println(x);
    // } ไม่ได้เพราะ ไม่มี return


}
