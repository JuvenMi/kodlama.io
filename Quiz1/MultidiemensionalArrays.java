public class MultidiemensionalArrays {
    public static void main(String[] args) {
        String[][] countrys = new String[3][3];
        countrys[0][0] = "Konya";
        countrys[0][1] = "İstanbul";
        countrys[0][2] = "Ankara";
        countrys[1][0] = "İzmir";
        countrys[1][1] = "Aydın";
        countrys[1][2] = "Afyon";
        countrys[2][0] = "Bursa";
        countrys[2][1] = "Çanakkale";
        countrys[2][2] = "Bolu";

        for (int i = 0; i < countrys.length; i++) {
            for (int j = 0; j < countrys[i].length; j++) {
                System.out.println(countrys[i][j]);
            }
            System.out.println("----------------------------");
        }
    }
}
