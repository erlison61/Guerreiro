package com.mycompany.wwe;
import java.util.Random;
public class WWE {
     public static void main(String[] args) {
         Guerreiro eu= new Guerreiro(1111,"erlison");
         Guerreiro oponente=new Guerreiro(2222,"anonimo");
         eu.seAlimentar();
         eu.seAlimentar();
         eu.seAlimentar();
         eu.seAlimentar();
         eu.seAlimentar();
         
         oponente.seAlimentar();
         oponente.seAlimentar();
         oponente.seAlimentar();
         oponente.seAlimentar();
         oponente.seAlimentar();
         
         eu.lutarRecursivo(oponente);
         
         
         System.out.println(eu.toString()+"\n "+oponente.toString());
    }
}
