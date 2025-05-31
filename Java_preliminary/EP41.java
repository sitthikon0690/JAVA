import java.util.Scanner;
public class EP41 {
    public static void main(String[] args) {
        Scanner kb=new Scanner(System.in);
        System.out.print("ป้อนเลขเดือน = ") ;
        int month = kb.nextInt();
        String name;
        // if(month == 1){
        //     name = "มกราคม" ;
        // }
        // else if(month == 2){s
        //     name = "กุมภา" ;
        // }
        // else if(month == 3){
        //     name = "มีนา" ;
        // }else{
        //     name = "เดือนอื่นๆ";
        // }
        // System.out.println(name);

        switch (month){
            case 1:
                name = "มกราคม" ;
                break;
            case 2:
                name ="กุมภา" ;
                break;
            case 3:
                name="มีนา";
                break;
            default:
                name="เดือนอื่นๆ" ;
        //break ใส่ไม่ใสก็ได้
        }
        System.out.println(name);
        kb.close();
    }
}
