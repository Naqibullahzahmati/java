

package javaapplication4;

import java.util.Scanner;

/**
 *
 * @author Zahmati
 */
public class JavaApplication4 {
    //logical opraters
    //AND OR NOT
    //&& || !
    public static void main(String[] args) {
        Scanner x= new Scanner(System.in);
        System.out.println("enter your number");
        int age= x.nextInt();
     if(age >=18 && age <40){
         System.out.println("welcome");
     }
     else{
      System.out.println("get out");
     }
    }
    
}
