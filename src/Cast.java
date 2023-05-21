public class Cast {
    public static void main(String[] args) {
        //en un año ubicar 30 perritos
        //cuantos perritos ubique al mes

        double monthyDogs = 30.0/12.0;
        System.out.println(monthyDogs);

        //estimacion
        int estimatedMonthyDogs = (int)monthyDogs;
        System.out.println(estimatedMonthyDogs);

        //exactitud
        int a = 30, b = 12;
        System.out.println((double)a/b);

    }
}
