package AtmMachine ;
import java.util.Scanner;

public class AtmMachine {
  
    int qtyBank1K = 0;
    int qtyBank500 = 0;
    int qtyBank100 = 0;
    
    public static void main(String[] args) {
       // กำหนดจำนวนแบงค์ในเครื่อง 1000  = 5 ใบ , 500 = 10 ใบ และ 100 = 20 ใบ
        AtmMachine atm = new AtmMachine(5, 10, 20);
        atm.withdraw(1000);  // ถอนเงิน 1000
        atm.withdraw(5000); // ถอนเงิน 5000
        atm.withdraw(300); // ถอนเงิน 300
        atm.withdraw(10000); // ถอนเงิน 10000
        atm.withdraw(5700); // ถอนเงิน 5700
        atm.withdraw(100); // ถอนเงิน 100
    }
    
    public AtmMachine() {
        this.printRemainBanknotes();
    }
    
    public AtmMachine(int qtyBank1K, int qtyBank500, int qtyBank100) {
        this.qtyBank1K = qtyBank1K;
        this.qtyBank500 = qtyBank500;
        this.qtyBank100 = qtyBank100;
        
        this.printRemainBanknotes();
    }
    
    public void deposit(int qtyBank1K, int qtyBank500, int qtyBank100) {
        this.qtyBank1K += qtyBank1K;
        this.qtyBank500 += qtyBank500;
        this.qtyBank100 += qtyBank100;
    }
    
    public void withdraw(int amount) {
        // Find for qty 1000
        int widthdrawAmt = amount;
        double calcValue = 0;
        calcValue = Math.floor(amount / 1000);
        int qty1K = new Double(calcValue).intValue();
        if (qty1K > qtyBank1K) {
            qty1K = qtyBank1K;            
        }
        amount = amount - (qty1K * 1000);
        
        // Find for qty 500
        calcValue = Math.floor(amount / 500);
        int qty500 = new Double(calcValue).intValue();
        if (qty500 > qtyBank500) {
            qty500 = qtyBank500;
        }
        amount = amount - (qty500 * 500);
        
        // Find for qty 100
        calcValue = Math.floor(amount / 100);
        int qty100 = new Double(calcValue).intValue();
        if (qty100 > qtyBank100) {
            qty100 = qtyBank100;
        }
        amount = amount - (qty100 * 100);
        
        if (amount > 0) {
            System.out.println("Cannot widthdraw "+ widthdrawAmt +", Banknotes not enough.");
            this.printRemainBanknotes();
        } else {
            this.qtyBank1K -= qty1K;
            this.qtyBank500 -= qty500;
            this.qtyBank100 -= qty100;
            
            System.out.print("Thank for service withdraw: " + widthdrawAmt);
            System.out.print(" [ 1000 = " + qty1K);
            System.out.print(" , 500 = " + qty500);
            System.out.println(" , 100 = " + qty100 + " ]");
        }
    }
    
    public void printRemainBanknotes() {
        System.out.println("Summary remaining in machine. Available amount: " + 
                    ((this.qtyBank1K * 1000) +  
                    (this.qtyBank500 * 500) +
                    (this.qtyBank100 * 100)));
//        System.out.println("1000 = " + this.qtyBank1K);
//        System.out.println("500 = " + this.qtyBank500);
//        System.out.println("100 = " + this.qtyBank100);
    }

}