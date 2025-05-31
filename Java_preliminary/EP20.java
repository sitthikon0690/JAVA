import java.util.Scanner;
class EP20 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("ป้อนชื่อของคุณ = ") ;
        String name2=sc.nextLine() ; //อ่านข้อความที่รับจากแป้นพิมพ์ทั้งบรรทัด รวมช่องว่างด้วย

        System.out.print("ป้อนชื่อของคุณ = ") ;
        String name=sc.next(); 
        System.out.println("ชื่อของคุณ คือ = "+name2 ) ;  //  แสดงข้อความที่พิมพ์
        System.out.println("ชื่อของคุณ คือ = "+name ) ; 
        sc.close();
    }
}
