/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication1.donglenh.chuong1;

import java.util.Date;

/**
 *
 * @author TRUNG HIEU
 */
public class Students extends Person implements TaxInterface{
    private String truonghoc;

    public Students() {
    }

    public Students(String truonghoc, String hoten, int gioitinh, Date ngaysinh) {
        super(hoten, gioitinh, ngaysinh);
        this.truonghoc = truonghoc;
    }

    public String getTruonghoc() {
        return truonghoc;
    }

    public void setTruonghoc(String truonghoc) {
        this.truonghoc = truonghoc;
    }

    @Override
    public double calcTax(double income) {
       double tax;
       tax = (0.01*income);
       return tax;
    }
    
    
    
}
