import java.io.*;
import java.io.FileReader;
import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Write directory");
        String path = sc.nextLine();
        sc.close();
        BufferedReader reader = new BufferedReader(new FileReader(path));
        BufferedWriter validDoc = new BufferedWriter(new FileWriter("files\\validFiles.txt"));
        BufferedWriter notValidDoc = new BufferedWriter(new FileWriter("files\\notValidFiles.txt"));
        StringBuilder stringBuilder = new StringBuilder();
        String line = null;
        while ((line = reader.readLine()) != null) {
            stringBuilder.append(line).append("\n");
        }
        reader.close();

        String[] content = stringBuilder.toString().split("\n");

        for(int i = 0; i < content.length; i++){
            if(content[i].length() == 15 && (content[i].startsWith("docnum") || content[i].startsWith("contract"))){
                 validDoc.write(content[i] + "\n");
            } else {
                notValidDoc.write(content[i]+ " :" + "Wrong length or File don't start with docnum or contract" + "\n");
            }
        }
        validDoc.close();
        notValidDoc.close();


    }
}
