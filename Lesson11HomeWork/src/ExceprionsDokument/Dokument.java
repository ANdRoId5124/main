package ExceprionsDokument;

public class Dokument  {
    private static String theNumberOfDokument;

    public static void setTheNumberOfDokument(String theNumberOfDokument) {
        Dokument.theNumberOfDokument = theNumberOfDokument;
    }

    public static String getTheNumberOfDokument() {
        return theNumberOfDokument;
    }

    public static void showFourBlocks(String str){
        System.out.println(str.substring(0,4) + " " + str.substring(9,13));
    }

    public static void changedNumberOfDokument(String str){
        char[] symbols = str.toCharArray();
        symbols[5] = '*';
        symbols[6] = '*';
        symbols[7] = '*';
        symbols[14] = '*';
        symbols[15] = '*';
        symbols[16] = '*';
        for(int i = 0; i < symbols.length;i++){
            System.out.print(symbols[i]);
        }
        System.out.println();
    }

    public static void showLitersToLowerCase(String str){
        System.out.println(((str.substring(5,9) + str.substring(14,18) + str.charAt(19) + str.charAt(21)).replace('-','/')).toLowerCase());
    }

    public static void upCase(String str){
        StringBuilder str1 = new StringBuilder(str);
        System.out.println((str1.substring(5,9) + str1.substring(14,18) + str1.charAt(19) + str1.charAt(21)).replace('-','/').toUpperCase());
    }

    public static void checkAbc(String str) throws Exceptions.AbcException {
        if(str.contains("abc") != true || str.toUpperCase().contains("abc".toUpperCase()) != true){
            throw new Exceptions.AbcException("abc or ABC not found");
        }
        if(str.contains("abc") || str.toUpperCase().contains("abc".toUpperCase())){
            System.out.println("We have abc or ABC");
        }
    }

    public static void checkStart(String str) throws Exceptions.StartException {
        if(str.startsWith("555") != true){
            throw new Exceptions.StartException("Str do not start at 555");
        }
        System.out.println(str.startsWith("555"));
    }

    public static void checkEnd(String str) throws Exceptions.EndException{
        if(str.endsWith("1a2b") != true){
            throw new Exceptions.EndException("Str do not end at 1a2b");
        }
        System.out.println(str.endsWith("1a2b"));
    }
}
