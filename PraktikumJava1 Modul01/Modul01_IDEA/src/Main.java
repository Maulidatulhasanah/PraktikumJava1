import java.util.Locale;

public class Main {
    public static void main(String[] args){
        String namaDepan = "Maulidatul";
        String namaBelakang = "Hasanah";
        int usia = 20;
        int targetTahunKuliah = 4;
        double ipk = 3.45;
        char nilaiAbjad = 'A';
        boolean cantik = true;

        System.out.println(namaDepan + namaBelakang);

        char[] unisKaChar = {'U','N','I','S','K','A'};
        String unisKaString = new String(unisKaChar);
        System.out.println(unisKaString);

        String namaLengkap = namaDepan + " " + namaBelakang;
        System.out.println(namaLengkap.length());
        System.out.println(namaLengkap.indexOf("tul"));
        System.out.println(namaLengkap.substring(8));
        System.out.println(namaLengkap.substring(8,13));
        System.out.println(namaLengkap.replace( "tul", "Yasa"));
        System.out.println(namaLengkap.toUpperCase());
        System.out.println(namaLengkap.toLowerCase());
        System.out.println(namaLengkap.charAt(8));

        String[] namaArray = namaLengkap.split( " ");

        for(String nama : namaArray){
            System.out.println(nama);
        }
    }
}


