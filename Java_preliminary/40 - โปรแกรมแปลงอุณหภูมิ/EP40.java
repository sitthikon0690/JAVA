import java.util.Scanner;
public class EP40 {
    //C=(OF-32)x5/9
    //F = ( C x9/5)+32
    public static void main(String[] args) {
        Scanner kb=new Scanner(System.in);
        // system.out .print("ป้อนอุณหภูมิ (ฟาเรนไฮน์) = ");
        // float fahren=kb.nextFloat();
        // float cel =(fahren-32)*5/9;
        // system.out.printIn(fahren+" องศาฟาเรนไฮน์ = "+ cel +" องศาเซลเซียส");
        System.out.print("ป้อนอุณหภูมิ (เซลเซียส) = ");
        float cel=kb.nextFloat();
        float fahren = (cel*9/5)+32;
        System.out.println(cel+ " องศาเซลเซียส ="+fahren+" องศาฟาเรนไฮน์");
    }
}
