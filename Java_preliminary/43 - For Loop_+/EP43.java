public class EP43 {
    public static void main(String[] args) {
        //3 ส่วน
        // ส่วนตัวแปรเริ่มต้น => ตัวนับรอบ
        // เงื่อนไข
        // การเพิ่มค่า / ลดค่า
        /*for (ตัวแปรเริ่มต้น ; เงื่อนไข; การเพิ่มค่า / ลดค่า){
            int count; Global Variable
            for(count=1)
            for(int count=1)Local Variable
        }*/
        for(int count=1; count<=5; count++){
            System.out.println(count);
        }

        int i=1;
        for(String count="a"; count=="a";){
            System.out.println("รอบที่"+i++);
            if(i==5) break;
        }
        
        for(int count=1; count>=-5;){
            System.out.println(count--);
        }

        int count=1;
        for(count=2; count<=5; count++){
            System.out.println(count);
        }
        System.out.println(count+"จบ");
}
}
