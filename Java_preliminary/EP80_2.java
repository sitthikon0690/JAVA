import java.io.*;
public class EP80_2 {
    public static void main(String[] args) {
        try {
            FileReader reader=new FileReader(new File("Demo.text"));
            int data;
            while((data=reader.read()) != -1){
                // System.out.println(data);
                // System.out.printf("%c\n",data);
                System.out.printf("%c",data);
            }
        } catch (Exception e) {
            e.printStackTrace();
    }
}
}
