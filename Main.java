package oop;

public class Main {

    public static void main(String[] args) {

        BOX1 b = new BOX1();
        b.hello();
        b.diisplayName();
        System.out.println("ภาษี " + b.Tax(1000)); //ส่งค่าออกรับค่าเข้า
        b.height = 10;
        b.base = 20;
        System.out.println("พื้นที่สามเหลี่ยม" + b.Triangle());//ไม่รับค่าเข้าแต่ส่งค่าออก
        b.Circle(100);

    }

}
