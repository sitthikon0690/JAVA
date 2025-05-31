public class EP68 {
    public static void main(String[] args) {
        int[]numberA={10,20,30,40};
        int[]numberB=coppyarray(numberA);
        display(numberA);
        display(numberB);

    }
    static void display(int [] arr){
        System.out.print("{");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]);
            if (i<arr.length-1) System.out.print(", ");
        }
        System.out.println("}");
    }
    static int [] coppyarray(int [] arr){
        int []newarray=new int[arr.length];
        for(int i=0;i<arr.length;i++){
            newarray[i]=arr[i];
        }
        return newarray;

    }
}
