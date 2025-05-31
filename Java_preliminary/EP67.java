public class EP67 {
    public static void main(String[] args) {
        int []number = {10,1,5,12,14};
        System.out.println(number[2]);
        display(number);
        swapElement(number, 2, 3);
        System.out.println(number[2]);
        display(number);
    }
    static void display(int [] arr){
        System.out.print("{");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]);
            if (i<arr.length-1) System.out.print(", ");
        }
        System.out.println("}");
    }
    static void swapElement(int []a, int x, int y){
        int temp=a[x];
        a[x]=a[y];
        a[y]=temp;
    }
}
