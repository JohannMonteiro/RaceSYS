package com.company;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Vector;

import com.company.Carro;


public class Main {

    public static void main(String[] args) {
       ArrayList<Carro> carros = new ArrayList<Carro>();

       Carro bmw = new Carro();
       bmw.setHp(450);
       bmw.setMarca("BMW");
       bmw.piloto.setNome("Tales");
       bmw.piloto.setEquipe("Tornado");

       carros.add(bmw);

       for (int i = 0; i < carros.size(); i++){
           System.out.println(carros);
       }


    }
}
