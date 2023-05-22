public class LogicOperators {
    public static void main(String[] args) {
        int a = 8;
        int b = 5;
        //operadores de asignacion
        System.out.println("a = 8, b = 5");
        System.out.println("a es igual a b? ===> " + (a == b) );
        System.out.println("a es diferente a b? ===> " + (a != b) );
        //Operadores relacionales
        System.out.println("a > b? ==> " + (a > b));
        System.out.println("a < b? ==> " + (a < b));
        System.out.println("a >= b? ==> " + (a >= b));
        System.out.println("a <= b? ==> " + (a <= b));

        if (a == b) {
            System.out.println("a es igual a b");
        } else if (a != b) {
            System.out.println("a es diferente a b");
        }else if (a > b) {
            System.out.println("a > b");
        }else if (a < b) {
            System.out.println("a < b?");
        }else if (a >= b) {
            System.out.println("a >= b");
        }else if (a <= b) {
            System.out.println("a <= b");
        }
    }
}
