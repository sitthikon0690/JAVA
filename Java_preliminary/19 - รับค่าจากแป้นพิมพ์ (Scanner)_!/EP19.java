import java.util.Scanner;

class EP19 {
    public static void main(String[] args) {
        // รับค่าข้อมูล
        // ข้อมูลแบบไหน ? ตัวเลข integer ,float , long , double , ข้อความ string
        // ข้อความทำอะไร
        //ข้อความแบบตัวเลข => คำนวณได้ | คำนวณไม่ได้
        // ประกาศใช้งาน Class | new
        Scanner sc=new Scanner(System.in);
        System.out.print("ป้อนชื่อของคุณ = ");
        String name=sc.nextLine(); // รับค่า String จากแป้นพิมพ์ => name
        System.out.print("ป้อนชื่อของคุณ = ");
        String name2=sc.next(); //เว้นวรรคไม่ได้
        System.out.print("ป้อนปี้เกิด พ.ศ = ");
        int year=sc.nextInt();// รับค่า integer จากแป้นพิมพ์ =>year
                   //.nextDouble()
                   //.nextFlaot(
        int age= 2563 - year;// คำนวณอายุ

        System.out.println("ชื่อของคุณ คือ = "+name) ; // แสดงข้อความที่พิมพ์
        System.out.println("ปีเกิด = "+year);
        System.out.println("อายุ = "+age);
        System.out.println(name2);
        sc.close();
    }
}
