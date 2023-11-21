package com.example.muhammadrizki_crud_api;

public class NovelItem {
    String ID_Buku;
    String Judul;
    String Pengarang;
    String Tahun_Terbit;
    String Halaman;
    String Sampul;

    public String getID_Buku() {
        return ID_Buku;
    }

    public void setID_Buku(String ID_Buku) {
        this.ID_Buku = ID_Buku;
    }

    public String getJudul() {
        return Judul;
    }

    public void setJudul(String judul) {
        Judul = judul;
    }

    public String getPengarang() {
        return Pengarang;
    }

    public void setPengarang(String pengarang) {
        Pengarang = pengarang;
    }

    public String getTahun_Terbit() {
        return Tahun_Terbit;
    }

    public void setTahun_Terbit(String tahun_Terbit) {
        Tahun_Terbit = tahun_Terbit;
    }

    public String getHalaman() {
        return Halaman;
    }

    public void setHalaman(String halaman) {
        Halaman = halaman;
    }

    public String getSampul() {
        return Sampul;
    }

    public void setSampul(String sampul) {
        Sampul = sampul;
    }
}