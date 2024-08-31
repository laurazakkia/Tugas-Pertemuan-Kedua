/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuankedua;

/**
 *
 * @author Laura
 */
public class Transportasi {

    private int kapasitas;
    private String nama;
    
    public Transportasi(){
        System.out.println("Halo aku conss Transportasi");
    }
    
    /**
     * @return the nama
     */
    public String getNama() {
        return nama;
    }
    
    /**
     * @param nama the nama to set
     */
    public void setNama(String nama) {
        this.nama = nama;
    }
    
    /**
     * @return the kapasitas
     */
    public int getKapasitas() {
        return kapasitas;
    }
    
    /**
     * @param kapasitas the kapasitas to set
     */
    public void setKapasitas(int kapasitas) {
        this.kapasitas = kapasitas;
    }
}
