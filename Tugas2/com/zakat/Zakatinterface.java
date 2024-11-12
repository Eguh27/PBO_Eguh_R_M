package com.zakat;


public interface ZakatInterface {
    double hitungZakat();
}

class ZakatMal implements ZakatInterface {
    private final double totalHarta;

    public ZakatMal(double totalHarta) {
        this.totalHarta = totalHarta;
    }

    @Override
    public double hitungZakat() {
        return totalHarta * 0.025; // Menghitung zakat mal tanpa mempertimbangkan nisab
    }
}

class ZakatPenghasilan implements ZakatInterface {
    private final double penghasilanBulanan;

    public ZakatPenghasilan(double penghasilanBulanan) {
        this.penghasilanBulanan = penghasilanBulanan;
    }

    @Override
    public double hitungZakat() {
        return penghasilanBulanan * 0.025; // Menghitung zakat penghasilan tanpa mempertimbangkan nisab
    }
}

class ZakatFitrah implements ZakatInterface {
    private final int jumlahAnggotaKeluarga;
    private final double hargaBeras;

    public ZakatFitrah(int jumlahAnggotaKeluarga, double hargaBeras) {
        this.jumlahAnggotaKeluarga = jumlahAnggotaKeluarga;
        this.hargaBeras = hargaBeras;
    }

    @Override
    public double hitungZakat() {
        return jumlahAnggotaKeluarga * hargaBeras * 2.5; // Menghitung zakat fitrah berdasarkan jumlah anggota keluarga
    }
}
