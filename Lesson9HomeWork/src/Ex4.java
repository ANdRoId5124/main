import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        String str = "Hello my friend";
        String[] strs = str.split(" ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        scanner.close();

        if(number > strs.length){
            System.out.println("Wrong number");
        }else {
            StringBuffer stringBuffer = new StringBuffer(strs[number]);
            stringBuffer.reverse();

            if (strs[number].equals(stringBuffer.toString())){
                System.out.println("The word is polindrom");
            }else {
                System.out.println("The word isn't polidrom");
            }
        }
    }
}
