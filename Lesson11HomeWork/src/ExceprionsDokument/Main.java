package ExceprionsDokument;

public class Main  {
    public static void main(String[] args) throws WrongLoginException, WrongPasswordException {
        Dokument.setTheNumberOfDokument("1234-abc-5678-def-9g1h");
        System.out.println(Dokument.getTheNumberOfDokument());
        Dokument.showFourBlocks(Dokument.getTheNumberOfDokument());
        Dokument.changedNumberOfDokument(Dokument.getTheNumberOfDokument());
        Dokument.showLitersToLowerCase(Dokument.getTheNumberOfDokument());
        Dokument.upCase(Dokument.getTheNumberOfDokument());
        try {
            Dokument.checkAbc(Dokument.getTheNumberOfDokument());
        } catch(AbcException e){
            System.out.println(e.getMessage());
        }
        try {
            Dokument.checkStart(Dokument.getTheNumberOfDokument());
        } catch (StartException e){
            System.out.println(e.getMessage());
        }
        try {
            Dokument.checkEnd(Dokument.getTheNumberOfDokument());
        } catch (EndException e){
            System.out.println(e.getMessage());
        }
        User.showDataOfUser("Andre","qwerty12", "qwerty12");
    }
}
