public class EP73 {
    public static void main(String[] args) {
        String name1 ="kongruksiam";
        String name2 ="Kongruksiam";

        // concatenation = > ต่อ string
        String result=name1+name2;
        System.out.println(result.concat(".com"));

        // หาความยาว String
        int count = name1.length();
        System.out.println(count);

        // หาตำแหน่งตัวอักษร (เลขตำแหน่ง)
        System.out.println(name1.charAt(3));
        System.out.println(name1.equals(name2));
        System.out.println(name1.equalsIgnoreCase(name2));//ไม่สนพิมพ์เล็กพิมใหญ่

        //startswith engswith
        String fullname ="นายสิทธิกร2";
        boolean result1=fullname.startsWith("นาย");
        System.out.println("startsWith  "+result1);

        boolean result2=fullname.startsWith("นา"+"ย");
        System.out.println("startsWith  "+result2);

        boolean result3=fullname.endsWith("2");
        System.out.println("endsWith  "+result3);

        // int number=567;
        // System.out.println("startsWith  "+number.startsWith("5"));
        // System.out.println("startsWith  "+number.startsWith(5));  ไม่ได้เพราะ number เป็น int
        
        System.out.println(fullname.indexOf("ย"));
        System.out.println(fullname.indexOf("สิท"));
        int indexf=fullname.indexOf("าย");
        System.out.println(indexf);
    }
}
