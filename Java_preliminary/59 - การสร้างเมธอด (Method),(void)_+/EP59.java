public class EP59 {
    //void ใช้ประกาศ Method ที่ไม่ต้องการ return ค่ากลับ
    public static void main(String[] args) {
        System.out.println("sss");
        display();
        display();
        plus();
        openvideo();
        playvideo();
        pausevideo();
        // System.out.println(pausevideo()); ไม่ได้
    }

    //การสร้าง method
    static void display(){ //ต้องกำหนดเป็น static เพื่อเรียกโดยไม่ต้องสร้าง Object
        //กลุ่มคำสั่งที่อยากให้ทำงาน
        System.out.println("display");
    }
    static void plus(){
        int a = 10;
        int b = 20;
        int c=a+b;
        System.out.println("ผลบวก = "+c);
    }
    static void openvideo(){
        System.out.println("openvideo");
    }
    static void playvideo(){
        System.out.println("playvideo");
    }
    static void pausevideo(){
        System.out.println("pausevideo");
    }
}
