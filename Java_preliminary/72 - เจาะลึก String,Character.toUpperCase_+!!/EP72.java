public class EP72 {
    public static void main(String[] args) {
        char a='a';//เก็บได้ตัวเดียวและต้องเป็น ' '
        Character b='a';//เก็บได้ตัวเดียวและต้องเป็น ' '
        String c="aasdasdassasa";
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

        Integer d=5;
        System.out.println(d);

        Character alphabet = new Character('5');//สร้าง object 
        char e='B';
        char f='5';
        System.out.println(Character.isLetter(alphabet));
        System.out.println(Character.isLetter(e));//เช็คว่าเป็นตัวอักศรหรือไม่
        System.out.println(Character.isDigit(e));//เช็คว่าเป็นตัวอักศรตัวเลขหรือไม่
        System.out.println(" f "+Character.isDigit(f));//เช็คว่าเป็นตัวอักศรตัวเลขหรือไม่
        System.out.println("isUpperCase"+Character.isUpperCase(e));//เช็คว่าเป็นพิมใหญ่หรือไม่
        System.out.println("isLowSurrogate"+Character.isLowSurrogate(e));//เช็คว่าเป็นพิมเล็กหรือไม่

        char g='a',h='B';
        System.out.println(g);
        System.out.println(Character.toUpperCase(g));
        System.out.println(h);
        System.out.println(Character.toLowerCase(h));
    }
}
