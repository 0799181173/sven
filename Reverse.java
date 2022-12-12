/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Trial;

import java.util.Scanner;

/**
 *
 * @author nyanc
 */
public class Reverse {
    public static void main(String[] args){
        float[] arr=new float[10];
         float sum=0;
      Scanner scan=new Scanner(System.in);
      System.out.println("Enter the array elements");
      for(int i=0;i<=9;i++){
          arr[i]=scan.nextFloat();
         sum=sum+arr[i];
         
      }
       
      System.out.println(sum);
}
}
