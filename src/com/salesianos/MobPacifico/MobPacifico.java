package com.salesianos.MobPacifico;

import com.salesianos.Interface.Daño;
import com.salesianos.Mob.Mob;

public abstract class MobPacifico  extends Mob implements Daño {

    public MobPacifico(int salud) {
        super(salud);
    }


    @Override
    public void recibirAtaque(int ataque) {
        int dano = ataque;
        salud -= dano;
        System.out.println("El mob pacífico recibe " + dano + " puntos de daño. Salud restante: " + salud);
    }
}
