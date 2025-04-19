public class Mahasiswa extends User {
    private static final String VALID_NAMA = "Ivan Nuryanto";
    private static final String VALID_NIM = "202410370110156";

    public Mahasiswa(String nama, String nim) {
        super(nama, nim);
    }

    @Override
    public boolean login(String inputNama, String inputNim) {
        if (!VALID_NAMA.equals(inputNama) || !VALID_NIM.equals(inputNim)) {
            System.out.println("Login Gagal: Nama atau NIM salah!");
            return false;
        }
        return true;
    }

    @Override
    public void displayInfo() {
        System.out.println("\nLogin Mahasiswa Berhasil!");
        super.displayInfo();
    }
}