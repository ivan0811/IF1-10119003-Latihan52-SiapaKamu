package com.ivanfaathirza;

/**
 *
 * @author
 * NAMA     : Ivan Faathirza
 * KELAS    : IF1
 * NIM      : 10119003
 * Deskripsi Program: menampilkan keterangan manusia kordinaat menggunakan konsep inheritance dan polymorphism
 */

public class Main {

    public static void main(String[] args) {
        Dosen dosen = new Dosen();
        dosen.setNama("Rizki Adam Kurniawan");
        dosen.setNip("41227829930");
        dosen.setUmur(27);
        dosen.setMataKuliah("PBO");

        System.out.println("NIP DOSEN : ".concat(dosen.getNip()));
        dosen.siapaKamu();
        dosen.mengajarApa();

        Mahasiswa mahasiswa = new Mahasiswa();
        mahasiswa.setNama("Ivan Faathirza");
        mahasiswa.setNim("10119003");
        mahasiswa.setKelas("IF1");
        mahasiswa.setUmur(19);

        System.out.println("\nNIM Mahasiswa : ".concat(mahasiswa.getNim()));
        mahasiswa.siapaKamu();
        mahasiswa.kelasApa();
    }
}
