package com.example.bonsus;


import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class Inicio extends Fragment {
    private final int[] BOTONES = {R.id.btn_logo, R.id.btn_mis_recetas, R.id.btn_mis_pedidos, R.id.btn_web};
    private int queboton=0;


    public Inicio() {

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View inicio = inflater.inflate(R.layout.fragment_inicio, container, false);

        ImageButton boton;
        int i=0;
        while(i<BOTONES.length){
            boton = (ImageButton) inicio.findViewById(BOTONES[i]);

            queboton=i;

            boton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Activity actual = getActivity();
                    assert actual != null;
                    ((ComunicaInicio)actual).comunicar(BOTONES[queboton]);
                }
            });
            i++;
        }

        return inicio;
    }

}
