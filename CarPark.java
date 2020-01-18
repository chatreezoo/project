package Car.park;
import java.io.*;

public class CarPark {

    public static void main(String args[]) throws IOException {
        System.out.println("|---------------------------------------------------|");
        System.out.println("|-----------Welcome The  Car Park------------|");
        System.out.println("|---------------------------------------------------|");

        System.out.println("");
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        String[] a; //Array ชุดแรกไว้ใช้รัยค่า 5 ตัว
        a = new String[5]; //ขอพื้นที่ของ Array
        int tih; // tih = time in hours เก็บเวลาขาเข้า แบบช.ม.จากa[1]
        int tim; // tim = time in minutue เก็บเวลาขอเข้าแบบนาที จากa[2]
        int toh; // toh = time out hours เก็บเวลาขาออกแบบช.ม.จากa[3]
        int tom; // tom = time out minitue เก็บเวลาขาออกเบบ นาทีจากa[4]
        int hou; // hours คำนวณช.ม.
        int tth = 0; // total time hoursคิดเวลาจอด
        int ttm = 0; // total time minitues คิดเวลาจอด
        int mon = 0; // money คิดเงิน
        int tm = 0; // time to money ปัดเศษเวลา

        System.out.print("Car number : ");
        a[0] = in.readLine(); //เก็บค่าทะเบียนรถ
        System.out.println("");
        System.out.println("Enter time in");
        System.out.println("");
        System.out.print("Hours in is : ");
        a[1] = in.readLine(); //เก็บทีละตัวเอาช.ม.ก่อน
        System.out.print("Minitues in is : ");
        a[2] = in.readLine(); //เก็บนาทีต่อเลย
        System.out.println("");
        System.out.println("Enter time out");
        System.out.println("");
        System.out.print("Hours out is : ");
        a[3] = in.readLine();
        System.out.print("Mimitues out is : ");
        a[4] = in.readLine();
        System.out.println("");
//จบช่วงของการรับค่า
        tih = Integer.parseInt(a[1]); // แปลงตัวแปล
        tim = Integer.parseInt(a[2]);
        toh = Integer.parseInt(a[3]);
        tom = Integer.parseInt(a[4]);

        if (tih > 24 || toh > 24) {
            System.out.println("Error please enter Hours time 0 - 24 only");
            return;
        } else if (tih < 0 || toh < 0) {
            System.out.println("Error please enter Hours time 0 - 24 only");
            return;
        }
//ใช้ if check ค่าให้ค่าช.ม.ทั้งเข้าและออกอยู่ในช่วง 0-24 เท่านั้น
        if (tim > 60 || tom > 60) {
            System.out.println("Error please enter Minitues time 0 - 60 only");
            return;
        } else if (tim < 0 || tom < 0) {
            System.out.println("Error please enter Minitues time 0 - 60 only");
            return;
        }

        if (tih > toh) {
            System.out.println("You park your car over the limit time(1 day)");
            return;
        }
// check ไม่ให้ เวลาเข้ามากกว่าเวลาออก
//ใช้ if check ค่าให้ค่านาทีทั้งเข้าและออกอยู่ในช่วง 0-24 เท่านั้น
//ที่กำหนดค่าเวลานาทีให้เป็นขอบเขตเพื่อง่ายแก่การคำนสณไม่มีปัญหาเลขเกิน60ในหน่วยนาที

        if (tim == 0 && tom == 0) {
            ttm = 0;
            tth = (toh - tih);
        }// ถ้า นาทีลง00ทั้งเข้าออกเอาช.ม.มาลบเลยโดยเอาออกลบเข้า
        else if (tim != 0 && tom == 0) {
            ttm = (60 - tim);
            tth = ((toh - 1) - tih);
        }//ถ้า นาทีเข้าไม่ใช่00 ให้เอา 60-ด้วยนาทีเข้า และลบช.ม.ออกด้วย1
        else if (tim == 0 && tom != 0) {
            ttm = tom;
            tth = (toh - tih);
        }//ถ้านาทีออกไม่เท่ากับ00 ยอดนาทีรวมจะเท่ากับยอดนาทีออก และช.ม.ลบกันธรรมดา
        else if (tim != 0 && tom != 0) {
            if (tim > tom) {
                ttm = ((tom + 60) - tim);
                if ((toh - 1) == tih) {
                    tth = 0;
                }//check กันไม่ให้ค่าช.ม.ติด-
                else if ((toh - 1) > tih) {
                    tth = ((toh - 1) - tih);
                }//check กันไม่ให้ค่าช.ม.ติด-

            }//ในกรณี นาทีออกน้อยกว่านาทีเข้า จะลบช.ม.ออกไป1แล้ว+นาทีออกด้วย 60 แล้วค่อยลบกัน
            else if (tim < tom) {
                ttm = (tom - tim);
                tth = (toh - tih);
            }//ลบกันธรรมดาๆเลย
            else if (tim == tom) {
                ttm = 0;
                tth = (toh - tih);
            }// ถ้านาทีเท่ากัน เอาช.ม.ลบเลย นาที = 0
        }//จบการคำนวณเวลา

        if (ttm == 0) {
            tm = tth;
        } else if (ttm > 0) {
            tm = (tth + 1);
        }//ปัดเศษเวลา

        if (tm == 1) {
            mon = 0;
        }//ช.ท.แรกฟรี
        else if (tm > 1 && tm <= 3) {
            mon = ((tm - 1) * 30);
        }// ลบ1ช.ม.ฟรีไปไง ต่อไปช.ม.ละ 30
        else if (tm > 3) {
            mon = (((tm - 3) * 20) + 40);
        } //ลบ3ช.ม.แรกก่อน ช.ม.ละ20บาทก่อน +40จาก2ช.ม.และฟรี1ช.ม.
// จบการคิดเงิน

        System.out.println("Car number is : " + a[0]);
        System.out.println("");
        System.out.println("Time In is : " + tih + "." + tim);
        System.out.println("");
        System.out.println("Time Out is : " + toh + "." + tom);
        System.out.println("");
        System.out.println("Total time is : " + tth + "." + ttm);
        System.out.println("");
        System.out.println("Money is : " + mon);
        System.out.println("");

//จบการแสดงผล
    }
}
