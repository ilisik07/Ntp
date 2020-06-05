/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ilisi
 */
/* ogretmen.java : Çocuk sınıf bildirimi */
public class ogretmen extends personel {
  public String brans;
  public int hizmet;

  /* Constructor metod */
  public ogretmen(String cadi, String csoyadi, int cyasi, String cbrans, int chizmet) {
    super(cadi, csoyadi, cyasi); 
    brans = cbrans;
    hizmet = chizmet;
  } 

  public String getogretmenBilgi() {
    return brans + " " + hizmet;
  }
 
  /* Üst sınıfta geçersiz hale getirilmiş metod */
  public void yazdirBilgi() {
    super.yazdirBilgi();
    System.out.println("Öğretmen: Branş - Hizmet yılı: " + getogretmenBilgi());
  }  
}
