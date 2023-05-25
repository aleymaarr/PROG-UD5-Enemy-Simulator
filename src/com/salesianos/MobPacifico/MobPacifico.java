package com.salesianos.MobPacifico;

import com.salesianos.Interface.Daño;
import com.salesianos.Mob.Mob;

public abstract class MobPacifico  extends Mob implements Daño {

    public MobPacifico(int salud) {
        super(salud);
    }

    @Override
    public void recibirAtaque(int ataque) {
        int dañoRecibido = ataque;
        if (dañoRecibido > 0) {
            salud -= dañoRecibido;
        }
    }

}
