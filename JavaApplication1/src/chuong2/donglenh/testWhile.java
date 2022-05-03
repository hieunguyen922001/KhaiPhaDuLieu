/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chuong2.donglenh;

import java.util.Scanner;

/**
 *
 * @author TRUNG HIEU
 */
public class testWhile {
    public static void main(String[] args){
        int n = 0;
        int i;
        
//        double s1 = 0;
//        n = 100;
//        i = 1;
//        while (i<=n){
//            s1 = s1 + (double)1/i;
//            i = i+1;
//        }
//        System.out.println("Tong thu nhat la S1 "+s1);
        
        Scanner sc = new Scanner((System.in));
        boolean flag = false;
        while(!flag){
            System.out.print("nhap so nguyen duong le n = ");
            String input = sc.nextLine();
            n = Integer.parseInt(input);
//            if((n>0)&&(n%2 !=0)){
//                flag = true;
//            }else{
//                flag = false;
//            }
            flag = ((n > 0) && (n%2 !=0))?true:false;
        }
        
        int s2 =0;
        i = 1;
        
        while (1 <= n){
            s2 = s2 + i;
            i = i+1;
            
        }
        System.out.println("Tong thu hai la S2" + s2);
    }
}
