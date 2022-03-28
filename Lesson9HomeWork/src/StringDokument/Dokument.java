package StringDokument;


public class Dokument {
    private static String theNumberOfDokument;

    public static void setTheNumberOfDokument(String theNumberOfDokument) {
        Dokument.theNumberOfDokument = theNumberOfDokument;
    }

    public static String getTheNumberOfDokument() {
        return theNumberOfDokument;
    }

    public static void showFourBlocks(String str){
        str = getTheNumberOfDokument();
        System.out.println(str.substring(0,4) + " " + str.substring(9,13));
    }

    public static void changedNumberOfDokument(String str){
        str = getTheNumberOfDokument();
        System.out.println(str.replace("abc", "***").replace("def", "***"));
    }

    public static void showLiters(String str){
        str = getTheNumberOfDokument();
        System.out.println((str.substring(5,9) + str.substring(14,18) + str.charAt(19) + str.charAt(22)).replace('-','/'));
    }

    public static void upCase(StringBuilder str){
        str = new StringBuilder(getTheNumberOfDokument());
        System.out.println((str.substring(5,9) + str.substring(14,18) + str.charAt(19) + str.charAt(22)).replace('-','/').toUpperCase());
    }

    public static void checkAbc(String str){
        str = getTheNumberOfDokument();
        if(str.contains("abc") == true || str.toUpperCase().contains("abc".toUpperCase())){
            System.out.println("We have abc or ABC");
        }
        }

    public static void checkStart(String str) {
        str = getTheNumberOfDokument();
        System.out.println(str.startsWith("555"));
    }

    public static void checkEnd(String str){
        str = getTheNumberOfDokument();
        System.out.println(str.endsWith("1a2b"));
    }


    }


