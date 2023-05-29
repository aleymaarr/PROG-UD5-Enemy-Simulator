package com.salesianos.Zombie;

import com.salesianos.MobHostil.MobHostil;

public class Zombie extends MobHostil {
    public Zombie() {
        super(10, 4);
    }

    @Override
    public void moverse() {
        System.out.println("El Zombie se mueve hacia el personaje.");
    }

    @Override
    public String getNombre() {
        return "Zombie";
    }
}
