package com.salesianos.Mob;

public abstract class Mob {

    protected int salud;

    public Mob(int salud){
        this.salud = salud;
    }

    public int getSalud() {
        return salud;
    }

    public abstract void moverse();

}
