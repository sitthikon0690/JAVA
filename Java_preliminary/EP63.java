public class EP63 {
    public static void main(String[] args) {
        int [] number ={10,20,30,40};
        display(number);
        // display(5,10,30); ไม่ได้
        // display2(number); ไม่ได้
        double [] number2 ={10.0,20.2,30,40}; //ถ้า D เป็นตัวพิมพ์ใหญ่จะต้องใส่ ทศนิยมให้หมด
        // display(number2); ไม่ได้
        display2(number2);
        
    }
    static void display(int [] arr){
        System.out.print("{");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]);
            if (i<arr.length-1) System.out.print(", ");
        }
        System.out.println("}");
    }
    static void display2(double [] arr){ //Double Dเป็นตัวพิมพ์ใหญ่ ตัวแปรก็ต้องเป็น D พิมพ์ใหญ่
        System.out.print("{");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]);
            if (i<arr.length-1) System.out.print(", ");
        }
        System.out.println("}");
    }
}
