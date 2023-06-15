/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package apresentacao;

import negocio.Ovelha;
import negocio.RegistryOvelha;

/**
 *
 * @author iapereira
 */
public class Main {

    public static void main(String[] args) throws CloneNotSupportedException {
        Ovelha filhaDolly = RegistryOvelha.getInstance().criar("dolly");
        filhaDolly.setNome("filha da dolly");
        System.out.println(filhaDolly);
        
         Ovelha filhaDolly2 = RegistryOvelha.getInstance().criar("dolly");
        filhaDolly2.setNome("filha2 da dolly");
        System.out.println(filhaDolly2);
        
        
        Ovelha doLucas = new Ovelha();
        doLucas.setNome("ovelha do lucas");
        doLucas.setNomeDono("Lucas");
        
        
        RegistryOvelha.getInstance().adicionaPrototipo("doLucas", doLucas);
        
        Ovelha doLucas2 = RegistryOvelha.getInstance().criar("doLucas");
        doLucas2.setNome("ovelha do lucas 2");
        System.out.println(doLucas2);
        
//        System.out.println(filhaDolly.hashCode());
//        
//        System.out.println(filhaDolly2.hashCode());
//        
//        System.out.println(RegistryOvelha.getInstance().hashCode());
//        
//        System.out.println(RegistryOvelha.getInstance().hashCode());
//        
//        System.out.println(RegistryOvelha.getInstance().hashCode());
//        
//        System.out.println(RegistryOvelha.getInstance().hashCode());
//        
//        System.out.println(RegistryOvelha.getInstance().hashCode());

//        Ovelha zeze = new Ovelha();
//        zeze.setNome("Zezé");
//        zeze.setIdade(32);
//        zeze.setNomeDono("Igor");
//        zeze.setRaca("à toa");
    }
}
