package personal;

class Vehicles{
    public String brand;

    Vehicles(String brand){
        this.brand = brand;
    }

    public void Start(){
        System.out.println("Always vehicles starts in different ways");
    }

}

class Cars extends Vehicles{
    public Cars(){
        super("Mazda Cars");
    }

    @Override
    public void Start() {
        super.Start();
        System.out.println(brand + " starts with key");
    }
}

class Bikes extends Vehicles{
    public Bikes(){
        super("Honda Bikes");
    }

    @Override
    public void Start(){
        System.out.println(brand + " starts with button");
    }
}

class Trucks extends Vehicles{
    public Trucks(){
        super("Scania Trucks");
    }

    @Override
    public void Start(){
        System.out.println(brand + " starts heavily");
    }
}

public class Inheritance_V2 {
    public static void main(String[] args) {
        Vehicles v1 = new Cars();
        Vehicles v2 = new Bikes();
        Vehicles v3 = new Trucks();

        v1.Start();
        v2.Start();
        v3.Start();
    }
}
