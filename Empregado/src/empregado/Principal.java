/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package empregado;


public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Empregado id001 = new Empregado();
        
        id001.setPrimeiroNome("Arthur");
        id001.setSobrenome("Carvalho");
        id001.setSalarioMensal(0);
        
        id001.mostrarInformacoes();
        id001.salarioAnual();
        id001.aumento(10);
        System.out.println("Apos aumento:");
        id001.mostrarInformacoes();
        
        System.out.println("*************************");
        System.out.println("");
        
        Empregado id002 = new Empregado();
        
        id002.setPrimeiroNome("Gabriel");
        id002.setSobrenome("Camargos");
        id002.setSalarioMensal(3000);
        
        id002.mostrarInformacoes();
        id002.salarioAnual();
        id002.aumento(10);
        System.out.println("Apos aumento:");
        id002.mostrarInformacoes();
    }
    
}
