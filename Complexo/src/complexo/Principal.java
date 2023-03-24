/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package complexo;


public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Complexo id001 = new Complexo();
        
        id001.setNumeroReal1(5);
        id001.setNumeroReal2(3.6);
        id001.setNumeroImaginario1(7);
        id001.setNumeroImaginario1(2);
        
        System.out.println(id001.somaComplexo());
        System.out.println("");
        System.out.println("***********************");
        System.out.println("");
        
        Complexo id002 = new Complexo();
        
        id002.setNumeroReal1(7);
        id002.setNumeroReal2(16);
        id002.setNumeroImaginario1(7);
        id002.setNumeroImaginario1(1);
        
        System.out.println(id002.somaComplexo());
        System.out.println("");
        System.out.println("***********************");
        System.out.println("");
        
        Complexo id003 = new Complexo();
        
        id003.setNumeroReal1(19);
        id003.setNumeroReal2(1);
        id003.setNumeroImaginario1(8);
        id003.setNumeroImaginario1(2.6);
        
        System.out.println(id003.somaComplexo());
        
        // TODO code application logic here
    }
    
}
