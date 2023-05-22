import org.w3c.dom.ls.LSOutput;

public class Funciones {
    public static void main(String[] args) {
        double y = 3;

        //area de un circulo //PI * r a la 2
        double area = circleArea(y);
        System.out.println(area);

        //radio de una esfera 4 * PI * r a la 2
        double radio = sphereArea(y);
        System.out.println(radio);

        //volumen de una esfera (4/3) * PI * r3
        double volumen = sphereVolume(y);
        System.out.println(volumen);

        System.out.println("Soles a dolares: " + convertToDollar(100,"PER"));
        System.out.println("Pesos a dolares: " + convertToDollar(100,"PER"));
        System.out.println("De soles a pesos MXN: " + convertToPesosMXN(100));

    }
    public static double circleArea (double radio) {
        return Math.PI * Math.pow(radio, 2);
    }
    public static double sphereArea (double radio) {
        return 4 * Math.PI * Math.pow(radio ,2);
    }
    public static double sphereVolume (double radio) {
        return (4/3) * Math.PI * Math.pow(radio, 3);
    }
    /**
     * Descripcion: Funcion que especificando su moneda convierte una cantidad de dinero a dolares
     * @param quantity Cantidad de dinero
     * @param currency tipo de moneda: solamente acepta PER O MXN
     * */
    //convertir a dolar
    public static double convertToDollar (double quantity, String currency) {
        switch (currency) {
            case ("PER"):
                quantity = ((double)quantity * 0.27);
                break;
            case  ("MXN"):
                quantity *= (double)0.056;
                break;
        }
        return quantity;
    }
    public static double convertToPesosMXN (double soles) {
        double pesosMXN;
        return pesosMXN = (double)soles * 4.82;
    }
}
