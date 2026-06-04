package personal;

enum Roles{
    CASHIER ("Can sell products",1),
    SHOP_ADMIN ("Can manage shop",2),
    SUPER_ADMIN ("Can manage system",3);

    private String description;
    private int level;

    Roles(String description, int level){
        this.description = description;
        this.level = level;
    }

    public String getDescription() {
        return description;
    }

    public int getLevel() {
        return level;
    }


    public void displayDetails(){
        System.out.println("Level: " + getLevel());
        System.out.println("Role: " + this);
        System.out.println("Description: " + getDescription());
        System.out.println("=========================================");
    }
}
public class Pos {
    public static void main(String[] args) {
        Roles cashier = Roles.CASHIER;
        Roles shopAdmin = Roles.SHOP_ADMIN;
        Roles superAdmin = Roles.SUPER_ADMIN;

        cashier.displayDetails();
        shopAdmin.displayDetails();
        superAdmin.displayDetails();
    }
}
