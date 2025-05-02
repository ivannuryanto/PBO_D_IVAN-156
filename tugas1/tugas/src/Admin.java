// Kelas Admin sebagai subclass dari User
class Admin extends User {
    private String username;
    private String password;

    // Constructor menggunakan super keyword
    public Admin(String nama, String nim, String username, String password) {
        super(nama, nim);
        this.username = username;
        this.password = password;
    }

    // Overriding method login
    @Override
    public boolean login(String inputUsername, String inputPassword) {
        return username.equals(inputUsername) && password.equals(inputPassword);
    }

    // Overriding method displayInfo
    @Override
    public void displayInfo() {
        System.out.println("\nLogin Admin Berhasil!");
        System.out.println("Selamat datang, " + getNama() + "!");
        System.out.println("Hak akses Admin!");
    }
}

