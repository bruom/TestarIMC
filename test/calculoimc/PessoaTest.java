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

//    @Test
//    public void testCalculaIMC() {
//        Assert.assertEquals(20.7, juvi.calculaIMC(), 0.1);
//    }
    @Test
    public void testExibeResultado() {
        Assert.assertTrue(juvi.exibeResultado(juvi.calculaIMC()).startsWith("ERRO"));
    }

//    @Test
//    public void testEquivalencia1(){
//        Pessoa teste = new Pessoa(-1, 65, 1);
//        Assert.assertTrue(teste.exibeResultado(teste.calculaIMC()).startsWith("ERRO"));
//    }
//    
//    @Test
//    public void testEquivalencia2(){
//        Pessoa teste = new Pessoa();
//        Assert.assertTrue(teste.exibeResultado(teste.calculaIMC()).startsWith("ERRO"));
//    }
    @Test
    public void testEquivalencia3() {
        Pessoa teste = new Pessoa(2, 65, 1);
        Assert.assertEquals(16.25, teste.calculaIMC(), 0.1);
    }

//    @Test
//    public void testEquivalencia4(){
//        Pessoa teste = new Pessoa();
//        Assert.assertTrue(teste.exibeResultado(teste.calculaIMC()).startsWith("ERRO"));
//    }
//    
//    @Test
//    public void testEquivalencia5(){
//        Pessoa teste = new Pessoa();
//        Assert.assertTrue(teste.exibeResultado(teste.calculaIMC()).startsWith("ERRO"));
//    }
//    
    @Test
    public void testEquivalencia6() {
        Pessoa teste = new Pessoa(1.5, 50, 0);
        Assert.assertEquals(22.22, teste.calculaIMC(), 0.1);
    }
