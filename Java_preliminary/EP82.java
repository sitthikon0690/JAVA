import java.io.*;
import java.util.Scanner;
public class EP82 {
    public static void main(String[] args) {
        PrintWriter output = null;
        try {
            Scanner input=new Scanner(new File("Student.text"));
            output=new PrintWriter(new File("Grade.text"));
            String nisit=null;
            String gread=null;
            // int i=1;
            System.out.println(input.hasNext());
            System.out.println(input.nextLine());//บรรทัดแรก ถ้าใช้คำสั่งอีกครั้ง จะเป็นบรรทัดที่สอง
            while(input.hasNext()){
                nisit = input.nextLine();
                // System.out.println(i+++nisit);
                int pos = nisit.indexOf(" ");
                String score = nisit.substring(pos);
                // System.out.println(score);
                score = score.trim();
                double score2 = Double.parseDouble(score);
                if(score2>=80){gread="A";}
                else if(score2>=70){gread="B";}
                else if(score2>=60){gread="C";}
                else if(score2>=50){gread="D";}
                else{gread="F";}
                output.println(nisit+"  "+gread);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }finally{output.close();}
    }
}
