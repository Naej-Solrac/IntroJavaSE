public class Arrays {
    public static void main(String[] args) {

        String days[] = new String[7];


        int numbers[][][] = new int[2][2][2];
        int numbers4 [][][][] = new int [2][2][2][2];

        String[] androidVersions = new String[17];
        //agregando:
        androidVersions[0] = "appel pie";
        androidVersions[1] = "banana bread";
        androidVersions[2] = "cup cake";
        androidVersions[3] = "donut";
        //accediendo
        System.out.println(androidVersions[0]);
        System.out.println(androidVersions[1]);
        System.out.println(androidVersions[2]);
        System.out.println(androidVersions[3]);

        String cities[][] = new String[4][2];
        cities[0][0] = "colombia";
        cities[0][1] = "medellin";
        cities[1][0] = "colombia";
        cities[1][1] = "bogota";
        cities[2][0] = "mexico";
        cities[2][1] = "cdmx";
        cities[3][0] = "mexico";
        cities[3][1] = "guadalajara";

        System.out.print(cities[0][0] + " ");
        System.out.println(cities[0][1]);
        System.out.print(cities[1][0] + " ");
        System.out.println(cities[1][1]);
        System.out.print(cities[2][0] + " ");
        System.out.println(cities[2][1]);
        System.out.print(cities[3][0] + " ");
        System.out.println(cities[3][1]);

    }
}
