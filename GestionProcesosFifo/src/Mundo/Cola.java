/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mundo;

/**
 *
 * @author TOSHIBA
 */

public class Cola {

    class Nodo {

        int rafaga;
        int nombre;
        int tLlegada;
        int tFinal;
        int tComienzo;
        int tRetorno;
        int tEspera;
        Nodo sig;

    }

    private Nodo raiz,fondo;
   

    public Cola() {      
        
        raiz=null;

        fondo=null;

    }
    public boolean vacia (){

        if (raiz == null)

            return true;

        else

            return false;

    }

    public void insertar (int info,int nombre, int tLlegada)

    {

        Nodo nuevo;

        nuevo = new Nodo ();

        nuevo.rafaga = info;
        
        nuevo.nombre = nombre;
        
        nuevo.tLlegada = tLlegada;

        nuevo.sig = null;

        if (vacia ()) {

            raiz = nuevo;

            fondo = nuevo;

        } else {

            fondo.sig = nuevo;

            fondo = nuevo;

        }

    }

    public int getNumProc() {

        Nodo reco=fondo;      
        return reco.nombre;
    }
    public int getRafaga() {

        Nodo reco=fondo;      
        return reco.rafaga;
    }
    public int getTLlegada() {
        Nodo reco=fondo;      
        return reco.tLlegada;
    }
    public int getTFinal(){
        Nodo reco=fondo;          
        reco.tFinal=reco.rafaga+reco.tComienzo;
        return reco.tFinal;
    }
    
    public void setTComienzo(int tiempo){
        Nodo reco=fondo;
        reco.tComienzo=tiempo;
    }
    
    public int getTRetorno(){
        Nodo reco=fondo;          
        reco.tRetorno=reco.tFinal-reco.tLlegada;
        return reco.tRetorno;
    }
    public int getTEspera(){
        Nodo reco=fondo;          
        reco.tEspera=reco.tRetorno-reco.rafaga;
        return reco.tEspera;
    }
    
    
    

}
