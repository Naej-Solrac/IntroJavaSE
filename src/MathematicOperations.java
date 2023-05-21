public class MathematicOperations {
    public static void main(String[] args) {
        double x = 2.1;
        double y = 3;
        System.out.println(Math.PI);
        //devuelve un entero hacia abajo
        System.out.println(Math.ceil(x));
        //devuelve un entero hacia arriba
        System.out.println(Math.floor(x));
        //devuelve el numero mayor
        System.out.println(Math.max(x, y));
        //devuelve un entero elevado al otro
        System.out.println(Math.pow(x, y));
        //devuelve la raiz cuadrada
        System.out.println(Math.sqrt(y));
        //area de un circulo
        //PI * r a la 2
        System.out.println(Math.PI * Math.pow(y, 2));
        //radio de una esfera 4 * PI * r a la 2
        System.out.println(4 * Math.PI * Math.pow(y ,2));
        //volumen de una esfera (4/3) * PI * r3
        System.out.println((4/3) * Math.PI * Math.pow(y, 3));
    }
}
