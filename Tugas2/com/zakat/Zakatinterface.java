package com.zakat;


public interface ZakatInterface {
    double hitungZakat();
}

class ZakatMal implements ZakatInterface {
    private double totalHarta;

    public double getTotalHarta() {
        return totalHarta;
    }

    public void setTotalHarta(double totalHarta) {
        this.totalHarta = totalHarta;
    }

    @Override
    public double hitungZakat() {
        return totalHarta * 0.025;
    }
}

class ZakatPenghasilan implements ZakatInterface {
    private double penghasilanBulanan;

    public double getPenghasilanBulanan() {
        return penghasilanBulanan;
    }

    public void setPenghasilanBulanan(double penghasilanBulanan) {
        this.penghasilanBulanan = penghasilanBulanan;
    }

    @Override
    public double hitungZakat() {
        return penghasilanBulanan * 0.025;
    }
}

class ZakatFitrah implements ZakatInterface {
    private int jumlahAnggotaKeluarga;
    private double hargaBeras;

    public int getJumlahAnggotaKeluarga() {
        return jumlahAnggotaKeluarga;
    }

    public void setJumlahAnggotaKeluarga(int jumlahAnggotaKeluarga) {
        this.jumlahAnggotaKeluarga = jumlahAnggotaKeluarga;
    }

    public double getHargaBeras() {
        return hargaBeras;
    }

    public void setHargaBeras(double hargaBeras) {
        this.hargaBeras = hargaBeras;
    }

    @Override
    public double hitungZakat() {
        return jumlahAnggotaKeluarga * hargaBeras * 2.5;
    }
}
