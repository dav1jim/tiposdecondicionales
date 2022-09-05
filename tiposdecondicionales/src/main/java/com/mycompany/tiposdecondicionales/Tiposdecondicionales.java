/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.tiposdecondicionales;

/**
 *
 * @author david
 */


 

public class Tiposdecondicionales {

    public static void main(String[] args) {
        
        boolean nohayinter= true;
        boolean haypoquitointer=false;
        boolean haybueninterperonoessuficiente=false;
        
        if (nohayinter){ 
        System.out.println("No hay internet");
        } else if(haypoquitointer){
            System.out.println("Tienes muy poquito internet");
        } else if(haybueninterperonoessuficiente){
            System.out.println("Casi casi, falta solo un poquito màs");
        } else{
            System.out.println("Tienes suficiente internet");
        }
       
    }
}
