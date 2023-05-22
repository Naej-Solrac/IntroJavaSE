public class ForAnidado {
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
        for (int i = 0; i < androidVersions.length; i++) {
            System.out.println(androidVersions[i]);
        }


        String cities[][] = new String[4][2];
        cities[0][0] = "colombia";
        cities[0][1] = "medellin";
        cities[1][0] = "colombia";
        cities[1][1] = "bogota";
        cities[2][0] = "mexico";
        cities[2][1] = "cdmx";
        cities[3][0] = "mexico";
        cities[3][1] = "guadalajara";
        //no hay control de los indices

        for (String[] city : cities) {
            for (String s : city) {
                System.out.println(s);
            }
        }

        for (int i = 0; i < cities.length; i++) {
            for (int j = 0; j < cities[i].length; j++) {
                System.out.println(cities[i][j]);
            }
        }

        System.out.println(cities.length);
    }
}
