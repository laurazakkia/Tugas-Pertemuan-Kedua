/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuankedua;

/**
 *
 * @author Laura
 */
public class Motor extends Transportasi implements iMotor{
    private int tahunProduksi;
    private String tipe;
    
    @Override
    public void start(){
        System.out.println("Motor mulai dinyalakan");
    }
    
    @Override
    public void stop(){
        System.out.println("Motor dimatikan");
    }
    
    public Motor(){
        System.out.println("Halo aku conss motor");
        this.setTahunProduksi(2018);
        this.setTipe("Sport");
        super.setNama("Beat");
        super.setKapasitas(2);
    }

    /**
     * @return the tahunProduksi
     */
    public int getTahunProduksi() {
        return tahunProduksi;
    }

    /**
     * @param tahunProduksi the tahunProduksi to set
     */
    public void setTahunProduksi(int tahunProduksi) {
        this.tahunProduksi = tahunProduksi;
    }

    /**
     * @return the tipe
     */
    public String getTipe() {
        return tipe;
    }

    /**
     * @param tipe the tipe to set
     */
    public void setTipe(String tipe) {
        this.tipe = tipe;
    }
}
