package oopclasses.apple;

public class IosApp {
    private String name;
    private String version;
    private double memorysize;
    private double price;
    private boolean isOpen;

    public IosApp (String name, String version, double memorySize, double price) {
        this.name = name;
        this.version = version;
        this.memorysize = memorySize;
        this.price = price;
        this.isOpen = false;
    }

    /**
     * we want to be able to open applications that we have Iphone
     */

    public void open() {
        System.out.println("Opened" + name);
        isOpen= true;
    }
    public void close() {
        System.out.println("Closed " + name + " application");
        isOpen = false;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public double getMemorysize() {
        return memorysize;
    }

    public void setMemorysize(double memorysize) {
        this.memorysize = memorysize;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    /*
    *use it to check if the app is open or not
    * @return
     */
    public boolean isOpen() {
        return isOpen;
    }
}
