package ExceprionsDokument;

public class Main {
    public static void main(String[] args){
        Dokument.setTheNumberOfDokument("1234-abc-5678-def-9g1h");
        System.out.println(Dokument.getTheNumberOfDokument());
        Dokument.showFourBlocks(Dokument.getTheNumberOfDokument());
        Dokument.changedNumberOfDokument(Dokument.getTheNumberOfDokument());
        Dokument.showLitersToLowerCase(Dokument.getTheNumberOfDokument());
        Dokument.upCase(Dokument.getTheNumberOfDokument());
        try {
            Dokument.checkAbc(Dokument.getTheNumberOfDokument());
        } catch(Exceptions.AbcException e){
            System.out.println(e.getMessage());
        }
        try {
            Dokument.checkStart(Dokument.getTheNumberOfDokument());
        } catch (Exceptions.StartException e){
            System.out.println(e.getMessage());
        }
        try {
            Dokument.checkEnd(Dokument.getTheNumberOfDokument());
        } catch (Exceptions.EndException e){
            System.out.println(e.getMessage());
        }
    }
}
