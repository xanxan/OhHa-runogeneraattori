/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sovelluslogiikka;

import java.util.Random;

/**
 * Luokka arpoo satunnaisen luvun.
 * 
 *
 * @author anna
 */
public class Arpoja {
    private int luku = 0;
    private Random arpoja;
    
    public Arpoja() {
        arpoja = new Random();
    }
    /**
     * Metodi arpoo satunnaisen luvun nollan ja annetun ylärajan väliltä sekä
     * palauttaa sen.
     * 
     * @param ylaraja Korkein arvottavissa oleva luku.
     * @return luku Palauttaa satunnaisesti arvotun luvun.
     * 
     */
    public int SatunnainenLuku(int ylaraja) {
        
        luku = arpoja.nextInt(ylaraja);
        
        return luku;
    }
}