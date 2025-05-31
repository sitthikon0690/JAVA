class EP18 {
    public static void main(String[] args) {
        // เช็คชนิดข้อมูล
        // ตัวหน้าเป็นพิ่มใหญ่คือ class  ตัวแปรจะเท่ากับ ออบเจ็คไม่ใช่ตัวแปร แต่ถ้าตัวหน้าเป็นพิ่มเล็กคือ ตัวแปร ตัวแปรจะเท่ากับตัวแปร
        Integer a=10; //a เป็น ออบเจ็ค Integer เป็น class a มีชนิดข้อมูลเป็น Integer
        double b;
        String c="Hello World"; 
        boolean d;
        char e;
        float f;
        // เป็น (true) / ไม่เป็น (false)
        boolean result= a instanceof Integer;
        boolean result2= c instanceof String;
        System.out.println(result);
        System.out.println(result2);
    }
}
