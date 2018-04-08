package tugas3;

public class aksi {
    public static void main(String[] args) {
        hewan h = new hewan();
        //menggunakan method set
        h.setnama("Kucing");
        h.setgolongan("Karnivora");
        h.setaktivitas("Nokturnal");
        
        h.cetak();
        
        //menggunakan method get
        System.out.print("Nama Hewan \t: ");
        System.out.println(h.getnama());
        System.out.print("Golongan \t: ");
        System.out.println(h.getgolongan());
        System.out.print("Aktivitas \t: ");
        System.out.println(h.getaktivitas());
    }
}
