import java.util.Scanner;
public class Siakad22 {        
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Masukkan jumlah mahasiswa: ");
        int jumlahMahasiswa = sc.nextInt();
        System.out.println("Masukkan jumlah mata kuliah: ");
        int jumlahMataKuliah = sc.nextInt();

    int[][] nilai = new int[jumlahMahasiswa][jumlahMataKuliah];

    for (int i = 0; i < nilai.length; i++) {
        System.out.println("Input nilai mahasiswa ke-" + (i+1));
        double totalPerSiswa = 0;

        for (int j = 0; j < nilai[i].length; j++) {
            System.out.println("Nilai mata kuliah " + (j+1) + ": ");
            nilai[i][j] = sc.nextInt();
            totalPerSiswa += nilai[i][j];
        }

        System.out.println("Nilai rata-rata: " + totalPerSiswa/jumlahMataKuliah);
    }
 
    System.out.println("\n====================================");
    System.out.println("Rata-rata Nilai setiap Mata Kuliah:");

    for (int j = 0; j < jumlahMataKuliah; j++) {
        double totalPerMatkul = 0;

        for (int i = 0; i < jumlahMahasiswa; i++) {
            totalPerMatkul += nilai[i][j];
        }
        System.out.println("Mata Kuliah " + (j+1) + ": " + totalPerMatkul / jumlahMahasiswa);
    }
}
}