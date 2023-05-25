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

    @Override
    public int atacar() {
        return fuerza;
    }

    @Override
    public void recibirAtaque(int ataque) {
        int danoRecibido = ataque;
        if (danoRecibido > 0) {
            salud -= danoRecibido;
        }
        System.out.println("¡El Mob hostil ha recibido " + danoRecibido + " puntos de daño! Salud restante: " + salud);
    }


}
