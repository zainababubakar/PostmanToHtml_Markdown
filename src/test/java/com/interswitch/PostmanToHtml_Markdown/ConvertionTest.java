package com.interswitch.PostmanToHtml_Markdown;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;



@SpringBootTest
@RunWith(SpringRunner.class)
public class ConvertionTest {

    @Autowired
    Convertion convertion;


    @Test
    public void convertToMarkdown() {
        String DocgenPath = "c:\\var\\docgen.exe";
        String FilePath = "c:\\var\\documentation\\Merchant.postman_collection";
        convertion.convertToMarkdown(DocgenPath,FilePath);
    }

    @Test
    public void convertToHtml() {
        String DocgenPath = "c:\\var\\docgen.exe";
        String FilePath = "c:\\var\\documentation\\Merchant.postman_collection";
        convertion.convertToHtml(DocgenPath,FilePath);
    }
}