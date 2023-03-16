/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Kioscos;

import java.util.ArrayList;

/**
 *
 * @author rodri
 */
public class GKioscos {
    ArrayList <DKioscos> NKiosco;

    public GKioscos() {
        this.NKiosco = new ArrayList<> ();
    }
    
    public void GuardarK(String ckiosco, String nkiosco, String nregion){
    DKioscos save = new DKioscos (ckiosco,nkiosco,nregion);
   NKiosco.add(save);
    }
}
