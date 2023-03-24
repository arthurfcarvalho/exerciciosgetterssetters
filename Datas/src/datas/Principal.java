/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package datas;


public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Data id001 = new Data();
        
        id001.setDia(31);
        id001.setMes(12);
        id001.setAno(2020);
        
        System.out.println(id001.mostrarData());
        id001.proximoDia();
        System.out.println("**************************");
        
        Data id002 = new Data();
        
        id002.setDia(21);
        id002.setMes(01);
        id002.setAno(2000);
        
        System.out.println(id002.mostrarData());
        id002.proximoDia();
        System.out.println("**************************");
        
        Data id003 = new Data();
        
        id003.setDia(29);
        id003.setMes(01);
        id003.setAno(2003);
        
        System.out.println(id003.mostrarData());
        id003.proximoDia();
        System.out.println("**************************");
        
    }
    
}
