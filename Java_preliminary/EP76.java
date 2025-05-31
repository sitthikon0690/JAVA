import java.util.InputMismatchException;
import java.util.Scanner;

public class EP76 {
    public static void main(String[] args) {
        try {
            int a=10;
            int b=0;
            System.out.println((a/b));
            
        } catch (Exception e) {
            System.out.println("->"+e);
        }
        try {
            Scanner kb=new Scanner(System.in);
            System.out.print(" : ");
            int a=kb.nextInt();
            int b=0;
            System.out.println((a/b));
            kb.close();
            
        } catch (ArithmeticException o) {//ต้องมี ตัวรับ
            System.out.println("ห้ามหารด้วย 0");
        } catch (InputMismatchException e) {
            System.out.println("ต้องป้อนตัวเลข");
        }
        /*คลาสประเภท Exception ที่สำคัญและพบบ่อย

        ArithmeticException

        ArrayIndexOutOfBoundsException

        EOFException

        FileNotFoundException

        InterruptedException

        IOException

        NullPointerException

        NumberFormatException */
        //http://code.function.in.th/java/exception
    }
}
