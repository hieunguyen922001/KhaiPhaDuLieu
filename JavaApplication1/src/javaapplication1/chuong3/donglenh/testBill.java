/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication1.chuong3.donglenh;

import javaapplication1.chuong3.coffeelogic.Bill;
import javaapplication1.chuong3.coffeelogic.Product;

/**
 *
 * @author TRUNG HIEU
 */
public class testBill {
    public static void main(String[] args) throws CloneNotSupportedException{
        Bill a = new Bill(12, new Product[] {
                          new Product("Shapoo", 12),
                          new Product("Closeup", 21)});
        System.out.println("a = " + a);
            
        Bill temp = (Bill) a.clone();
        temp.setBillID(15);
        
        System.out.println("a = " + a);
        System.out.println("temp = " + temp);
        }
    }
            

