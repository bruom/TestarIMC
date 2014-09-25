/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package calculoimc;

import org.junit.Assert;
import org.junit.Test;

/**
 *
 * @author 31319769
 */
public class PessoaTest {
    
    public PessoaTest() {
    }

    Pessoa juvi = new Pessoa(2.0, 30.0, 0);
    
    @Test
    public void testCalculaIMC() {
        Assert.assertEquals(20.7, juvi.calculaIMC(), 0.1);
    }

    @Test
    public void testExibeResultado() {
        Assert.assertTrue(juvi.exibeResultado(juvi.calculaIMC()).startsWith("ERRO"));
    }

    
}