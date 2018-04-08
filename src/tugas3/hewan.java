package tugas3;

public class hewan {
    private String nama;
    private String golongan;
    private String aktivitas;

    void cetak(){
        System.out.println("Nama Hewan \t: "+nama+"\n"+
                           "Golongan \t: "+golongan+"\n"+
                           "Aktivitas \t: "+aktivitas);
    }

    public String getnama() {
        return nama;
    }

    public void setnama(String nama) {
        this.nama = nama;
    }

    public String getgolongan() {
        return golongan;
    }

    public void setgolongan(String golongan) {
        this.golongan = golongan;
    }

    public String getaktivitas() {
        return aktivitas;
    }

    public void setaktivitas(String aktivitas) {
        this.aktivitas = aktivitas;
    }
    
    
}


