public class EP60 {
    //ถ้าเป็น ตัวแปรที่ไม่ใช่ array methodไม่สามารถเปลี่ยนค่าได้
    //แต่ถ้าเป็นตัวแปร array สามารถเปลี่ยนค่าได้

    public static void main(String[] args) {
        sum(5, 5);
        // System.out.println(sum(5, 5)); ไม่ได้

        int x=5;
        System.out.println(x);
        s(x);
        System.out.println(x);

        int []x2={1,2,3};
        System.out.println(x2[0]);
        sy(x2);
        System.out.println(x2[0]);
    }
    static void sum(int a,int b){
        System.out.println(a+b);
    }
    static void s(int a){
        a=2;
    }
    static void sy(int []a){
        a[0]=2;
    }
}
