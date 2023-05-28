package com.salesianos.Personaje;

import com.salesianos.Interface.Combate;

public class Personaje implements Combate {

    private int salud;
    private int defensa;
    private int fuerza;

    public Personaje(int defensa, int fuerza) {
        this.salud = 12;
        this.defensa = defensa;
        this.fuerza = fuerza;
    }

    public int getSalud() {
        return salud;
    }

    public void setSalud(int salud) {
        this.salud = salud;
    }

    public int getDefensa() {
        return defensa;
    }

    public void setDefensa(int defensa) {
        this.defensa = defensa;
    }

    public int getFuerza() {
        return fuerza;
    }

    public void setFuerza(int fuerza) {
        this.fuerza = fuerza;
    }

    @Override
    public int atacar() {
        return fuerza;
    }

    @Override
    public void recibirAtaque(int ataque) {
        int dano = ataque - defensa;
        if (dano > 0) {
            salud -= dano;
            System.out.println("El personaje recibe " + dano + " puntos de daño. Salud restante: " + salud);
        } else {
            System.out.println("El personaje bloquea el ataque. Salud restante: " + salud);
        }
    }
}
