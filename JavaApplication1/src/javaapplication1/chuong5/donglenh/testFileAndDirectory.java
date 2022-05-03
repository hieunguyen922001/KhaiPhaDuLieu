/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication1.chuong5.donglenh;

import javaapplication1.chuong5.logic.FileAndDirectoryOperations;

/**
 *
 * @author TRUNG HIEU
 */
public class testFileAndDirectory {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        FileAndDirectoryOperations fo = new FileAndDirectoryOperations();
//        File[] content = fo.getDirectoryContent("E:\\New folder\New folder");
//        System.out.println(fo.displayContent(content));
//        
//        File[] thumuc = fo.getSubDirectories(content);
//        System.out.println("Danh sach cac thu muc con la");
//        System.out.println(fo.displayContent(thumuc));
//        File[] taptin = fo.getFile(content);
//        System.out.println("Danh sach tp tin");
//        System.out.println(fo.displayContent(taptin));
        fo.getContentRecursively("E:\\New folder\\New folder");
    }
    
}
