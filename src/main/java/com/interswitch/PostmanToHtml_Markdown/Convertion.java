package com.interswitch.PostmanToHtml_Markdown;

import org.springframework.stereotype.Component;

import java.io.File;

@Component
public class Convertion {


    public void convertToMarkdown(String DocgenPath, String FilePath) {
        System.out.println("Execute shell commands example");
        System.out.println();
        
        File Docgen = new File(DocgenPath);
        File oldfile = new File (FilePath+".json");
        File newfile = new File(FilePath+".md");

        try {
            String cmd = ( Docgen + " build -i " +oldfile+ " -o " +newfile+ " -m ");
            System.out.println("Executing command: " + cmd);
            Process p = Runtime.getRuntime().exec(cmd);
            int result = p.waitFor();

            System.out.println("Process exit code: " + result);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    public void convertToHtml (String DocgenPath, String FilePath) {
        System.out.println("Execute shell commands example");
        System.out.println();

        File Docgen = new File(DocgenPath);
        File oldfile = new File (FilePath+".json");
        File newfile = new File(FilePath+".html");

        try {
            String cmd = ( Docgen + " build -i " +oldfile+ " -o " +newfile);
            System.out.println("Executing command: " + cmd);
            Process p = Runtime.getRuntime().exec(cmd);
            int result = p.waitFor();

            System.out.println("Process exit code: " + result);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

//    public void convertToMarkdown(String FileName) {
//        System.out.println("Execute shell commands example");
//        System.out.println();
//
//        //FileName = "Merchant.postman_collection";
//        File Docgen = new File("c:\\var\\docgen.exe");
//        File oldfile = new File ("c:\\var\\documentation\\"+FileName+".json");
//        File newfile = new File("c:\\var\\documentation\\"+FileName+".md");
//
//        try {
//            String cmd = ( Docgen + " build -i " +oldfile+ " -o " +newfile+ " -m ");
//            System.out.println("Executing command: " + cmd);
//            Process p = Runtime.getRuntime().exec(cmd);
//            int result = p.waitFor();
//
//            System.out.println("Process exit code: " + result);
//
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }
//
//
//    public void convertToHtml (String FileName) {
//        System.out.println("Execute shell commands example");
//        System.out.println();
//
//        //FileName = "Merchant.postman_collection";
//        File Docgen = new File("c:\\var\\docgen.exe");
//        File oldfile = new File ("c:\\var\\documentation\\"+FileName+".json");
//        File newfile = new File("c:\\var\\documentation\\"+FileName+".html");
//
//        try {
//            String cmd = ( Docgen + " build -i " +oldfile+ " -o " +newfile);
//            System.out.println("Executing command: " + cmd);
//            Process p = Runtime.getRuntime().exec(cmd);
//            int result = p.waitFor();
//
//            System.out.println("Process exit code: " + result);
//
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }
}
