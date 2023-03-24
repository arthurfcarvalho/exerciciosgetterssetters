/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package datas;


public class Data {

    private int dia;
    private int mes;
    private int ano;

    public void setDia(int dia) {
        this.dia = dia < 01 || dia > 31 ? 0 : dia;
    }

    public void setMes(int mes) {
        this.mes = mes < 1 || mes > 12 ? 0 : mes;
    }

    public void setAno(int ano) {
        this.ano = ano < 2000 || ano > 2025 ? 0 : ano;
    }

    public String mostrarData() {
        return dia + "/" + mes + "/" + ano;
    }

    public void proximoDia() {
        
        if (dia == 31 ||(mes == 02 && dia == 28)) {
            
            dia = 01;
            mes++;
            if(mes >= 12){
                mes = 1;
                ano++;
            }
            
            System.out.println("Proximo dia:");
            System.out.println(dia + "/" + mes + "/" + ano);
            
        } 
        else {
            
            dia++;
            System.out.println("Proximo dia:");
            System.out.println(dia + "/" + mes + "/" + ano);
        }
    }
}
