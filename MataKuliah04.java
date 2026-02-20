public class MataKuliah04 {
    String kodeMk;
    String nama;
    int sks;
    int jumlahJam;

    public MataKuliah04() {

    }

    //konstruktor
    public MataKuliah04(String nm, String kode, int sks, int jumlahJam){
        nama = nm;
        kodeMk = kode;
        this.sks = sks;
        this.jumlahJam = jumlahJam;
    }

    void tampilInnformasi() {
        System.out.println("Nama: " + nama);
        System.out.println("Kode Mata Kuliah: " + kodeMk);
        System.out.println("SKS (Satuan Kredit Mahasiswa): " + sks);
        System.out.println("Jumlah Jam: " + jumlahJam);
    }

    void ubahSks(int sksBaru) {
        sks = sksBaru;
        System.out.println("SKS Berhasil Diubah menjadi: " + sks);
    }

    void tambahJam(int jam) {
        jumlahJam += jam;
    }

    void kurangiJam(int jam) {
        if (jumlahJam >= jam) {
            jumlahJam -= jam;
            System.out.println("Jam Berhasil Dikurangi. Jumlah Jam Sekarang: " + jumlahJam);
        } else {
            System.out.println("Pengurangan Jam Gagal.");
        }
    }
}
