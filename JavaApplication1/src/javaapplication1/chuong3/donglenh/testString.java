/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication1.chuong3.donglenh;

/**
 *
 * @author TRUNG HIEU
 */
public class testString {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String content = "Long lanh day nuoc in troi \n Thanh xay khoi biec non phoi bong vang";
        System.out.println(content);
        // thao tac vi ti:
        System.out.println("vi tri cua ki tu a trong chuoi la: "+ content.indexOf("a"));
        System.out.println("vi tri cua tu nuoc trong chuoi la: "+ content.indexOf("nuoc"));
        //kiem tra khoi dau ket thuc
        System.out.println("Chuoi mo dau bang tu Long"+ content.startsWith("Long"));
        System.out.println("Chuoi ket thuc bang tu Long"+ content.endsWith("Long"));
        //cat chuoi theo vi tri
        String temp = content.substring(20, 26);
        System.out.println("Chuoi con la: "+ temp);
        //phan tach chuoi
        String[] result =content.split(" ");
        for(int i =0 ; i < result.length;i++){
            System.out.println(result[i]);
        }
        //loai bo khoang trang dau cuoi chuoi
        for(int i =0 ; i < result.length;i++){
            System.out.println(result[i].trim());
        }
         //Thay the ki tu
         temp = content.replace("a", "z");
         System.out.println(temp);
         //chuyen kieu
         temp = content.toUpperCase();
         System.out.println(temp);
         temp = content.toLowerCase();
         System.out.println(temp);
         
         //so sanh chuoi
         temp ="nguyen";
         if(temp.compareToIgnoreCase("nguyen") == 0){
            System.out.println("2 chuoi bang nhau");
         }else{
             System.out.println("2 chuoi khong bangg nhau");
         }
         //noi chuoi
         temp = temp.concat("Van A");
         System.out.println(temp);
         //truy xuat
         for(int i =0; i < temp.length();i++){
             System.out.println(temp.charAt(i));
         }
         System.out.println();
         //chuyen kieu
         temp = "155";
         int n = Integer.parseInt(temp);
         System.out.println("n ="+n);
         //Su dung StringBuilder
         StringBuilder sb = new StringBuilder();
         sb.append("long lanh day nuoc in troi\n");
         sb.append("Thanh xay nuoc biec non soi bong vang");
         temp = sb.toString();
         System.out.println(sb);
    }
}
    
