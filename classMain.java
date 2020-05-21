
public class main {
    public static void main(String[] args) {

        Menu menu = new Menu(); //object type 
        ProductServices services = new ProductServices(); //object type 
        Integer option = null; // reference type
        ProductRepository repository = ProductRepository.getInstance(); //object type 

        while (option == null || option != 0) {
            menu.display();
            option = menu.readOption(); //assingnment

            //Comparison if 
            switch (option) {
                case 1:
                    services.add();
                    break;
                    // break means in case of true comparison it breaks execution

                case 2:
                    services.list();
                    break;
                case 3:
                    services.displayItem(); // method calling
                    break;

                case 4:
                    services.deleteItem();
                    break;

                case 5:
                    services.alterItem();
                    break;

            }
        }
    }
}
