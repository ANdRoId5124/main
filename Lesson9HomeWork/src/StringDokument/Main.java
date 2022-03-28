package StringDokument;

public class Main {
    public static void main(String[] args) {
        Dokument.setTheNumberOfDokument("1234-abc-5678-def-9g10h");
        System.out.println(Dokument.getTheNumberOfDokument());
        Dokument.showFourBlocks("dokument");
        Dokument.changedNumberOfDokument("dokument");
        Dokument.showLiters("dokument");
        Dokument.upCase(new StringBuilder());
        Dokument.checkAbc("dokument");
        Dokument.checkStart("dokument");
        Dokument.checkEnd("dokument");


    }
}
