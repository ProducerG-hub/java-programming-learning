package personal;

class Smartphone{
    private String brand;

    Smartphone(String brand){
        this.brand = brand;
    }

    //non-static inner class
    class Battery{
        private String battery;

        Battery(String battery){
            this.battery = battery;
        }
        public void showBattery(){
            System.out.println("Brand: "+ brand);
            System.out.println("Battery: "+battery);
        }
    }

    //static inner class
    static class OperatingSystem{
        String Os;

        OperatingSystem(String Os){
            this.Os = Os;
        }
        public void showOS(){
            System.out.println("OS: "+Os);
        }
    }
}

public class NestedClass2 {
    public static void main(String[] args) {
        Smartphone smart1 = new Smartphone("Google Pixel");
        // accessing non-static class with outer class object
        Smartphone.Battery bat1 = smart1.new Battery("5000mAh");

        //accessing static inner class without outer class object
        Smartphone.OperatingSystem os1 = new Smartphone.OperatingSystem("Android");
        bat1.showBattery();
        os1.showOS();
    }
}
