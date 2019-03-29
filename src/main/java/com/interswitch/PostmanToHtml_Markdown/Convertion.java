package com.interswitch.PostmanToHtml_Markdown;

import org.junit.jupiter.api.Test;

import java.io.File;

public class Convertion {

    @Test
    public void convertToMarkdown () {
        System.out.println("Execute shell commands example");
        System.out.println();

        String FileName = "Merchant.postman_collection";
        File Docgen = new File("c:\\var\\docgen.exe");
        File oldfile = new File ("c:\\var\\documentation\\"+FileName+".json");
        File newfile = new File("c:\\var\\documentation\\"+FileName+".md");

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

    @Test
    public void convertToHtml () {
        System.out.println("Execute shell commands example");
        System.out.println();

        String FileName = "Merchant.postman_collection";
        File Docgen = new File("c:\\var\\docgen.exe");
        File oldfile = new File ("c:\\var\\documentation\\"+FileName+".json");
        File newfile = new File("c:\\var\\documentation\\"+FileName+".html");

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
}
