import java.util.Scanner;
public class EP30 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.print("ป้อนอายุของคุณ : ") ;
        int age=kb.nextInt();
        if(age>=15){
            System.out.println("คำนำหน้า:นาย/นางสาว");
        }else{
            System.out.println("คำนำหน้า:เด็กชาย/เด็กหญิง");
        }
        System.out.println("จบโปรแกรม") ;
    }
}

