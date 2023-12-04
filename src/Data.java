/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ROBERTO
 */
public class Data <T> {
    //Ejemplo de una clase que usa vaores genericos
    private T valor;

    //construtor
        public Data(T v){
        this.valor = v;
    }

    public T getValor() {
        return valor;
    }

    public void setValor(T valor) {
        this.valor = valor;
    }
    
    
    
    
    
}

