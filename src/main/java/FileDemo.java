import java.io.*;

class FileReaderDemo {
    public static void main(String[] args) throws IOException {
        File f = new File("myFile.txt");
        FileReader fr = new FileReader(f);
        int data = fr.read();
        while (data != -1) {
            System.out.println((char)data);
            data = fr.read();
        }

    }




}
