/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fecha;

import java.util.Calendar;


public class Fecha {
    
    private int dia;
    private int mes;
    private int anio;
    
    
    public Fecha( int d, int m, int a){
        this.anio=a;
        this.mes=m;
        this.dia=d;
    }
    
    public Fecha(final Fecha f){
        this(f.dia,f.mes,f.anio);
        
    }
    
    public Fecha(){
        
        Calendar fechaHoy = Calendar.getInstance();
        
        this.dia =(fechaHoy.get(Calendar.DAY_OF_MONTH));
        this.mes =(fechaHoy.get(Calendar.MONTH));
        this.anio =(fechaHoy.get(Calendar.YEAR));
        
    }
    
    public boolean esBisiesto(){
        boolean bisiest;
        if ((anio % 4 == 0) && ((anio % 100 != 0) || (anio % 400 == 0))){
            
	System.out.println("El año es bisiesto");
        bisiest = true;
        }
        else{
	System.out.println("El año no es bisiesto");
        bisiest = false;
        
        }
        return bisiest;
    }
    
    public void setDia(int d){
        dia = d;
    }
    
    public void setMes(int m){
        mes = m;
    }
    
    public void setAnio(int a){
        anio = a;
    }
    
    public int getDia(){
        return dia;
    }
    
    public int getMes(){
        return mes;
    }
    
    public int getAño(){
        return anio;
    }
    
   /*public void asignarFecha(int d, int m, int a){
        
    }*/
    
    public final boolean fechaCorrecta(){
        
        boolean correcto=false;
        if(mes!=2 && mes>=1 && mes<=12){
            if(mes==1 || mes==3 || mes==5 || mes==7 || mes==8 || mes==10 || mes==12){
                if(dia>=1 && dia<=31){
                    correcto=true;
                }
                else{
                    if(mes==4 || mes==6 || mes==9 || mes==11){
                        if(dia>=1 && dia<=30){
                            correcto=true;
                    }
                }
            }
            }
        }else{
                if(dia>=1 &&  dia<=28){
                    correcto=true;
                }
            }
        return correcto;
    }
    
    public void sumarDia(int d){
        if (dia>30){
           int cociente=dia/30;
            mes=mes+cociente;
            dia=dia%30;
        }
        
    }
    
    public void sumaMes(int m){
        if(mes>12){
            int cociente2=mes/12;
            anio=anio+cociente2;
            mes=mes%12;
        }
    }
    
    public void sumaAnio(int a){
        anio=this.anio+a;
    }
    
    
    public int cuantosDias (Fecha f){
        //devuelve cuantos dias hay entre this. y f
        
    }
    
    public static int cuantosDias2(Fecha f1, Fecha f2){
        
    }
    s
    public int cuantosMeses(Fecha f){
        
    }
    
    public boolean equals(Fecha f){
        
    }
    
    public int compareTo(Fecha f){
        
    }
    
    public static int compareTo2(Fecha f1, Fecha f2){
        
    }
    
    
    
    
    
    
    
    
    @Override
    public String toString(){
        return "Fecha: " +dia+ " / " +mes+ " / "+ anio; 
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
