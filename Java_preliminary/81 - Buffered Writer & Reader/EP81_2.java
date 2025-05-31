import java.io.*;
public class EP81_2 {
    public static void main(String[] args) {
        try {
            FileReader reader=new FileReader(new File("Demo.text"));
            BufferedReader br = new BufferedReader(reader);
            String data="";
            while((data=br.readLine()) != null){
                System.out.println(data);
            }
        }catch (Exception e) {
            System.out.println("หาไฟล์ไม่เจอ");
        }
    }
}