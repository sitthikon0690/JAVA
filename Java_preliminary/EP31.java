import java.util.Scanner;
public class EP31 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.print("ป้อนอายุของคุณ : ") ;
        int age=kb.nextInt();
        if(age>=15 && age<=19){
            System.out.println("วัยรุ่น" ) ;
        }
        else if(age>=20 && age<=29){
            System.out.println("วัยหนุ่ม/สาว");
        }
        else if(age>=30){
            System.out.println("วัยทำงาน");
        }
        else if(age>=40){
            System.out.println("วัยกลางคน");
        }
        else if(age>=60){
            System.out.println ("วัยชรา") ;
        }
        else{
            System.out.println("ไม่พบช่วงอายุ");
        }
        System.out.println("จบโปรแกรม") ;
        kb.close();
    }
}
