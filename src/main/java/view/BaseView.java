package view;

public abstract class BaseView {


    public void print(String alertMessage){

        System.out.println("\n"+alertMessage);
    }


    void clearTop() {
        System.out.print("\b\b\b\b\b");
    }

    public void typeAlert(String instruction){
        System.out.print(instruction);
    }
}
