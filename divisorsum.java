package JAVA;

import java.util.*;
interface AdvancedArithmetic{
  int divisor_sum(int n);
}

class  MyCalculator implements AdvancedArithmetic{
 public int divisor_sum(int n)
 {
     int result=0;
     for(int i = 1; i<=n; i++){

         if(n%i==0){
result+=i;
         }
         else{
         continue;}
     }
return result;
 }
 

}
//Write your code here

class divisorsum{
    public static void main(String []args){
        MyCalculator my_calculator = new MyCalculator();
        System.out.print("I implemented: ");
       
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.print(my_calculator.divisor_sum(n) + "\n");
      	sc.close();
    }
   
  
}

