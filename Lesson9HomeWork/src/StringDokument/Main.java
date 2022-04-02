package StringDokument;

public class Main {
    public static void main(String[] args) {
        Dokument.setTheNumberOfDokument("1234-abc-5678-def-9g1h");
        System.out.println(Dokument.getTheNumberOfDokument());
        Dokument.showFourBlocks(Dokument.getTheNumberOfDokument());
        Dokument.changedNumberOfDokument(Dokument.getTheNumberOfDokument());
        Dokument.showLitersToLowerCase(Dokument.getTheNumberOfDokument());
        Dokument.upCase(Dokument.getTheNumberOfDokument());
        Dokument.checkAbc(Dokument.getTheNumberOfDokument());
        Dokument.checkStart(Dokument.getTheNumberOfDokument());
        Dokument.checkEnd(Dokument.getTheNumberOfDokument());


    }
}
