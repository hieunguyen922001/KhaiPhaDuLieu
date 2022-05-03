/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication1.donglenh.chuong1;

import java.util.Scanner;

/**
 *
 * @author TRUNG HIEU
 */
public class xuatnhap {
    public static void main(String[] args){
        boolean flag = true;
        int a = 15;
        byte b = 2;
        double c = 12.6;
        float d = 4.5f;
        String s = "Hello World!!";
        char ch = 'A';
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Hay nhap ho ten: ");
        String hoten = sc.nextLine();
        System.out.println("Ban da nhap ho ten la: "+ hoten);
        
        System.out.print("Hay nhap vao mot so nguyen: ");
        String input = sc.nextLine();
        a = Integer.parseInt(input);
        System.out.println("So nguyen ma ban nhap la: "+ a);
        
        System.out.print("Hay nhap vao mot so thuc: ");
        input = sc.nextLine();
        c = Double.parseDouble(input);
        System.out.println("So thuc ma ban nhap la: "+ c);
        
        
    }
    
}
