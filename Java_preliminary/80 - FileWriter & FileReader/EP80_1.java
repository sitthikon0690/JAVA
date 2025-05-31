import java.io.*;
public class EP80_1 {
    public static void main(String[] args) {
    // File f=new File("Demo.text"); // ถ้าไม่มีจะสร้างถ้ามี จะดึงมา
    try {
        FileWriter write = new FileWriter("Demo1.text");// ถ้าไม่มีจะสร้างถ้ามี จะดึงมา
        write.write("hello1");
        write.close();
    } catch (Exception e) {
        System.out.println(e);
    }
    }
}
