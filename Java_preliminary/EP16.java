class EP16 {
    public static void main(String[] args) {
        /*1.Widening Casting คือการแปลงข้อมูลที่มีขนาดเล็กไปสู่ข้อมูลขนาดใหญ่ (แบบอัตโนมัติ)  */
        int numInt=10;
        double numDouble=(numInt);
        System.out.println(numInt);
        System.out.println(numDouble);

        /*2.Narrowing Casting คือการแปลงข้อมูลที่มีขนาดใหญไปสู่ข้อมูลที่มีขนาดเล็ก (ทําเอง) */
        double numDouble2=10.0;
        int numInt2=(int)numDouble2;
        System.out.println(numInt2);
        System.out.println(numDouble2);


    }
    
}
