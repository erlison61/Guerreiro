package com.mycompany.wwe;

import java.util.Random;

public class Guerreiro {

    private int codigo, energia;
    private String nome;

    public Guerreiro(int codigo, String nome) {
        this.codigo = codigo;
        this.energia = 5;
        this.nome = nome;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getEnergia() {
        return energia;
    }

    public void setEnergia(int energia) {
        this.energia = energia;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void incremento() {
        if (getEnergia() <= 5) {
            setEnergia(getEnergia() + 1);
        }
    }

    public void decremento() {
        if (getEnergia() > 0) {
            setEnergia(getEnergia() - 1);
        } else {
            System.out.println("sua energia chegou a zero. Game Over");
        }
    }

    public void seAlimentar() {
        incremento();
    }

    public void lutar(Guerreiro oponente) {
        if (atacar() == 1) {
            oponente.decremento();
        } else if (oponente.atacar() == 1) {
            decremento();
        }

    }

    public void lutarLaco(Guerreiro oponente) {
        while (oponente.getEnergia() != 0 && getEnergia()!=0) {
                lutar(oponente);          
        }
        if (oponente.getEnergia() == 0) {
            System.out.println("o vencedor foi:"+getNome());
        } else if (getEnergia() == 0) {
            System.out.println("vencedor foi:" + oponente.getNome());
        } 
  
    }
    
    public void lutarRecursivo(Guerreiro oponente){
        if(oponente.getEnergia() != 0 && getEnergia()!=0){
            lutar(oponente);
            lutarRecursivo(oponente);
        }else{
            System.out.println("luta finalizada");
        }
    }

    public int atacar() {
        Random atack = new Random();
        return atack.nextInt(2);

    }

    @Override
    public String toString() {
        return "nome:" + getNome() + "\ncodigo do lutador" + getCodigo() + "\nEnergia Atual:" + getEnergia();
    }

    

}
