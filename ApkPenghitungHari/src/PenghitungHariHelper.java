package aplikasipenghitunghari;

import java.time.LocalDate;
import java.time.YearMonth;

public class PenghitungHariHelper {

    /**
     * Menghitung jumlah hari dalam bulan dan tahun tertentu
     * @param tahun tahun yang dimasukkan user
     * @param bulan bulan yang dipilih user (1 = Januari, 12 = Desember)
     * @return jumlah hari dalam bulan tersebut
     */
    public int hitungJumlahHari(int tahun, int bulan) {
        YearMonth ym = YearMonth.of(tahun, bulan);
        return ym.lengthOfMonth();
    }

    /**
     * Mengecek apakah tahun tersebut kabisat
     * @param tahun tahun yang dimasukkan user
     * @return true jika kabisat, false jika tidak
     */
    public boolean isKabisat(int tahun) {
        return java.time.Year.isLeap(tahun);
    }

    /**
     * Mendapatkan hari pertama dan terakhir dalam bulan tersebut
     * @param tahun tahun yang dimasukkan user
     * @param bulan bulan yang dipilih user
     * @return teks berisi nama hari pertama dan terakhir
     */
    public String getHariPertamaTerakhir(int tahun, int bulan)
