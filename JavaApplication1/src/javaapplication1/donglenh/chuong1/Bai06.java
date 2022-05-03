/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication1.donglenh.chuong1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/**
 *
 * @author TRUNG HIEU
 */
public class Bai06 {
    public static void main(String[] args) throws ParseException{
        SimpleDateFormat df = new SimpleDateFormat("dd-MM-yyyy", Locale.ENGLISH);
        String input = "11-03-2001";
        Date ngaysinh = df.parse(input);
        Person person = new Person("Nguyen Van A", 0, ngaysinh);
        
        System.out.println("Ho ten: " +person.getHoten() +"; Gioi tinh: " 
                +person.getGioitinh()+ "; Ngay sinh: "+ 
                df.format(person.getNgaysinh()));
            
        
        Students sinhvien = new Students();
        sinhvien.setHoten("Nguyen Van B");
        sinhvien.setGioitinh(0);
        sinhvien.setNgaysinh(df.parse("12-02-2001"));
        sinhvien.setTruonghoc("Dai hoc Hue");
        System.out.println(sinhvien.getHoten()+"; Gioi tinh "+ 
                sinhvien.getGioitinh()+"; Ngay sinh: "+
                df.format(sinhvien.getNgaysinh())+ "; "+
                sinhvien.getTruonghoc());
        System.out.println(sinhvien.calcTax(1200));
        
        Worker worker = new Worker();
        worker.setHoten("Nguyen Van B");
        worker.setGioitinh(0);
        worker.setNgaysinh(df.parse("12-02-2001"));
        worker.setCongty("IBM");
        System.out.println(worker.getHoten()+"; Gioi tinh "+ 
                worker.getGioitinh()+"; Ngay sinh: "+
                df.format(worker.getNgaysinh())+ "; cong ty "+
                worker.getCongty());
        System.out.println(worker.calcTax(2000));
    }
    
}
