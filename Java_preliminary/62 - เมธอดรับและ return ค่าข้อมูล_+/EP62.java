public class EP62 {
    public static void main(String[] args) {
        int a=sun(1, 01);
        System.out.println(a);
        // System.out.println(sun2(5, 5));
    }
    static int sun(int a, int b){
        int c=a+b+10;
        return c;
    }
    // static void sum2(int a2, int b2){
    //     int c=a2+b2+10;
    //     return c; ไม่ได้เพราะ type เป็น void 
    //}
    // void ใช้สำหรับไม่มีการ return ค่า
}
