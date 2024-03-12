public class Devices {
    private boolean status;
    private int batteryLife;

    public Devices (boolean status, int batteryLife){
        this.status = status;
        this.batteryLife = batteryLife;
    }
    public void turnOn(){
        System.out.println("System is now on");
        status = true;
    }
}
