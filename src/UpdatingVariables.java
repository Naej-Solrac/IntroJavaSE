public class UpdatingVariables {
    public static void main(String[] args) {
        int salary = 1000;
        //bono 100
        salary += 100;
        //pension
        salary -= 50;

        //hora extras $30 c/u
        //comida 45
        salary += (30 * 2) - 45;
        System.out.println(salary);
        var cuenta = 1000;
    }
}
