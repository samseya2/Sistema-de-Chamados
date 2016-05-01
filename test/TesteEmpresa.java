/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import entidade.Empresa;
import junit.framework.Assert;
import org.junit.Test;
import org.junit.Before;

/**
 *
 * @author Windows 8.1
 */
public class TesteEmpresa {
    
    private Empresa em;
    
    @Before
    public void criandoEmpresa() {
        em = new Empresa(1234, "Mackenzie");
    }
    
    public TesteEmpresa() {
    }
    
    
    @Test
    public void getContratoTest(){
        Assert.assertEquals(1234, em.getNumeroContrato());
    }
}
