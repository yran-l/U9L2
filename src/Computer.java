public class Computer extends Devices {
    private int tabs;

    public Computer (boolean status, int batteryLife, int tabs){
        super(status, batteryLife);
        this.tabs = tabs;
    }

    public void addTab(){
        System.out.println("added a new tab");
        tabs++;
    }
}
