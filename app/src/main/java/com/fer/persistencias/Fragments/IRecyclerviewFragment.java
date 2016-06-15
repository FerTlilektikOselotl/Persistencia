package com.aaron_tejero.persistencias.Fragments;

import com.aaron_tejero.persistencias.Adapter.MascotaAdaptador;
import com.aaron_tejero.persistencias.pojo.Mascota;

import java.util.ArrayList;

/**
 * Created by AaronTejero on 29/05/2016.
 */
public interface IRecyclerviewFragment {

    public void generarLinearLayoutVertical();

    public MascotaAdaptador crearAdaptador(ArrayList<Mascota> mascotas);

    public void inicializarAdaptadorRV(MascotaAdaptador adaptador);
}
