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
        
        mamalia m = new mamalia();
        System.out.println("\n"+"*======== Mamalia ========*");
        m.setnama("Kucing");
        m.setgolongan("Karnivora");
        m.setaktivitas("Nokturnal");
        m.setbiak("Beranak");
        m.setkaki(4);
        m.setpanjat("Bisa");
        m.setlari("Bisa");
        m.cetak();
        System.out.println("Bekembang biak \t: "+m.getbiak());
        System.out.println("Jumlah kaki \t: "+m.getkaki());
        System.out.println("Memanjat \t: "+m.getpanjat());
        System.out.println("Berlari \t: "+m.getlari());
        m.suara();
        
        burung b = new burung();
        System.out.println("\n"+"*======== Burung ========*");
        b.setnama("Ayam");
        b.setgolongan("Omnivora");
        b.setaktivitas("Diurnal");
        b.setbiak("Bertelur");
        b.setkaki(2);
        b.setterbang("Kada bisa");
        b.setapung("Kada bisa");
        b.cetak();
        System.out.println("Bekembang biak \t: "+b.getbiak());
        System.out.println("Jumlah kaki \t: "+b.getkaki());
        System.out.println("Terbang \t: "+b.getterbang());
        System.out.println("Mengapung \t: "+b.getapung());
        b.suara();
        
        ikan i = new ikan();
        System.out.println("\n"+"*======== Ikan ========*");
        i.setnama("Ikan lele");
        i.setgolongan("Omnivora");
        i.setaktivitas("Nokturnal");
        i.setbiak("Bertelur");
        i.setsisik("Ada");
        i.setsirip("Ada");
        i.setkumis("Ada");
        i.setlendir("Ada");
        i.setrenang("Kawa");
        i.cetak();
        System.out.println("Bekembang biak \t: "+i.getbiak());
        System.out.println("Bersisik \t: "+i.getsisik());
        System.out.println("Bersirip \t: "+i.getsirip());
        System.out.println("Berkumis \t: "+i.getkumis());
        System.out.println("Berlendir \t: "+i.getlendir());
        System.out.println("Berenang \t: "+i.getrenang());
        i.suara();
    }
}
