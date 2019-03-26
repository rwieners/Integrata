package de.integrata.hkw02.moebel;

import de.integrata.hkw02.global.Brennbar;

/**
 * Ein Sofa ist ein Brennbares M�belst�ck, es implemtiert 
 * daher das Interface global.Brennbar
 *
 * @version 1.3 krg 2.5.2004 (hkw02)
 */
public class Sofa extends Moebel implements Brennbar {

  public Sofa(String typ) {
    super(typ);
  }

  public int brennen() {
  	System.out.println(this.typ + " verbrennt");
    return 10;	//Alle Sofas brennen gut
  }

  protected void finalize() throws Throwable {
  	System.out.println("GC: " + this.typ + " aufger�umt.");
    super.finalize();
  }
}