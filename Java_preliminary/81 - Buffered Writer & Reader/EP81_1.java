import java.io.*;
public class EP81_1 {
    public static void main(String[] args) {
    // File f=new File("Demo.text"); // ถ้าไม่มีจะสร้างถ้ามี จะดึงมา
    try {
        FileWriter write = new FileWriter(new File("Demo.text"));// ถ้าไม่มีจะสร้างถ้ามี จะดึงมา
        BufferedWriter bw = new BufferedWriter(write);
        bw.write("sss");
        bw.newLine();
        bw.write("aaolao455os");
        bw.close();
    } catch (Exception e) {
        System.out.println(e);
    }
    }
}
