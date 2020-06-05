/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ilisi
 */
/* personel.java : Ana sınıf bildirimi */
public class personel {
  public String adi;    /* Sınıf dışından erişilebilen public değişken  */
  public String soyadi; /* Sınıf dışından erişilebilen public değişken  */
  private int yasi;     /* Sadece sınıf içinden erişilebilen private değişken  */

  /* Constructor metod */
  public personel(String cadi, String csoyadi, int cyasi) {
    adi = cadi;
    soyadi = csoyadi;
    yasi = cyasi;
  } 

  /* Sınıf dışından erişilebilen public metod */
  public String getBilgi() {
    return adi + " " + soyadi;
  }
 
  /* Sınıf dışından erişilebilen public metod */
  public int getPrivBilgi() {
    return yasi;
  }
  
  /* Sınıf dışından erişilebilen public metod */
  public void yazdirBilgi() {
    System.out.println("Okulumuz personeli: " + getBilgi() + " " + getPrivBilgi());
  }  
}
