public class EP53 {
    public static void main(String[] args) {
        // การสร้าง Array
        // แบบกำหนดขนาดเอาไว้
        // int[]number=new int[10];
        // กำหนดค่าลงไป
        // number[0] = 10;
        // number[1] = 20;
        // number[2] = 30;
        // number[3] = 40;
        // number[4] = 50;
        // System.out.println("ตำแหน่งที่ 4 = "+number[4]);
        // แบบกำหนดสมาชิก
        int []number={10,20,30,40,50,70};
        System.out.println("ก่อน ตำแหน่งที่ 5 = "+number[5]);
        number[5] = 100; // เปลี่ยนค่าสมาชิกใน array ช่องที่ 5
        System.out.println("หลัง ตำแหน่งที่ 5 = "+number[5]);
    }
}
