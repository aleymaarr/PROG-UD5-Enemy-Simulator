package com.salesianos.Enderman;

import com.salesianos.MobHostil.MobHostil;

public class Enderman extends MobHostil {

    public Enderman() {
        super(14, 6);
    }

    @Override
    public void moverse() {
        System.out.println("El Zombie se mueve hacia el personaje.");
    }
}
