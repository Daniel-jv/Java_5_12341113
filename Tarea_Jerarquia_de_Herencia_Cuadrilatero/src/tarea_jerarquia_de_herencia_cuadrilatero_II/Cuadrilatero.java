package tarea_jerarquia_de_herencia_cuadrilatero_II;

import java.util.ArrayList;
import java.util.Arrays;
import tarea_jerarquia_de_herencia_cuadrilatero_II.Tarea_Jerarquia_de_Herencia_Cuadrilatero.Calculos;

public class Cuadrilatero implements Calculos{
    
    private Punto punto1;
    private Punto punto2;
    private Punto punto3;
    private Punto punto4;
     
    public Cuadrilatero(Punto punto1, Punto punto2, Punto punto3, Punto punto4) {
        this.punto1 = punto1;
        this.punto2 = punto2;
        this.punto3 = punto3;
        this.punto4 = punto4;
    }
    
    public Punto getPunto1() {
        return punto1;
    }

    public void setPunto1(Punto punto1) throws mensajeExep {
        if(punto1.getX() < 0 || punto1.getY() < 0){
            throw new mensajeExep("No hay medidas negativas...");
        }else{
            this.punto1 = punto1;
        }
    }

    public Punto getPunto2() {
        return punto2;
    }

    public void setPunto2(Punto punto2) throws mensajeExep {
        if(punto2.getX() < 0 || punto2.getY() < 0){
            throw new mensajeExep("No hay medidas negativas...");
        }else{
            this.punto2 = punto2;
        }
    }

    public Punto getPunto3() {
        return punto3;
    }

    public void setPunto3(Punto punto3) throws mensajeExep {
        if(punto3.getX() < 0 || punto3.getY() < 0){
            throw new mensajeExep("No hay medidas negativas...");
        }else{
            this.punto3 = punto3;
        }
    }

    public Punto getPunto4() {
        return punto4;
    }

    public void setPunto4(Punto punto4) throws mensajeExep {
        if(punto4.getX() < 0 || punto4.getY() < 0){
            throw new mensajeExep("No hay medidas negativas...");
        }else{
            this.punto4 = punto4;
        }
    }

    @Override
    public void coordenadas(ArrayList<Punto> puntos, int i) {
        System.out.print("("+puntos.get(i).getX()+", "+puntos.get(i).getY()+")");
    }

    @Override
    public double area(double lados []) {
        return 0.0;
    }

    @Override
    public void ToString(ArrayList<Punto> puntos, double lados []) {
        for (int i = 0; i < puntos.size(); i++) {
            coordenadas(puntos,i);
        }
    }
    
    
}