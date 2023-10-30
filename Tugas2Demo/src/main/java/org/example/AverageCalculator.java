package org.example;

/**
 * Kelas AverageCalculator digunakan untuk menghitung rata-rata dari tiga nilai.
 */
public class AverageCalculator {

    /**
     * Metode ini menerima tiga nilai sebagai argumen dan mengembalikan rata-rata dari ketiga nilai tersebut.
     *
     * @param value1 Nilai pertama.
     * @param value2 Nilai kedua.
     * @param value3 Nilai ketiga.
     * @return Rata-rata dari tiga nilai.
     */
    public double calculateAverage(double value1, double value2, double value3) {
        return (value1 + value2 + value3) / 3;
    }

    /**
     * Metode utama untuk menguji perhitungan rata-rata.
     *
     * @param args Argumen dari baris perintah (tidak digunakan dalam contoh ini).
     */
    public static void main(String[] args) {
        AverageCalculator calculator = new AverageCalculator();
        double average = calculator.calculateAverage(10.0, 20.0, 30.0);
        System.out.println("Rata-rata dari 10.0, 20.0, dan 30.0 adalah: " + average);
    }
}
