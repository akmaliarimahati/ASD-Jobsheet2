public class MataKuliahMain {
    public static void main(String[] args) {
        MataKuliah04 matkul1 = new MataKuliah04();
        matkul1.kodeMk = "PASD";
        matkul1.nama = "Praktikum Algoritma dan Struktur Data";
        matkul1.sks = 3;
        matkul1.jumlahJam = 6;

        matkul1.tampilInnformasi();
        matkul1.ubahSks(5);
        matkul1.tambahJam(4);
        matkul1.tampilInnformasi();

        MataKuliah04 matkul2 = new MataKuliah04("KWN", "Kewarganegaraan", 2, 4);
        matkul2.tampilInnformasi();
        matkul2.ubahSks(3);
        matkul2.tambahJam(2);
        matkul2.tampilInnformasi();
    }
}
