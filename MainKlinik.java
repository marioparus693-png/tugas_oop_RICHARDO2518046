package klinik;

public class MainKlinik {
    public static void main(String[] args) {

        // Membuat objek Pasien 1
        Pasien p1 = new Pasien();
        p1.dataNoPasien("P001");
        p1.dataNama("Budi Santoso");
        p1.dataJenisKelamin("Laki-laki");
        p1.dataUmur("35");
        p1.dataKeluhan("Demam dan batuk");
        p1.dataStatus("Rawat Jalan");

        // Membuat objek Pasien 2
        Pasien p2 = new Pasien();
        p2.dataNoPasien("P002");
        p2.dataNama("Siti Rahayu");
        p2.dataJenisKelamin("Perempuan");
        p2.dataUmur("28");
        p2.dataKeluhan("Sakit kepala");
        p2.dataStatus("Rawat Inap");

        // Membuat objek Pasien 3
        Pasien p3 = new Pasien();
        p3.dataNoPasien("P003");
        p3.dataNama("Ahmad Fauzi");
        p3.dataJenisKelamin("Laki-laki");
        p3.dataUmur("50");
        p3.dataKeluhan("Nyeri dada");
        p3.dataStatus("Gawat Darurat");

        // Menampilkan data semua pasien
        Pasien[] daftarPasien = {p1, p2, p3};

        for (Pasien p : daftarPasien) {
            System.out.println("================================");
            System.out.println("  DATA PASIEN KLINIK SEHAT");
            System.out.println("================================");
            System.out.println("No. Pasien    : " + p.cetakNoPasien());
            System.out.println("Nama          : " + p.cetakNama());
            System.out.println("Jenis Kelamin : " + p.cetakJenisKelamin());
            System.out.println("Umur          : " + p.cetakUmur() + " tahun");
            System.out.println("Keluhan       : " + p.cetakKeluhan());
            System.out.println("Status        : " + p.cetakStatus());
            System.out.println("================================");
            System.out.println();
        }
    }
}
