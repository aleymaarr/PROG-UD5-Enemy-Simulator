package com.salesianos.MobHostil;

import com.salesianos.Interface.Combate;
import com.salesianos.Mob.Mob;

public abstract class MobHostil extends Mob implements Combate {

    int fuerza;

    public MobHostil(int salud, int fuerza) {
        super(salud);
        this.fuerza = fuerza;
    }

    public int getFuerza() {
        return fuerza;
    }

    public void setFuerza(int fuerza) {
        this.fuerza = fuerza;
    }

    public String getNombre(){
        return "Enemigo";
    }

    @Override
    public int atacar() {
        return fuerza;
    }

    @Override
    public void recibirAtaque(int ataque) {
        int dano = ataque;
        salud -= dano;
        System.out.println("El mob hostil recibe " + dano + " puntos de daño. Salud restante: " + salud);
    }
}
