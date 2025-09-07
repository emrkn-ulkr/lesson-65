
public class Main {
    public static void main(String[] args) {

        int matris[][] = { //integer değerinde matris adında liste oluşturdum satır ve sutün alacak dedim.
                {104, 5826, 91745, 63971, 25469, 7381, 19428, 135907, 8263, 47192},
                {197, 56304, 820731, 514689, 30142, 6893, 124058, 3976, 1582, 9367},
                {142, 5680, 73014, 962813, 48037, 3519, 726408, 6013, 98572, 13469},
                {163, 50718, 96320, 82537, 9286, 1539, 786014, 3429, 65071, 19823},
                {180, 53697, 41803, 29615, 84370, 6194, 70238, 3596, 18247, 9036},
                {1881, 1938, 1924, 1925, 1923, 1937, 1934, 1932, 1927, 1926}};
        System.out.println(matris[5][6]+"\n");
           // 5.satırın 6.sutünunu getir dedim
        int [][] matris2 = new int[3][4]; // integer değerinde matris2 oluşturdum bu liste ise 3 satır 4 sutündan olusacak dedim.
        int number=1;
        for(int i=0; i<matris2.length; i++){ // 3 satır oluşturuldu
            for(int j = 0; j<matris2[i].length; j++){ // satırlardaki sutünlara değer atıyorum
                matris2[i][j] = number++;  // matris2 deki bütün değerleri numberden al numberi 1 artır.
                System.out.print(matris2[i][j]+" "); // cıktı ver
            }
            System.out.println();
        }

        System.out.println("\nforEach ile dizi yazdırma\n");
        for(int [] row : matris2){
            for(int col: row){
                System.out.print(col+"|");
            }
            System.out.println();
        }
    }
}