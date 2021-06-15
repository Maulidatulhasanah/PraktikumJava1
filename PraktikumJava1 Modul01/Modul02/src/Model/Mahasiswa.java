package Model;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Mahasiswa {
    String npm;
    String nama;
    Date tanggalLahir;
    final String POLA_TANGGAL = "dd-MM-yyyy";
    final SimpleDateFormat SDF = new SimpleDateFormat(POLA_TANGGAL);

void tampilkanAtribut(){
    System.out.println("Nama \t\t\t : " + this.nama);
    System.out.println("NPM \t\t\t : " + this.npm);
    System.out.println("Tanggal Lahir \t : " + SDF.format(this.tanggalLahir));
}
    public Mahasiswa() {
    }

    public Mahasiswa(String npm, String nama, Date tanggalLahir) {
        this.npm = npm;
        this.nama = nama;
        this.tanggalLahir = tanggalLahir;
    }

    public Mahasiswa(String npm, String nama, String tanggalLahir) {
        this.npm = npm;
        this.nama = nama;
        try {
            this.tanggalLahir = SDF.parse(tanggalLahir);
        }  catch (ParseException e){
            System.err.println("Kesalahan pada tanggal lahir");
        }
    }


    void menyapa() {
        System.out.println("Hai nama aku : " + this.nama);
    }

    String getNama(){
        return nama;
    }

    int hitungUsia() {
        Calendar tanggalLahir = Calendar.getInstance();
        tanggalLahir.setTime(this.tanggalLahir);
        Calendar tanggalIni = Calendar.getInstance();

        int tahunlLahir = tanggalLahir.get(Calendar.YEAR);
        int tahunIni = tanggalIni.get(Calendar.YEAR);

        int selisihTahun = tahunIni - tahunlLahir;

        int bulanLahir = tanggalLahir.get(Calendar.MONTH);
        int bulanIni = tanggalIni.get(Calendar.MONTH);

        if(bulanIni<bulanLahir){
            selisihTahun--;
        }else{
            int tanggalTanggalLahir = tanggalLahir.get(Calendar.DAY_OF_MONTH);
            int tanggalTanggalIni = tanggalIni.get(Calendar.DAY_OF_MONTH);
            if(bulanIni == bulanLahir){
                if(tanggalTanggalIni < tanggalTanggalLahir){
                    selisihTahun--;
                }
            }
        }
        return selisihTahun;
            }
        }



