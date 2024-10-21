//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Playlist playlist = new Playlist();

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Tambah lagu");
            System.out.println("2. Tampilkan playlist");
            System.out.println("3. Keluar");
            System.out.print("Pilih menu (1-3): ");

            int pilihan = scanner.nextInt();
            scanner.nextLine();

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan judul lagu: ");
                    String judul = scanner.nextLine();
                    playlist.addSong(judul);
                    System.out.println("Lagu '" + judul + "' telah ditambahkan ke playlist.");
                    break;
                case 2:
                    playlist.displayPlaylist();
                    break;
                case 3:
                    System.out.println("Terima kasih telah menggunakan program ini.");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Pilihan tidak valid. Silakan coba lagi.");
            }
        }
    }
}
