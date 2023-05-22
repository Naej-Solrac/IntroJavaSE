public class Switch {
    public static void main(String[] args) {
        String colorModeSelected = "Orange";

        switch (colorModeSelected) {
            case "Light":
                System.out.printf("Seleccionaste Light Mode");
                break;
            case "Night":
                System.out.println("Seleccionaste Night Mode");
                break;
            case "Blue Dark":
                System.out.printf("Seleccionaste Blue Dark Mode");
                break;
            case "Dark":
                System.out.printf("Seleccionaste Dark Mode");
                break;
            default:
                System.out.printf("Selecciona una opcion correcta");
        }
    }
}
