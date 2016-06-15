package com.aaron_tejero.persistencias.presentador;

import android.content.Context;

import com.aaron_tejero.persistencias.db.ConstructorMascotas;
import com.aaron_tejero.persistencias.favoritos;
import com.aaron_tejero.persistencias.pojo.Mascota;

import java.util.ArrayList;

/**
 * Created by AaronTejero on 30/05/2016.
 */
public class FavoritosPresenter implements IFavoritosPresenter {

    private final favoritos favs;
    private final Context context;
    private ConstructorMascotas constructorMascotas;
    private ArrayList<Mascota> mascotas;


    public FavoritosPresenter(favoritos favs, Context context) {
        this.favs = favs;
        this.context = favs;
        obtenerFavoritos();
    }


    @Override
    public void obtenerFavoritos() {
        constructorMascotas = new ConstructorMascotas(context);
        mascotas = constructorMascotas.obtenerFavmascotas();
    }

    @Override
    public ArrayList<Mascota> getLista() {
        return mascotas;
    }
}
