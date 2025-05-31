import java.util.Scanner;
public class EP28 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("ป้อนน้ำหนัก (kg) :");
        double weight=sc.nextDouble();
        System.out.print("ป้อนส่วนสูง (cm) :");
        double height=sc.nextDouble();
        System.out.println(height);
        height/=100;
        double bmi=weight/(height*height);
        System.out.println("น้ำหนัก = "+weight);
        System.out.println("ส่วนสูง = "+height);
        System.out.println("ค่าดัชนีมวลกาย (BMI) "+bmi);
    }
}
