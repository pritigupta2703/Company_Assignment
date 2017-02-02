package StackImple;
import java.io.*;

import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils;

/**
 * Created by pritigupta on 2/1/17.
 */
public class FileOpera {

    static void createFile() throws Exception {

        File dir = new File("/Users/pritigupta/desktop/files");

        if (!dir.exists()) {
            dir.mkdir();
        }

        File f1 = new File(dir, "file.txt");
        f1.createNewFile();

    }

    static void writeToFile(String fileName) throws Exception{
        File f = new File("/Users/pritigupta/desktop/files/file.txt");
        FileWriter fw = new FileWriter(f);
        BufferedWriter bw = new BufferedWriter(fw);
        bw.write("line 1");
        bw.write("line 2");

        fw.flush();
        bw.flush();

        fw.close();
        bw.close();
    }
    public static void copyFile() throws Exception

    {

        File f2 = new File("/Users/pritigupta/desktop/files/fileCopy.txt");
        FileReader fr = new FileReader("file.txt");
        BufferedReader br = new BufferedReader(fr);

        FileWriter fw = new FileWriter(f2);
        BufferedWriter bw = new BufferedWriter(fw);
        int c = br.read();
        while (c != -1) {
            bw.write((char) c);
            c = br.read();
        }


        bw.flush();
        fw.flush();
        bw.close();
        fw.close();
    }

    public static void main(String[] args) throws Exception {
        createFile();
        System.out.println("file is created");
        writeToFile("file.txt");
        System.out.println("text written to the file");
        copyFile();

        System.out.println("text is copied to the file");

    }
}
