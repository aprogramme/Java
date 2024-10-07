interface Camera{
    void takeSnap();
    void recordVideo();
    private void greet(){
        System.out.println("Good Morning");
    }
    default void record4KVideo(){
        greet();
        System.out.println("Recording in 4K...");
    }
}

interface Wifi{
    String[] getNetwork();
    void connectToNetwork(String network);
}

class CellPhone{
    void cellNumber(int phoneNumber){
        System.out.println("Calling " + phoneNumber);
    }
    void pickCall(){
        System.out.println("Connecting...");
    }
}

class SmartPhone extends CellPhone implements Wifi, Camera{
    public void takeSnap(){
        System.out.println("Taking snap");
    }
    public void recordVideo(){
        System.out.println("Taking video");
    }
    // public void record4KVideo(){
    //     System.out.println("Taking 4K video");
    // }
    public String[] getNetwork(){
        System.out.println("Getting List of Network...");
        String[] networkList = {"Harry", "Prashant", "Anjali5G"};
        return networkList;
    }
    public void connectToNetwork(String network){
        System.out.println("Connecting to " + network);
    }
    public void sampleMeth(){
        System.out.println("Meth");
    }
}

public class A44_Polymorphism_in_Inheritance {
    public static void main(String[] args){
        Camera cam = new SmartPhone();  // This is a smartphone but use as a camera
        // cam,getNetwork();  --> Not allowed
        // cam.sampleMeth(); --> Not allowed
        cam.record4KVideo();

        SmartPhone s = new SmartPhone();
        s.sampleMeth();
        s.recordVideo();
        s.getNetwork();
        s.cellNumber(987);
    }
}