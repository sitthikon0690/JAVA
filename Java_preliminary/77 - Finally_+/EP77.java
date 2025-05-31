public class EP77 {
    public static void main(String[] args) {
        try {
            int a=10;
            int b=2;
            System.out.println((a/b));
            
        } catch (Exception e) {
            System.out.println("->"+e);
        }finally{
            System.out.println("ทำงานตลอดไม่ว่าจะ มี Exception หรือไม่");
            //การใช้เช่น ถ้ากรอกข้อมูลแล้วผิดพลาด ก็ใช้เก็บข้อมูล
        }
    }
}
