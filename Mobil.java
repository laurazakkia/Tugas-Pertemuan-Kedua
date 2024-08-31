/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuankedua;

/**
 *
 * @author Laura
 */
public class Mobil extends Transportasi {
    private String merk;
    private String warna;
    
    public Mobil(){
        System.out.println("Halo aku conss mobil");
        this.setMerk("honda");
        this.setWarna("hitam");
        super.setNama("avanza");
        super.setKapasitas(4);
    }
    
    /**
     * @return the merk
     */
    public String getMerk() {
        return merk;
    }

    /**
     * @param merk the merk to set
     */
    public void setMerk(String merk) {
        this.merk = merk;
    }

    /**
     * @return the warna
     */
    public String getWarna() {
        return warna;
    }

    /**
     * @param warna the warna to set
     */
    public void setWarna(String warna) {
        this.warna = warna;
    }
}
