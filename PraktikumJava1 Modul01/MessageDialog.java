import javax.swing.JOptionPane;
public class MessageDialog{
	public static void main(String[] args){

	String namaDepan = "Maulidatul";
	String namaBelakang = "Hasanah";
	int usia = 20;
	int targetTahunKuliah = 4;
	double ipk = 3.45;
	char nilaiAbjad = 'A';
	boolean tampan = true;

    System.out.println("Nama depan : " + namaDepan);
    System.out.println("Nama belakang : " + namaBelakang);
    System.out.println("Usia : " + usia);
    System.out.println("Target kuliah : " + targetTahunKuliah + "tahun");
    System.out.println("IPK : " + ipk);
    System.out.println("Nilai PBO : " + nilaiAbjad);
    System.err.println("Tampan : " + tampan);
	
    JOptionPane.showMessageDialog(null,"Hai," + namaDepan + namaBelakang);
	 
	}
}