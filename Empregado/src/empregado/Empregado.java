/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package empregado;


public class Empregado {
    
    private String primeiroNome;
    private String sobrenome;
    private double salarioMensal;

    public void setPrimeiroNome(String primeiroNome) {
        this.primeiroNome = primeiroNome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public void setSalarioMensal(double salarioMensal) {
        
        if(salarioMensal < 1332){
            this.salarioMensal = 1332.00;
        }
        else{
            this.salarioMensal = salarioMensal;
        }
    }
    
    public void mostrarInformacoes(){
        
        System.out.println(primeiroNome + " " + sobrenome + ": R$" + salarioMensal);
    }
    
    public void salarioAnual(){
        System.out.println( "Salario anual: " + (salarioMensal *12));
    }
    
    public double aumento(double total){
        return salarioMensal += salarioMensal * (total / 100);
    }

}
