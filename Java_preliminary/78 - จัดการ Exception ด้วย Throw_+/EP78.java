import java.util.Scanner;
import java.util.InputMismatchException;//ต้อง import
public class EP78 {
    public static void main(String[] args) {
        Scanner kb=new Scanner(System.in);
        try {
            System.out.print(": ");
            int a = kb.nextInt();//ป้อนติดลบ
            int b=5000;
            if(a<=0){
                throw new Exception("ต้องมากกว่า0");//ถ้า throw ทำงาน จะหยุดโปรแกรม
            }
            if(a>b){
                // throw new Exception("ยอดเงินไม่พอ");  มีได้แค่อันเดียว
                throw new InputMismatchException("ยอดเงินไม่พอ");
            }
            System.out.println("เหลือ "+(b-a));
        } catch (Exception e) {
            System.out.println(e);
        }finally{
            kb.close();
        }
    }
}
