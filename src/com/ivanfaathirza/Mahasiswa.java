package com.ivanfaathirza;

public class Mahasiswa extends Manusia{
    private String nim, kelas;

    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public String getKelas() {
        return kelas;
    }

    public void setKelas(String kelas) {
        this.kelas = kelas;
    }

    public void kelasApa(){
        System.out.println("Saya "+getNama()+" umur "+getUmur()+" tahun sedang belajar di kelas"+getKelas());
    }

    public void siapaKamu(){
        System.out.println("Saya Mahasiswa");
    }
}
