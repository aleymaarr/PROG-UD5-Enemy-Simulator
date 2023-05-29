package com.salesianos.Enderman;

import com.salesianos.MobHostil.MobHostil;

public class Enderman extends MobHostil {
    public Enderman() {
        super(14, 6);
    }

    @Override
    public void moverse() {
        System.out.println("El Enderman se teletransporta detrás.");
    }

    @Override
    public String getNombre() {
        return "Enderman";
    }
<<<<<<< HEAD
=======

>>>>>>> menu
}
