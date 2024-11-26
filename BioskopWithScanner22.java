import java.util.Scanner;

public class BioskopWithScanner22 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int baris, kolom;
        String nama, next;
        String Penonton[][] = new String[4][2];

        while (true) {
            System.out.println("Menu:");
            System.out.println("1. Input data penonton");
            System.out.println("2. Tampilkan daftar penonton");
            System.out.println("3. Exit");
            System.out.print("Pilih menu: ");
            int menu = sc.nextInt();
            sc.nextLine();

            if (menu == 1) {
                System.out.print("Masukkan Nama: ");
                nama = sc.nextLine();
                while (true) {
                    System.out.print("Masukkan Baris: ");
                    baris = sc.nextInt();
                    System.out.print("Masukkan Kolom: ");
                    kolom = sc.nextInt();
                    sc.nextLine(); 

                    if (baris < 1 || baris > 4 || kolom < 1 || kolom > 2) {
                        System.out.println("Nomor baris/kolom tidak tersedia. Silakan coba lagi.");
                    } else if (Penonton[baris-1][kolom-1] != null) {
                        System.out.println("Kursi tersebut sudah terisi oleh penonton lain. Silakan pilih kursi lain.");
                    } else {
                        Penonton[baris-1][kolom-1] = nama;
                        break;
                    }
                }

                System.out.print("Input Penonton Lainnya? y/n: ");
                next = sc.nextLine();
                if (next.equalsIgnoreCase("n")) {
                    continue;
                }

            } else if (menu == 2) {
                System.out.println("Daftar Penonton:");
                for (int i = 0; i < Penonton.length; i++) {
                    for (int j = 0; j < Penonton[i].length; j++) {
                        if (Penonton[i][j] != null) {
                            System.out.println("Baris " + (i+1) + " Kolom " + (j+1) + ": " + Penonton[i][j]);
                        } else {
                            System.out.println("Baris " + (i+1) + " Kolom " + (j+1) + ": ***");
                        }
                    }
                }

            } else if (menu == 3) {
                System.out.println("Keluar dari program. Terima kasih!");
                break;

            } else {
                System.out.println("Pilihan tidak valid, silakan coba lagi.");
            }
        }
    }
}
