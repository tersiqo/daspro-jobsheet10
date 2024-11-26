import java.util.Scanner;

public class Tugas22 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int jumlahResponden = 10, jumlahPertanyaan = 6;

        int[][] hasilSurvei = new int[jumlahResponden][jumlahPertanyaan];

        System.out.println("Masukkan hasil survei (1-5):");
        for (int i = 0; i < jumlahResponden; i++) {
            System.out.println("Responden ke-" + (i + 1));
            for (int j = 0; j < jumlahPertanyaan; j++) {
                System.out.print("Pertanyaan " + (j + 1) + ": ");
                hasilSurvei[i][j] = scanner.nextInt();
            }
        }

        System.out.println("\nRata-rata nilai setiap responden:");
        for (int i = 0; i < jumlahResponden; i++) {
            int totalNilai = 0;
            for (int j = 0; j < jumlahPertanyaan; j++) {
                totalNilai += hasilSurvei[i][j];
            }
            double rataRata = totalNilai / jumlahPertanyaan;
            System.out.println("Responden ke-" + (i + 1) + ": " + rataRata);
        }

        System.out.println("\nRata-rata nilai setiap pertanyaan:");
        for (int j = 0; j < jumlahPertanyaan; j++) {
            int totalNilai = 0;
            for (int i = 0; i < jumlahResponden; i++) {
                totalNilai += hasilSurvei[i][j];
            }
            double rataRata = totalNilai / jumlahResponden;
            System.out.println("Pertanyaan " + (j + 1) + ": " + rataRata);
        }

        double totalNilaiKeseluruhan = 0;
        for (int i = 0; i < jumlahResponden; i++) {
            for (int j = 0; j < jumlahPertanyaan; j++) {
                totalNilaiKeseluruhan += hasilSurvei[i][j];
            }
        }
        double rataRataKeseluruhan = (double) totalNilaiKeseluruhan / (jumlahResponden * jumlahPertanyaan);
        System.out.println("\nRata-rata nilai keseluruhan: " + rataRataKeseluruhan);
    }
}