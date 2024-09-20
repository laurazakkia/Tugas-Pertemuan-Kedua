# 📚 Konsep Pemrograman Berbasis Obyek - Pertemuan Kedua
##  Daftar Isi :
- [ Constructor](#constructor)
- [ Interface](#interface)
- [ This](#this)
- [ Super](#super)
- [ Casting](#casting)
---

## Constructor
Constructor adalah method khusus yang digunakan untuk menginisialisasi objek saat dibuat. Nama Constructor harus sama dengan nama kelas dan tidak memiliki tipe pengembalian. 

### Source Code Penerapan Constructor
<pre>
  public class Motor extends Transportasi implements Berhenti, Berjalan{
    public Motor(){
        System.out.println("Halo aku conss motor");
    } 
</pre>
- Public Motor() adalah constructor untuk kelas Motor. Constructor akan dipanggil secara otomatis ketika membuat objek dari kelas Motor. Ini memberikan indikasi bahwa objek telah berhasil dibuat.
---

## Interface
Interface adalah class yang hanya mengandung deklarasi method tanpa memiliki implementasi.

### Source Code Kelas Interface
<pre>
  public interface Berjalan {
    public void start();
}
</pre>
Berikut adalah cara mengimplementasikan interface tersebut :
<pre>
public class Motor extends Transportasi implements Berjalan{
    @Override
    public void start(){
        System.out.println("Motor mulai dinyalakan");
    }
</pre>
- Kelas Motor mengimplementasikan interface Berjalan. Kelas Motor ini menyediakan implementasi untuk metode yang dideklarasikan dalam interface Berjalan.

---

## This
This adalah keyword yang merujuk pada instance objek saat ini. 

### Source Code Penerapan This
<pre>
  public void BahanBakar(){
        System.out.println("Pertalite");
    }
    public void MacamBensin(){
        this.BahanBakar();}
</pre>
- public void MacamBensin() adalah metode yang memanggil metode BahanBakar() menggunakan this.BahanBakar();. Keyword this digunakan untuk memanggil metode BahanBakar() dari objek saat ini.
  
---

## Super
Super adalah keyword yang digunakan untuk merujuk ke class induk (parent class) dari suatu kelas.

### Source Code Super
Ini adalah source code kelas induk yang akan dijadikan super pada kelas turunan
<pre>
  public void BahanBakar(){
        System.out.println("Bensin");
    }
</pre>
Ini adalah source code untuk menggunakan super
<pre>
  public void MacamBensin(){
        super.BahanBakar();
    }
</pre>
- super.BahanBakar(); digunakan untuk memanggil metode BahanBakar() dari kelas induk. Kelas Motor adalah subclass dari kelas Transportasi yang memiliki metode BahanBakar(), pernyataan ini akan memanggil metode tersebut dari kelas Transportasi.

---

## Casting
Casting adalah proses mengubah tipe data suatu objek menjadi tipe data lain.

### Source Code Casting
<pre>
   Transportasi sepedaBagus = (Transportasi) beat;
        System.out.println("Aku adalah sepeda bagus dengan kapasitas " +sepedaBagus.getKapasitas() + " orang");   
</pre>
- Casting dari objek beat ke tipe Transportasi. Ini berarti menganggap bahwa beat adalah objek yang bisa diperlakukan sebagai Transportasi. Casting ini dilakukan karena beat adalah objek dari kelas yang merupakan turunan dari Transportasi, yaitu kelas Motor.

---
