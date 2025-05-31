public class EP83 {
    public static void main(String[] args) {
        System.out.println(Math.PI);
        System.out.println(Math.E);

        //ค่าสัมบูรณ์
        int number = -30;
        System.out.println(Math.abs(number));

        //ปัดเศษ
        double number2=14.5;
        System.out.println(Math.ceil(number2));//ขึ้น
        System.out.println(Math.floor(number2));//ปัดลง
        System.out.println(Math.rint(number2));//<=0.5 ปัดลง
        System.out.println(Math.round(number2));//>=0.5 ปัดขึ้น

        //หารากที่ 2
        System.out.println("หารากที่ 2 ของ 9  "+Math.sqrt(9));

        //ยกกำลัง
        System.out.println(5*5*5);
        System.out.println(Math.pow(5, 3));
    }
}
