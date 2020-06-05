/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ilisi
 */
/* javaprog.java */
public class javaprog {
  public static void main(String args[]){
    /* Her sınıfa  ait 3 farklı değişken bildirimi */
    personel personel01 = new personel("Mustafa", "İLİŞİK", 24);
    ogretmen ogretmen01 = new ogretmen("Gökhan", "Turan", 35, "Bilgisayar", 12);
    ogrenci ogrenci01 = new ogrenci("Ali", "Serhat", 16, "Sayısal", "9-A", 113);

    personel01.yazdirBilgi(); /* personel sınıfı fonksiyonu çağrılır */
    ogretmen01.yazdirBilgi(); /* ogretmen sınıfı fonksiyonu çağrılır */
    ogrenci01.yazdirBilgi();  /* ogrenci sınıfı fonksiyonu çağrılır */
  }
}
