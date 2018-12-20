/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fecha;

/**
 *
 * @author alumno
 */
public class usarFecha {
    
    public static void main(String[] args) {
        
        
        Fecha f1 = new Fecha(13, 5, 1984);
        Fecha f2 = new Fecha(f1);
        Fecha f3 = new Fecha();
        
        f1.sumarDia(25);
        f1.sumaMes(11);
        f3.setDia(15);
        f3.setMes(12);
        f3.setAnio(1942);
        
        System.out.println(f1.fechaCorrecta());
        System.out.println(f1.esBisiesto());
        
        System.out.println(f1);
        System.out.println(f2);
        System.out.println(f3);
        
       
        
        
        
        
        
    }
    
}
