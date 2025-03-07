
import java.util.Scanner;

public class tugas1 {
    public tugas1() {
    }

    public static <string> void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Pilih jenis login:");
        System.out.println("1. Admin");
        System.out.println("2. Mahasiswa");
        System.out.print("Masukkan pilihan: ");
        int pilihan = scanner.nextInt();
        scanner.nextLine();
        String nimTerakhir = "156";
        String namaMahasiswa = "Ivan Nuryanto";
        String nimMahasiswa = "202410370110156";
        if (pilihan == 1) {
            System.out.print("Masukkan username: ");
            String username = scanner.nextLine();
            System.out.print("Masukkan password: ");
            String password = scanner.nextLine();
            String validUsername = "Admin" + nimTerakhir;
            String validPassword = "password" + nimTerakhir;
            if (username.equals(validUsername) && password.equals(validPassword)) {
                System.out.println("Login Admin berhasil!");
            } else {
                System.out.println("Login gagal! Username atau password salah.");
            }
        } else if (pilihan == 2) {
            System.out.print("Masukkan Nama: ");
            String nama = scanner.nextLine();
            System.out.print("Masukkan NIM: ");
            String nim = scanner.nextLine();
            String validnama = "Ivan";
            String validnim = "156";
            if (nama.equals(namaMahasiswa) && nim.equals(nimMahasiswa)) {
                System.out.println("Login Mahasiswa berhasil!");
                System.out.println("Nama: " + nama);
                System.out.println("NIM: " + nim);
            } else {
                System.out.println("Login gagal! Nama atau NIM salah.");
            }
        } else {
            System.out.println("Pilihan tidak valid.");
        }

        scanner.close();
    }
}
