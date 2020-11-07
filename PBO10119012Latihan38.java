
package pbo10119012latihan38;

/**
 *
 * @author damai
 */
public class PBO10119012Latihan38 {

    
    public static void main(String[] args) {
         double diameter, jarijari, luas, keliling;
        System.out.println ("=====Perhitungan Lingkaran=====");
        RumusLingkaran hitung_lingkaran = new RumusLingkaran();

        diameter = hitung_lingkaran.getDiameter();
        jarijari = hitung_lingkaran.getJarijari();
        luas = hitung_lingkaran.getLuas();
        keliling = hitung_lingkaran.getKeliling();
        hitung_lingkaran.hasilHitung();
    }
}
