package Phone;

public class Phone {

    private long number;
    private String model;
    private int weight;

    Phone(long number, String model, int weight) {
        this.number = number;
        this.model = model;
        this.weight = weight;
    }

    Phone(long number, String model) {
        this(number, model, 0);
    }

    Phone() {
    }

    public void setNumber(long number) {
        this.number = number;
    }

    public long getNumber() {
        return number;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getModel() {
        return model;
    }

    public void receiveCall(String name) {
        System.out.println("Name: " + name + " " + "number is: " + getNumber());
    }

    public void receiveCall(String name, long number) {
        System.out.println("Name: " + name + " " + "number is: " + number);
    }

    public void showPhone() {
        System.out.println("Parameters of phone: " + "Model: " + getModel() + "\n" + "Number: " + getNumber() + "\n" + "Weight: " + getWeight() + "\n");
    }

    public void sendMessage(double[] phones){
        for(int i = 0; i < phones.length; i++){
            System.out.println(phones[i]);
        }
    }

}



