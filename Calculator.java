package lab4;
  public class Calculator {
      public int x,y,z ;
      
      public void Multiply(){//ไม่รับค่าเข้า ไม่ส่งค่าออก
          y=2;
         for(x=1; x<=12;x++){
             z= x*y;
              System.out.println(y+"*"+x+"="+z);
         }
     }     
      public void Add (int a, int b){//รับค่าเข้า ไม่ส่งค่าออก
          z = a + b;
          System.out.println(a+"+"+b+"="+z);
      }
      
     public int OddEven(){//ส่งค่าออก
          x = 11;
          if(x % 2 == 0){
             return 0;
         }else{
             return 1;
         }  
      }
     
     public int Grabe(int score1,int score2,int midterm, int Final ){
         return score1+score2+midterm+Final;
     }
 }
 