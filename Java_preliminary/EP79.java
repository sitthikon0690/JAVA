import java.util.Scanner;
public class EP79 {
    static int balance=5000;
    public static void main(String[] args) {
        Scanner kb=new Scanner(System.in);
        try {
            System.out.print(": ");
            int monny = kb.nextInt();
            withDraw(monny);
        } catch (Exception e) {
            System.out.println(e);
        }finally{
            kb.close();
        }
    }
    public static void withDraw(int a) throws Exception{
        if(a<=0){
            throw new Exception("ต้องมากกว่า0");
        }
        if(a>balance){
            throw new Exception("ยอดเงินไม่พอ");
        }
        System.out.println("เหลือ "+(balance-a));

        
    }
}
