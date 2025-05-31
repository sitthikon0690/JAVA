class EP17 {
    public static void main(String[] args) {
        /*string คือ ชนิดข้อมูลที่เก็บชุดข้อความ
        symbol
        char เก็บตัวอักษร
        char เรียงต่อกัน = > string*/
        String a="100",b="200",e="100",g="100" ;
        a=a+50;// "100"+50
        System.out.println(a);
        System.out.println(b);

        int c;
        // string => int
        c=Integer.parseInt(e);
        c=c+50;//คำนวณเลข 100 + 50
        System.out.println(c);

        // string => Double
        double f=Double.parseDouble(g);
        f=f+3.55;
        System.out.println(f);

        // Integer => string
        int num1=100;
        String age = String.valueOf(num1);
        System.out.println(age);

        // Integer => string
        String num2="100";
        int age2 = Integer.valueOf(num2);
        System.out.println(age2);
    }
    
}
