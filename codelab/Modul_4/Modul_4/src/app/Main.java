package app;

import perpustakaan.*;

public class Main {
    public static void main(String[] args) {
        Buku buku1 = new NonFiksi("Isaac Newton", "Tan Malaka", "Sejarah & Ilmu Pengetahuan");
        Buku buku2 = new Fiksi("Spiderman", "J. K. Rowling", "Fantasy");

        buku1.displayInfo();
        buku2.displayInfo();

        Anggota anggota1 = new Anggota("Rayhan Amrullah", "148");
        Anggota anggota2 = new Anggota("Brillian Daniar Kautama", "166");

        anggota1.displayInfo();
        anggota2.displayInfo();

        anggota1.pinjamBuku("Isaac Newton", 5);
        anggota2.pinjamBuku("Spiderman", 10);

        anggota1.kembalikanBuku("Isaac Newton");
        anggota2.kembalikanBuku("Spiderman");
    }
}