import java.util.Scanner;

public class EP51 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while(true){
            System.out.print("ป้อนตัวเลข :");
            int number=sc.nextInt();
            if(number<0)break;
            if(number%2==0) System.out.println("เป็นเลขคู่");
            else System.out.println("เป็นเลขคี่");
        }
        sc.close();
    }
}
