package klinik;

public class Pasien {

    // Atribut
    String noPasien;
    String nama;
    String jenisKelamin;
    String umur;
    String keluhan;
    String status;

    // Setter Methods
    void dataNoPasien(String NoPasien) {
        this.noPasien = NoPasien;
    }

    void dataNama(String Nama) {
        this.nama = Nama;
    }

    void dataJenisKelamin(String JenisKelamin) {
        this.jenisKelamin = JenisKelamin;
    }

    void dataUmur(String Umur) {
        this.umur = Umur;
    }

    void dataKeluhan(String Keluhan) {
        this.keluhan = Keluhan;
    }

    void dataStatus(String Status) {
        this.status = Status;
    }

    // Getter Methods
    String cetakNoPasien() {
        return noPasien;
    }

    String cetakNama() {
        return nama;
    }

    String cetakJenisKelamin() {
        return jenisKelamin;
    }

    String cetakUmur() {
        return umur;
    }

    String cetakKeluhan() {
        return keluhan;
    }

    String cetakStatus() {
        return status;
    }
}
