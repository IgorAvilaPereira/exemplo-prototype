/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package negocio;

import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author iapereira
 */
public class RegistryOvelha {

    public static final RegistryOvelha INSTANCE = new RegistryOvelha();
    private Map<String, Ovelha> prototipos;

    private RegistryOvelha() {
        this.prototipos = new HashMap();
        Ovelha dolly = new Ovelha();
        dolly.setNome("Dolly");
        dolly.setIdade(32);
        dolly.setNomeDono("Igor");
        dolly.setRaca("à toa");
        this.prototipos.put("dolly", dolly);

        Ovelha zeze;
        try {
            zeze = dolly.clone();

            zeze.setNome("Zezé");
            this.prototipos.put("zeze", zeze);
        } catch (CloneNotSupportedException ex) {
            Logger.getLogger(RegistryOvelha.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static synchronized RegistryOvelha getInstance(){
        return INSTANCE;
    }

    public Ovelha criar(String nomeOvelha) throws CloneNotSupportedException {
        return this.prototipos.get(nomeOvelha).clone();
    }

}
