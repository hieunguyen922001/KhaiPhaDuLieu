/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication1.chuong5.logic;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author TRUNG HIEU
 */
public class FileAndDirectoryOperations {
    public FileAndDirectoryOperations() {
    }
    // liet ke thu muc
    public File[] getDirectoryContent(String folder){
        File directory = new File(folder);
        if(directory.isFile())
            return null;
        File[] results = directory.listFiles();
        return results;
    }
    //Xuat ke qua
    public String displayContent(File[] content){
        StringBuilder sb = new StringBuilder();
        for(int i =0; i < content.length;i++){
            sb.append(content[i].getPath()).append(File.separator).append(content[i].getName());
            sb.append("\n");
        }
        return sb.toString();
    }
    //Loc thu muc
    public File[] getSubDirectories(File[] content){
        ArrayList<File> result = new ArrayList<>();
        for (int i = 0; i < content.length;i++){
            if(content[i].isDirectory()){
                result.add(content[i]);
            }
        }
        File[] ketqua = new File[result.size()];
        return result.toArray(ketqua);
    }
    //loc tat ca tap tin
    public File[] getFile(File[] content){
        ArrayList<File> result = new ArrayList<>();
        for (int i = 0; i < content.length;i++){
            if(content[i].isFile()){
                result.add(content[i]);
            }
        }
        File[] ketqua = new File[result.size()];
        return result.toArray(ketqua);   
    }
    //Duyet de quy
    public void getContentRecursively(String folder){
        File content = new File(folder);
        if(content.isFile()){
            System.out.println(content.getPath()+ File.separator + content.getName());
            return;
        }
     //Goi de quy
        System.out.println("Thu muc: "+ folder);
        File[] sub = content.listFiles();
        for (int i = 0; i < sub.length;i++){
         getContentRecursively(folder + File.separator + sub[i].getName());
        }
        }
    public String readTexFile(String filename){
        StringBuilder content = new StringBuilder();
        try {
            //Mo file
            FileReader fr = new FileReader(filename);
            //Dung bo dem
            BufferedReader br = new BufferedReader(fr);
            
            String line = null;
            while((line = br.readLine())!= null) {
                content.append(line);
                content.append("\n");
            }
            //dong file
            br.close();
            fr.close();
        } catch (FileNotFoundException ex) {
            return "khong tim thay file"+ filename;
        } catch (IOException ex) {
            return "khong the doc file"+ filename;
        }
        return content.toString();
    }
    //Luu file
    public boolean writeTextFile(String filename, String content){
        boolean flag = true;
        try {
            //Mo file
            FileWriter fw = new FileWriter(filename);
            //Su dung buffer
            BufferedWriter bw =new BufferedWriter(fw);
            
            bw.write(content);
            bw.flush();
            bw.close();
            fw.close();
        } catch (IOException ex) {
            return false;
        }
        return flag;
    }
}
