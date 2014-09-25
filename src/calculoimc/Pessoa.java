/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package calculoimc;

/**
 *
 * @author 31319769
 */
public class Pessoa {
    
    private double alt;
    private double peso;
    private int sexo; //0-Masculino 1-Feminino
    private double imc;
    
    public Pessoa(double alt, double peso, int sexo) {
        this.alt = alt;
        this.peso = peso;
        this.sexo = sexo;
    }
    
    public double calculaIMC(){
        double imc;
        imc = this.peso/(this.alt*this.alt);
        return imc;
    }
    
    public String exibeResultado(double imc){
        if(sexo==1){//se for mulher
            if(imc<15.0)
                return "ERRO: Valor de IMC fora da tabela.";
            else if(imc<17.9)
                return "RISCO BAIXO: Você está abaixo do peso recomendado.";
            else if(imc<24.4)
                return "IDEAL: Você está muito bem! Continue assim!";
            else if(imc<27.2)
                return "RISCO MODERADO: Você está acima do peso recomendado. Cuidado!";
            else
                return "RISCO ELEVADO: Você está Obeso. Procure o acompanhamento de um nutricionista e realizar mais atividades físicas!";
        }
        
        else if(sexo==0){//se for homem
            if(imc<17.9)
                return "ERRO: Valor de IMC fora da tabela.";
            else if(imc<18.9)                       
                return "RISCO BAIXO: Você está abaixo do peso recomendado.";
            else if(imc<24.9)
                return "IDEAL: Você está muito bem! Continue assim!";
            else if(imc<27.7)
                return "RISCO MODERADO: Você está acima do peso recomendado. Cuidado!";
            else
                return "RISCO ELEVADO: Você está Obeso. Procure o acompanhamento de um nutricionista e realizar mais atividades físicas!";
   
        } 
        else
            return "ERRO: Valor de sexo inválido.";
                        
    }
    

    public double getAlt() {
        return alt;
    }

    public void setAlt(double alt) {
        this.alt = alt;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public int isSexo() {
        return sexo;
    }

    public void setSexo(int sexo) {
        this.sexo = sexo;
    }
    
    
    
}
