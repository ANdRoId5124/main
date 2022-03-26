package Phone;

public class Main {
    public static void main(String[] args) {
        Phone phone1 = new Phone(54382,"Samsung", 534);
        Phone phone2 = new Phone(97854,"Lenovo");
        Phone phone3 = new Phone();
        phone3.setWeight(534);
        phone3.setModel("Huawei");
        phone3.setNumber(515155098);
        phone1.showPhone();
        phone2.showPhone();
        phone3.showPhone();

        phone1.receiveCall("Andrew");
        phone2.receiveCall("Vlad");
        phone3.receiveCall("Pavel");

        phone1.sendMessage(new double[]{phone2.getNumber(), phone3.getNumber()});
    }
}
