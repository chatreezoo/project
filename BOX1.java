package oop;


public class BOX1 {
    public double base, height;  //ตัวแปลภายนอก
    //----------------------------------------------
    //ส่งค่าออกไม่รับค่าเข้า

    void hello() {
        System.out.println("Hello");
    }

    void diisplayName() {
        System.out.println("นายมนต์สิทธิ์ ผาสีดา");
        System.out.println("คอมพิวเตอร์โปรแกรมเมอร์");
        System.out.println("monsit-pasida@live.com");
    }
    //-----------------------------------------------

    public double Tax(int price) {
        double tax, vat = 0.7;
        tax = price * vat;
        return tax;

    }

    //-----------------------------------------------
    //ไม่รับค่าเข้าแต่ส่งค่าออก
    public double Triangle() {
        return 0.5 * height * base;
    }

    //-----------------------------------------------
    //รับค่าเข้าไม่ส่งค่าออก
    public void Circle(int r) {
        double area;
        area = 3.14 * r * r;
        System.out.println("พื้นที่วงลกม " + area);
    }
}
