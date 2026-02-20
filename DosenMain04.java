public class DosenMain04 {
    public static void main(String[] args) {
        Dosen04 dosen1 = new Dosen04();
        dosen1.idDosen = "CH12";
        dosen1.nama = "Choi Yeonjun S.Pd";
        dosen1.statusAktif = true;
        dosen1.tahunBergabung = 1999;
        dosen1.bidangKeahlian = "Algoritma dan Struktur Data";

        dosen1.tampilInformasi();
        dosen1.ubahKeahlian("Pengenalan SI");
        System.out.println("Masa Kerja: " + dosen1.hitungMasaKerja(2026) + " tahun");
        dosen1.setStatusAktif(false);
        dosen1.tampilInformasi();

        Dosen04 dosen2 = new Dosen04("GYN13","Go Youn Jung",true,2020,"Bahasa Jerman");
        dosen2.tampilInformasi();
        dosen2.ubahKeahlian("Bahasa Inggris");
        System.out.println("Masa Kerja: " + dosen2.hitungMasaKerja(2025) + " tahun");
        dosen2.setStatusAktif(false);
        dosen2.tampilInformasi();
    }
}
