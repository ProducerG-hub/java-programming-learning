package personal;

class Computer{
    public String brand;

    Computer(String brand){
        this.brand = brand;
    }

    class Processor{
        public void displayProcessor(){
            System.out.println("Brand: "+ brand);
            System.out.println("Processor: Intel Core i7");
        }
    }
}
public class NestedClass {
    public static void main(String[] args) {
        Computer com1 = new Computer("HP");
        Computer.Processor proc1 = com1.new Processor();
        proc1.displayProcessor();

        Computer com2 = new Computer("DELL");
        Computer.Processor proc2 = com2.new Processor();
        proc2.displayProcessor();
    }
}
