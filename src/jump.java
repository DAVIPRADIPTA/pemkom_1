
import java.io.File;
import java.io.IOException;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author asus
 */
public class jump {
    public static void main(String[] args) {
          try {
            // Membuat folder Root
            File root = new File("src/Root");
            root.mkdir();

            // Membuat file di dalam Root
            File projectConf = new File(root, "project.conf");
            File manifestMf = new File(root, "manifest.mf");
            projectConf.createNewFile();
            manifestMf.createNewFile();

            // Membuat folder classes
            File classes = new File(root, "classes");
            classes.mkdir();

            // Membuat file di dalam folder classes
            File testJava = new File(classes, "Test.java");
            File testImplJava = new File(classes, "TestImpl.java");
            testJava.createNewFile();
            testImplJava.createNewFile();

            // Membuat folder template
            File template = new File(root, "template");
            template.mkdir();

            // Membuat file di dalam folder template
            File enterTxt = new File(template, "enter.txt");
            File exitTxt = new File(template, "exit.txt");
            enterTxt.createNewFile();
            exitTxt.createNewFile();

            System.out.println("Struktur file dan folder berhasil dibuat.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
}
