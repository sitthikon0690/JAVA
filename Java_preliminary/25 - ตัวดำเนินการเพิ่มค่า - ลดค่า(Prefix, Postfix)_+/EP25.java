class EP25{
    public static void main(String[] args) {
        int a=5;
        //prefix หน้า เพิ่มลดก่อน
        System.out.println("prefix หน้า เพิ่มลดก่อน");
        System.out.println(a);//5
        System.out.println(++a);//6
        System.out.println(a);//6

        a=5;
        //prefix หน้า เพิ่มลดก่อน
        System.out.println("prefix หน้า เพิ่มลดก่อน");
        System.out.println(a);//5
        System.out.println(--a);//4
        System.out.println(a);//4

        a=5;
        //postfix หน้า เพิ่มลดหลัง
        System.out.println("postfix หน้า เพิ่มลดหลัง");
        System.out.println(a);//5
        System.out.println(a++);//5
        System.out.println(a);//6

        a=5;
        //postfix หน้า เพิ่มลดหลัง
        System.out.println("postfix หน้า เพิ่มลดหลัง");
        System.out.println(a);//5
        System.out.println(a--);//5
        System.out.println(a);//4

    }
}