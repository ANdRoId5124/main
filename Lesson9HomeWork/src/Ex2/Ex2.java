package Ex2;

public class Ex2 {
    public static void main(String[] args) {
        String str = "Привет как дела";
         String[] strs = str.split(" ");
         String longWord = strs[0];
         String shortWord = strs[0];
         for(int i = 0; i < strs.length; i++){
             if(strs[i].length() < shortWord.length()){
                 shortWord = strs[i];
             }else{if(strs[i].length() > longWord.length())
                 longWord = strs[i];
             }
         }
        System.out.println(shortWord);
        System.out.println(longWord);
    }

}
