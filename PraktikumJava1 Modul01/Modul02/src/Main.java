import Model.Mahasiswa;

public class Main {
    public static void main(String[] args) {
        Mahasiswa m1 = new Mahasiswa("19710046", "Maulidatul hasanah", "02-06-01");
        m1.tampilkanAtribut();
        System.out.println(m1.getNama());

    }
}
