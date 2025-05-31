public class Main8 extends Company8{
    public static void main(String[] args) {
        // Programmer p1=new Programmer("a",3000.0);
        // Accounting ac=new Accounting("a",300.0);
        System.out.println(Company8.name);
        System.out.println(Company8.name="dddd");
        System.out.println(Company8.name2);
        // System.out.println(Company.name2="dddd"); ไม่ได้
        Company8 C8=new Company8();
        C8.displayEmployee();
        
    }
    // public void displayEmployee2() {
    //     System.out.println("final method");      
    // } คลาสแม่กำหนดให้ method นี้เป็น final จึงไม่สามรถ overriding(กำหนดคุณสมบัติให้เมธอดที่สืบทอดจากคลาสแม่)
}
