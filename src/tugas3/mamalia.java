package tugas3;

public class mamalia extends hewan{
    private String biak;
    private Integer kaki;
    private String panjat;
    private String lari;
    
    void ciri(){
        System.out.println("Beranak");
        System.out.println("4");
        System.out.println("Bisa");
        System.out.println("Bisa");
    }

    public String getbiak() {
        return biak;
    }

    public void setbiak(String biak) {
        this.biak = biak;
    }

    public Integer getkaki() {
        return kaki;
    }

    public void setkaki(Integer kaki) {
        this.kaki = kaki;
    }

    public String getpanjat() {
        return panjat;
    }

    public void setpanjat(String panjat) {
        this.panjat = panjat;
    }

    public String getlari() {
        return lari;
    }

    public void setlari(String lari) {
        this.lari = lari;
    }
    
    
}
