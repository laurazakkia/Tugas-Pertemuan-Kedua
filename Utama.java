/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pertemuankedua;

/**
 *
 * @author Laura
 */
public class Utama {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    
        Motor beat = new Motor();
        System.out.println("Aku adalah motor " +beat.getNama() + " bertipe " +beat.getTipe() + " dengan kapasitas " +beat.getKapasitas() + " orang" + " dan aku diproduksi pada tahun " +beat.getTahunProduksi());
        beat.start();
        beat.stop();
        System.out.println("");
        
        Mobil avanza = new Mobil();
        System.out.println("Aku adalah mobil " +avanza.getNama() + " berwarna " +avanza.getWarna());
        System.out.println("");
        
        Transportasi sepedaBagus = (Transportasi) beat;
        System.out.println("Aku adalah sepeda bagus dengan kapasitas " +sepedaBagus.getKapasitas() + " orang" +beat);   
    }
}
