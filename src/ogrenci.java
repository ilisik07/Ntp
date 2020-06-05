/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ilisi
 */
/* ogrenci.java : Çocuk sınıf bildirimi */
public class ogrenci extends personel {
  public String bolum;
  public String sinif;
  public int okulno;

  /* Constructor metod */
  public ogrenci(String cadi, String csoyadi, int cyasi, String cbolum, String csinif, int cokulno) {
    super(cadi, csoyadi, cyasi); 
    bolum = cbolum;
    sinif = csinif;
    okulno = cokulno;
  } 

  public String getogrenciBilgi() {
    return bolum + " " + sinif + " " + okulno;
  }
 
  /* Üst sınıfta geçersiz hale getirilmiş metod */
  public void yazdirBilgi() {
    super.yazdirBilgi();
    System.out.println("Öğrenci: Bölüm - Sınıf - No.: " + getogrenciBilgi());
  }  
}
