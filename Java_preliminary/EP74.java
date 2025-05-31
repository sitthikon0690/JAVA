class EP74{
    public static void main(String[] args) {
        String message = "ssss 2020 ffff 2020";
        String message2 = "ssss 2020 ffff 2020";
        message = message.replace("2020", "2021");
        System.out.println(message);
        message2 = message2.replaceFirst("2020", "2021");//เปลี่ยนแค่ตัวแรกที่เจอ
        System.out.println(message2);

        System.out.println("หัน String");
        //หัน String
        String data = "มะม่วง,มะยม,ขนุน";
        String [] fruit = data.split(",");
        System.out.println(fruit[0]);

        System.out.println("การเข้าถึง String");
        //การเข้าถึง String
        String name="abcdefgh";
        System.out.println(name.substring(0,2));
        System.out.println(name.substring(2));
        // System.out.println(name[5]); ไม่ได้

        System.out.println("แปลง String เป็น char[]");
        //แปลง String เป็น char[]
        String name2="asdfg";
        char [] alphabet=name2.toCharArray();
        System.out.println(alphabet[1]);

        System.out.println("แปลง char[] เป็น String");
        //แปลง char[] เป็น String
        char []name3={'a','b','c','d'};
        String result = String.copyValueOf(name3);
        System.out.println(result);

        System.out.println("ลบช่องว่าง String");
        //ลบช่องว่าง String
        String name4="   asdfg   ";
        System.out.println(name4.length()+name4);
        name4=name4.trim();
        System.out.println(name4.length()+name4);

        System.out.println("แปลงเป็นพิมเล็กพิมใหญ่");
        //แปลงเป็นพิมเล็กพิมใหญ่
        String name5="asddd";
        System.out.println(name5.toUpperCase());

        System.out.println("แปลงตัวเลขให้เป็น String");
        //แปลงตัวเลขให้เป็น String
        int number = 100;
        String result2=String.valueOf(number);
        System.out.println(result2);


    }
}
