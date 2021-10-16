public class InterfaceRunner {
    
    public static void main(String[] args) {
        Pricable pizza = new Pizza("4 сыра", 1, 50, Size.L);
        Pricable phone = new CellPhone("Xiaomi", "XT1575", 1, 300);
        Pricable fridge = new Fridge("SAMSUNG","FFRRIIZZEE", 1, 500);



        printDeliveryPrice(pizza);
        printDeliveryPrice(phone);
        printDeliveryPrice(fridge);

    }

    private static void printDeliveryPrice(Pricable del){
        System.out.println("Delivery prise "+del.calcDeliveryPrice());
        System.out.println("Order prise "+del.calcOrderPrice());
    }

}
