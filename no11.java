class Mahasiswa {
    private String nama;
    private int nilai;
    // Constructor
    public Mahasiswa(String nama, int nilai) {
        this.nama = nama;
        this.nilai = nilai;
    }
    // Getter
    public String getNama() {
        return nama;
    }
    public int getNilai() {
        return nilai;
    }
    // Setter
    public void setNama(String nama) {
        this.nama = nama;
    }
    public void setNilai(int nilai) {
        this.nilai = nilai;
    }
    // Method untuk menampilkan data
    public void tampilkanData() {
        System.out.println("Nama: " + nama + " - Nilai: " + nilai);
    }
}
public class no11 {
    public static void main(String[] args) {
        // Membuat array mahasiswa
        Mahasiswa[] mhs = new Mahasiswa[3];
        mhs[0] = new Mahasiswa("King Zaki", 95);
        mhs[1] = new Mahasiswa("Prince Ardi", 85);
        mhs[2] = new Mahasiswa("Ajudan Farrash", 60);

        // Menampilkan semua data
        for (Mahasiswa h : mhs) {
            h.tampilkanData();
        }

        // Mencari mahasiswa dengan nilai tertinggi
        Mahasiswa terbaik = mhs[0];
        for (Mahasiswa m : mhs) {
            if (m.getNilai() > terbaik.getNilai()) {
                terbaik = m;
            }
        }
        System.out.println("Mahasiswa dengan nilai tertinggi: " 
                           + terbaik.getNama() + " (" + terbaik.getNilai() + ")");
    }
}
