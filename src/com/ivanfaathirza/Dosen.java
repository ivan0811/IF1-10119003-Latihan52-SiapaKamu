package com.ivanfaathirza;

public class Dosen extends Manusia{
    private String nip, mataKuliah;

    public String getNip(){
        return nip;
    }

    public void setNip(String nip) {
        this.nip = nip;
    }

    public String getMataKuliah() {
        return mataKuliah;
    }

    public void setMataKuliah(String mataKuliah) {
        this.mataKuliah = mataKuliah;
    }

    public void mengajarApa(){
        System.out.println("Saya "+getNama()+" umur "+getUmur()+" tahun sedang mengajar matakuliah"+getMataKuliah());
    }

    public void siapaKamu(){
        System.out.println("Saya Dosen");
    }
}
