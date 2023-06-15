/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package apresentacao;

import negocio.Ovelha;

/**
 *
 * @author iapereira
 */
public class Main {

    public static void main(String[] args) {
        Ovelha dolly = new Ovelha();
        dolly.setNome("Dolly");
        dolly.setIdade(32);
        dolly.setNomeDono("Igor");
        dolly.setRaca("à toa");
        
        System.out.println(dolly);
        
        
//        Ovelha zeze = new Ovelha();
//        zeze.setNome("Zezé");
//        zeze.setIdade(32);
//        zeze.setNomeDono("Igor");
//        zeze.setRaca("à toa");
//        
        Ovelha zeze = dolly.clonagem();
        zeze.setNome("Zezé");
        System.out.println(zeze);
    }
}
