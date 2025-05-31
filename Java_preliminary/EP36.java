import java.util.Scanner;

public class EP36 {
    public static void main(String[] args) {
        //เขียนโปรแกรมหา / เลขคี่
        Scanner kb=new Scanner(System.in);
        System.out.print("ป้อนตัวเลขจำนวนเต็ม = ");
        int number=kb.nextInt();

        String result="";

        if(number%2 == 0){
            result=number+"เลขคู่";
        }else{
            result=number+"เลขคี่";
        }
        System.out.println(result);

        //ตัวแปร = (เงื่อนไข) ?คำสั่งเมื่อเงื่อนไขเป็นจริง :คำสั่งเมื่อเงื่อนไขเป็นเท็จ;
        result = number%2 == 0 ? number+" = เลขคู่" : number+ " = เลขคี่";
        System.out.println(result);
        kb.close();
    }

}