//    
//    @Test
//    public void testEquivalencia7(){
//        Pessoa teste = new Pessoa();
//        Assert.assertTrue(teste.exibeResultado(teste.calculaIMC()).startsWith("ERRO"));
//    }
//    

    @Test
    public void testEquivalencia8() {
        Pessoa teste = new Pessoa(1.5, 50, 0);
        Assert.assertEquals(22.22, teste.calculaIMC(), 0.1);
    }

    @Test
    public void testEquivalencia9() {
        Pessoa teste = new Pessoa(1.5, 50, 1);
        Assert.assertEquals(22.22, teste.calculaIMC(), 0.1);
    }

    @Test
    public void testEquivalencia10() {
        Pessoa teste = new Pessoa(1.7, 70, 0);
        Assert.assertTrue(teste.exibeResultado(teste.calculaIMC()).startsWith("IDEAL"));
    }

    @Test
    public void testEquivalencia11() {
        Pessoa teste = new Pessoa(2.5, 30, 0);
        Assert.assertTrue(teste.exibeResultado(teste.calculaIMC()).startsWith("ERRO IMC BAIXO"));
    }

    @Test
    public void testEquivalencia12() {
        Pessoa teste = new Pessoa(1.7, 70, 0);
        Assert.assertTrue(teste.exibeResultado(teste.calculaIMC()).startsWith("IDEAL"));
    }

    @Test
    public void testEquivalencia13() {
        Pessoa teste = new Pessoa(2.5, 30, 1);
        Assert.assertTrue(teste.exibeResultado(teste.calculaIMC()).startsWith("ERRO IMC BAIXO"));
    }

    @Test
    public void testLimite1() {
        Pessoa teste = new Pessoa(2, 71.2, 0);
        Assert.assertEquals(17.8, teste.calculaIMC(), 0.05);
        Assert.assertTrue(teste.exibeResultado(teste.calculaIMC()).startsWith("ERRO IMC BAIXO"));
    }

    @Test
    public void testLimite2() {
        Pessoa teste = new Pessoa(2, 71.7, 0);
        Assert.assertEquals(17.9, teste.calculaIMC(), 0.05);
        Assert.assertTrue(teste.exibeResultado(teste.calculaIMC()).startsWith("RISCO BAIXO"));
    }

    @Test
    public void testLimite3() {
        Pessoa teste = new Pessoa(2, 75.5, 0);
        Assert.assertEquals(18.9, teste.calculaIMC(), 0.05);
        Assert.assertTrue(teste.exibeResultado(teste.calculaIMC()).startsWith("RISCO BAIXO"));
    }

    @Test
    public void testLimite4() {
        Pessoa teste = new Pessoa(2, 76, 0);
        Assert.assertEquals(19, teste.calculaIMC(), 0.05);
        Assert.assertTrue(teste.exibeResultado(teste.calculaIMC()).startsWith("IDEAL"));
    }

    @Test
    public void testLimite5() {
        Pessoa teste = new Pessoa(2, 99.5, 0);
        Assert.assertEquals(24.9, teste.calculaIMC(), 0.05);
        Assert.assertTrue(teste.exibeResultado(teste.calculaIMC()).startsWith("IDEAL"));
    }

    @Test
    public void testLimite6() {
        Pessoa teste = new Pessoa(2, 100, 0);
        Assert.assertEquals(25, teste.calculaIMC(), 0.05);
        Assert.assertTrue(teste.exibeResultado(teste.calculaIMC()).startsWith("RISCO MODERADO"));
    }

    @Test
    public void testLimite7() {
        Pessoa teste = new Pessoa(2, 110.75, 0);
        Assert.assertEquals(27.7, teste.calculaIMC(), 0.05);
        Assert.assertTrue(teste.exibeResultado(teste.calculaIMC()).startsWith("RISCO MODERADO"));
    }

    @Test
    public void testLimite8() {
        Pessoa teste = new Pessoa(2, 111.15, 0);
        Assert.assertEquals(27.8, teste.calculaIMC(), 0.05);
        Assert.assertTrue(teste.exibeResultado(teste.calculaIMC()).startsWith("RISCO ELEVADO"));
    }

    @Test
    public void testLimite9() {
        Pessoa teste = new Pessoa(2, 59.75, 1);
        Assert.assertEquals(14.9, teste.calculaIMC(), 0.05);
        Assert.assertTrue(teste.exibeResultado(teste.calculaIMC()).startsWith("ERRO IMC BAIXO"));
    }

    @Test
    public void testLimite10() {
        Pessoa teste = new Pessoa(2, 60, 1);
        Assert.assertEquals(15, teste.calculaIMC(), 0.05);
        Assert.assertTrue(teste.exibeResultado(teste.calculaIMC()).startsWith("RISCO BAIXO"));
    }

    @Test
    public void testLimite11() {
        Pessoa teste = new Pessoa(2, 71.5, 1);
        Assert.assertEquals(17.9, teste.calculaIMC(), 0.05);
        Assert.assertTrue(teste.exibeResultado(teste.calculaIMC()).startsWith("RISCO BAIXO"));
    }

    @Test
    public void testLimite12() {
        Pessoa teste = new Pessoa(2, 72, 1);
        Assert.assertEquals(18, teste.calculaIMC(), 0.05);
        Assert.assertTrue(teste.exibeResultado(teste.calculaIMC()).startsWith("IDEAL"));
    }

    @Test
    public void testLimite13() {
        Pessoa teste = new Pessoa(2, 97.5, 1);
        Assert.assertEquals(24.4, teste.calculaIMC(), 0.05);
        Assert.assertTrue(teste.exibeResultado(teste.calculaIMC()).startsWith("IDEAL"));
    }

    @Test
    public void testLimite14() {
        Pessoa teste = new Pessoa(2, 98, 1);
        Assert.assertEquals(24.5, teste.calculaIMC(), 0.05);
        Assert.assertTrue(teste.exibeResultado(teste.calculaIMC()).startsWith("RISCO MODERADO"));
    }

    @Test
    public void testLimite15() {
        Pessoa teste = new Pessoa(2, 108.75, 1);
        Assert.assertEquals(27.2, teste.calculaIMC(), 0.05);
        Assert.assertTrue(teste.exibeResultado(teste.calculaIMC()).startsWith("RISCO MODERADO"));
    }

    @Test
    public void testLimite16() {
        Pessoa teste = new Pessoa(2, 109.25, 1);
        Assert.assertEquals(27.3, teste.calculaIMC(), 0.05);
        Assert.assertTrue(teste.exibeResultado(teste.calculaIMC()).startsWith("RISCO ELEVADO"));
    }
}