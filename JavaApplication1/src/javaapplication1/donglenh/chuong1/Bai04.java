/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication1.donglenh.chuong1;

/**
 *
 * @author TRUNG HIEU
 */
public class Bai04 {
    public static void main(String[] args){
        Circle htron = new Circle(5, 1, 2);
        System.out.println("Chu vi hinh tron la: " + htron.calcPerimeter());
        System.out.println("Dien tich hinh tron la: " + htron.calcArea());
        
        Rectangle hcn = new Rectangle(3, 15, 8, 5);
        System.out.println("Chu vi hinh chu nhat la: " + hcn.calcPerimeter());
        System.out.println("Dien tich hinh chu nhat la: " + hcn.calcArea());
        
        
    }
    
}
