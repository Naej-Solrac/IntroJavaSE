public class ForLoop {
    static boolean isTurnOnLight = false;
    public static void main(String[] args) {
        setIsTurnOnOffLight();
        for (int i = 0; i <= 10; i++) {
            printSOS();
        }
    }
    public static void printSOS () {
        System.out.println(". . . _ _ _ . . .");
    }
    public static void setIsTurnOnOffLight () {
        isTurnOnLight = !isTurnOnLight;
    }
}
