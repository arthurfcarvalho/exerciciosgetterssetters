/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package fatura;


public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Fatura id001 = new Fatura();
        
        id001.setNumeroItem(154);
        id001.setDescricao("Bola");
        id001.setQuantidadeComprada(2);
        id001.setValorUnitario(30);
        
        System.out.println(id001.getDescricao());
        System.out.println("Quantidade: " + id001.getQuantidadeComprada());
        System.out.println("Valor Unitario: R$" + id001.getValorUnitario());
        System.out.println("Valor total: R$" + id001.valorFatura());
        System.out.println("");
        System.out.println("***************************");
        System.out.println("");
        
        Fatura id002 = new Fatura();
        
        id002.setNumeroItem(4567);
        id002.setDescricao("Bala");
        id002.setQuantidadeComprada(15);
        id002.setValorUnitario(0.25);
        
        System.out.println(id002.getDescricao());
        System.out.println("Quantidade: " + id002.getQuantidadeComprada());
        System.out.println("Valor Unitario: R$" + id002.getValorUnitario());
        System.out.println("Valor total: R$" + id002.valorFatura());
        System.out.println("");
        System.out.println("***************************");
        System.out.println("");
        
        Fatura id003 = new Fatura();
        
        id003.setNumeroItem(111);
        id003.setDescricao("Monster");
        id003.setQuantidadeComprada(2);
        id003.setValorUnitario(5.99);
        
        System.out.println(id003.getDescricao());
        System.out.println("Quantidade: " + id003.getQuantidadeComprada());
        System.out.println("Valor Unitario: R$" + id003.getValorUnitario());
        System.out.println("Valor total: R$" + id003.valorFatura());
    
        
    }   
}
