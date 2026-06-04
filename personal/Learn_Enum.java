package personal;

public class Learn_Enum {
    enum Role{
        CASHIER("You can only sell and viw your sales report"),
        SHOP_ADMIN("You can only manage your shop"),
        SUPER_ADMIN("You can manage the all system");

        private String description;

         Role(String description){
            this.description = description;
        }

        public String getDescription() {
            return description;
        }
    }

    public static void main(String[] args) {
        Role cashier = Role.CASHIER;
        Role shopAdmin = Role.SHOP_ADMIN;
        Role superAdmin = Role.SUPER_ADMIN;
        System.out.println(cashier + " Scope: "+cashier.getDescription());
        System.out.println(shopAdmin + " Scope: "+shopAdmin.getDescription());
        System.out.println(superAdmin + " Scope: "+superAdmin.getDescription());
    }
}
