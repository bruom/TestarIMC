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
    private boolean sexo; //0-Masculino 1-Feminino
    private double imc;
    
    public Pessoa(double alt, double peso, boolean sexo) {
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
        if(sexo=true){//se for mulher
            if(imc<17.9)
                return "RISCO BAIXO: Você está abaixo do peso recomendado.";
            else if(imc<24.4)
                return "IDEAL: Você está muito bem! Continue assim!";
            else if(imc<27.2)
                return "RISCO MODERADO: Você está acima do peso recomendado. Cuidado!";
            else
                return "RISCO ELEVADO: Você está Obeso. Procure o acompanhamento de um nutricionista e realizar mais atividades físicas!";
        }
        
        else{//se for homem
            if(imc<18.9)
                return "RISCO BAIXO: Você está abaixo do peso recomendado.";
            else if(imc<24.9)
                return "IDEAL: Você está muito bem! Continue assim!";
            else if(imc<27.7)
                return "RISCO MODERADO: Você está acima do peso recomendado. Cuidado!";
            else
                return "RISCO ELEVADO: Você está Obeso. Procure o acompanhamento de um nutricionista e realizar mais atividades físicas!";
   
        }      
                        
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

    public boolean isSexo() {
        return sexo;
    }

    public void setSexo(boolean sexo) {
        this.sexo = sexo;
    }
    
    
    
}
