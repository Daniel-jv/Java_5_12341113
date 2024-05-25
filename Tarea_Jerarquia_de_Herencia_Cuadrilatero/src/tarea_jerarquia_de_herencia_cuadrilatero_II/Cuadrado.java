package tarea_jerarquia_de_herencia_cuadrilatero_II;

import java.util.ArrayList;
import tarea_jerarquia_de_herencia_cuadrilatero_II.Tarea_Jerarquia_de_Herencia_Cuadrilatero.Calculos;

public class Cuadrado extends Paralelogramo implements Calculos{

    public Cuadrado(Punto punto1, Punto punto2, Punto punto3, Punto punto4) {
        super(punto1, punto2, punto3, punto4);
    }

    @Override
    public void ToString(ArrayList<Punto> puntos, double[] lados) {
        for (int i = 0; i < puntos.size(); i++) {
            coordenadas(puntos,i);
        }
        System.out.println("\nEl lado es: "+lados[0]);
        System.out.println("El area es: "+area(lados));
        
    }

    @Override
    public double area(double[] lados) {
        double area = lados[1]*lados[0];
        return area;
    }

    @Override
    public void coordenadas(ArrayList<Punto> puntos, int i) {
        System.out.print("("+puntos.get(i).getX()+", "+puntos.get(i).getY()+")");
    }
    
    
    
}
