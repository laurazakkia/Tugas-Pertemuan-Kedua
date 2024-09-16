# **CASTING**
Casting adalah proses mengubah tipe data dari satu jenis ke tipe data lainnya. Hal ini sering diperlukan saat kita bekerja dengan tipe data yang berbeda, seperti saat menggunakan variabel, metode, atau saat melakukan operasi matematika.

## Source Code Casting
<pre>
   Transportasi sepedaBagus = (Transportasi) beat;
        System.out.println("Aku adalah sepeda bagus dengan kapasitas " +sepedaBagus.getKapasitas() + " orang");   
</pre>
Disini kita melakukan casting jenis downcasting, di mana terdapat proses mengubah objek dari kelas turunan ke kelas induk. Pada kode ini, kita melakukan casting dari objek beat ke tipe Transportasi. Ini berarti kita menganggap bahwa beat adalah objek yang bisa diperlakukan sebagai Transportasi. Casting ini dilakukan karena beat adalah objek dari kelas yang merupakan turunan dari Transportasi, yaitu kelas Motor.

# **CONSTURCTOR**
Constructor adalah metode khusus dalam Java yang digunakan untuk menginisialisasi objek saat dibuat. Constructor memiliki nama yang sama dengan nama kelas dan tidak memiliki tipe pengembalian. Constructor sangat penting dalam pemrograman berorientasi objek karena memungkinkan kita untuk menetapkan nilai awal untuk atribut objek.

## Source Code Constructor
<pre>
  public class Motor extends Transportasi implements Berhenti, Berjalan{
    private int tahunProduksi;
    private String tipe;
   
    public Motor(){
        System.out.println("Halo aku conss motor");
    } 
</pre>
Public Motor() adalah constructor default untuk kelas ini. Constructor ini akan dipanggil secara otomatis ketika kita membuat objek dari kelas Motor. Ketika objek dibuat, constructor ini mencetak pesan "Halo aku conss motor" ke konsol. Ini memberikan indikasi bahwa objek telah berhasil dibuat.

# **THIS**
Keyword this dalam Java digunakan untuk merujuk pada objek saat ini. Ini sangat berguna dalam konteks kelas dan metode untuk membedakan antara variabel instance (atribut kelas) dan parameter metode atau constructor yang memiliki nama yang sama. This membantu meningkatkan keterbacaan kode dan menghindari kebingungan.

## Source Code This
<pre>
  public void BahanBakar(){
        System.out.println("Pertalite");
    }
    
    public void MacamBensin(){
        this.BahanBakar();}
</pre>
- public void BahanBakat() adalah metode yang mencetak pesan "Pertalite" ke utama saat dipanggil. Metode ini tidak menerima parameter dan tidak mengembalikan nilai.
- public void MacamBensin() adalah metode yang memanggil metode BahanBakar() menggunakan this.BahanBakar();. Keyword this digunakan di sini untuk menunjukkan bahwa kita ingin memanggil metode BahanBakar() dari objek saat ini. Dalam konteks ini, meskipun tidak wajib, penggunaan this membantu memperjelas bahwa kita memanggil metode dari objek yang sama.

# **SUPER**
Keyword super dalam Java digunakan untuk merujuk pada kelas induk (superclass) dari suatu kelas. Ini berguna dalam berbagai situasi, terutama ketika kita ingin mengakses anggota (atribut atau metode) dari kelas induk yang mungkin terhalang oleh anggota dengan nama yang sama di kelas turunan (subclass).

## Source Code Super
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
super.BahanBakar(); adalah pernyataan yang digunakan untuk memanggil metode BahanBakar() dari kelas induk. Artinya, jika kelas Motor adalah subclass dari kelas Transportasi yang memiliki metode BahanBakar(), maka pernyataan ini akan memanggil metode tersebut dari kelas Transportasi. Oleh karena itu, jika keyword super di jalankan maka output yang keluar adalah "Bensin".

# **INTERFACE**
Sebuah class menggunakan keyword implement untuk mengimplementasikan suatu interface kedalam suatu class dan mengoverride metode yang di perlukan. Sedangkan Interface sendiri adalah class yang hanya mengandung deklarasi method tanpa memiliki implementasi.

## Source Code Interface
<pre>
  public interface Berjalan {
    public void start();
}
public interface Berhenti {
    public void stop();
}
</pre>
Berikut adalah cara mengimplementasikan interface tersebut :
<pre>
public class Motor extends Transportasi implements Berhenti, Berjalan{
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
</pre>

Kelas Motor mengimplementasikan dua interface yaitu Berjalan dan Berhenti. Ini berarti kelas Motor harus menyediakan implementasi untuk semua metode yang dideklarasikan dalam kedua interface tersebut. @Override menunjukkan bahwa metode ini mengoverride (mengganti) metode dari interface Berjalan dan Berhenti.
