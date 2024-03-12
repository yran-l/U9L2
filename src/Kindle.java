public class Kindle extends Devices{
    private int pages;

    public Kindle (boolean status, int batteryLife, int pages){
        super(status, batteryLife);
        this.pages = pages;
    }

    public void nextPage(){
        System.out.println("turned next page");
        pages++;
    }
}
