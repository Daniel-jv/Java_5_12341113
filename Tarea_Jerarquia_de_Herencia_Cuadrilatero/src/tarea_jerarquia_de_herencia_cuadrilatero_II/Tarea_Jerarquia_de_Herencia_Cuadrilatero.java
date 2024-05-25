package tarea_jerarquia_de_herencia_cuadrilatero_II;

import java.util.ArrayList;
import java.util.Scanner;

public class Tarea_Jerarquia_de_Herencia_Cuadrilatero {

    public interface Calculos {
        void coordenadas(ArrayList<Punto> puntos,int i);
        double area(double lados []);
        void ToString(ArrayList<Punto> puntos,double lados []);
    }
        
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        boolean var = true;
        while(var){
            System.out.println("Ingrese los 4 puntos ");
            ArrayList<Punto> puntos = new ArrayList();
            for (int i = 1; i < 5; i++) {
                System.out.print("x-punto "+i+": ");
                int x = leer.nextInt();
                System.out.print("y-punto "+i+": ");
                int y = leer.nextInt();
                Punto puntonuevo = new Punto(x,y);
                puntos.add(puntonuevo);
                System.out.println();
            }
            if(puntos.get(0) == puntos.get(1) || puntos.get(0) == puntos.get(2) || puntos.get(0) == puntos.get(3) ||
               puntos.get(1) == puntos.get(2) || puntos.get(1) == puntos.get(3) || puntos.get(2) == puntos.get(3) ){
                System.out.println("Eso no es un cuadrilatero...");
            }else{
                ArrayList<Punto> puntosOrdenados = calcularPuntos(puntos);
                double lados [] = new double [4];
                lados[0] = puntosOrdenados.get(1).getY() - puntosOrdenados.get(0).getY();
                lados[1] = puntosOrdenados.get(3).getX() - puntosOrdenados.get(1).getX();
                lados[2] = puntosOrdenados.get(3).getY() - puntosOrdenados.get(2).getY();
                lados[3] = puntosOrdenados.get(2).getX() - puntosOrdenados.get(0).getX();
                for (int i = 0; i < lados.length; i++) {
                    if(lados[i]<0){
                        lados[i] = lados[i] * -1;
                    }
                }
                if(lados[0] == lados[1] && lados[1] == lados[2] && lados[2] == lados[3]){
                    System.out.println("\nLas coordenadas de Cuadrado son: ");
                    Cuadrado figura = new Cuadrado(puntos.get(0),puntos.get(1),puntos.get(2),puntos.get(3));
                    figura.ToString(puntosOrdenados, lados);
                    
                    
                }else if((lados[0] == lados[2] && lados[1] == lados[3] || lados[0] == lados[3] && lados[1] == lados[2] )&&
                        puntosOrdenados.get(0).getY() == puntosOrdenados.get(2).getY() && puntosOrdenados.get(1).getY() == puntosOrdenados.get(3).getY() && 
                        puntosOrdenados.get(0).getX() == puntosOrdenados.get(1).getX() && puntosOrdenados.get(2).getX() == puntosOrdenados.get(3).getX()){
                    System.out.println("\nLas coordenadas del Rectangulo son: ");
                    Rectangulo figura = new Rectangulo(puntos.get(0),puntos.get(1),puntos.get(2),puntos.get(3));
                    figura.ToString(puntosOrdenados, lados);
                    
                    
                }else if(lados[0] == lados[2] && lados[1] == lados[3] || lados[0] == lados[3] && lados[1] == lados[2] ){
                    System.out.println("\nLas coordenadas del Paralelogramo son:");
                    Paralelogramo figura = new Paralelogramo(puntos.get(0),puntos.get(1),puntos.get(2),puntos.get(3));
                    figura.ToString(puntosOrdenados, lados);
                    
                    
                }else{
                    
                    
                    if((puntosOrdenados.get(0).getY() == puntosOrdenados.get(3).getY() && puntosOrdenados.get(1).getY() == puntosOrdenados.get(2).getY()) || 
                        (puntosOrdenados.get(0).getX() == puntosOrdenados.get(1).getX() && puntosOrdenados.get(2).getX() == puntosOrdenados.get(3).getX())){
                        System.out.println("\nLas coordenadas del Trapezoide son: ");
                        Trapezoide figura = new Trapezoide(puntos.get(0),puntos.get(1),puntos.get(2),puntos.get(3));
                        figura.ToString(puntosOrdenados, lados);
                        
                        
                    }else{
                        System.out.println("\nLas coordenadas del cuadrilatero son: ");
                        Cuadrilatero figura = new Cuadrilatero(puntos.get(0),puntos.get(1),puntos.get(2),puntos.get(3));
                        figura.ToString(puntosOrdenados, lados);
                    }
                }
                
            }
            System.out.println("\n");
            //var = false
            //lo dejo asi porque no me parecio importante salir del programa
        }
            
    }
    
    public static ArrayList<Punto> calcularPuntos(ArrayList<Punto> puntos){
        Punto primerpunto = new Punto(1000,1000);
        for (int i = 0; i < puntos.size(); i++) {
            if(primerpunto.getX() >=  puntos.get(i).getX()){
                primerpunto = puntos.get(i);
            }
        }
        Punto segundopunto = new Punto(1000,1000);
        for (int i = 0; i < puntos.size(); i++) {
            if(segundopunto.getX() >=  puntos.get(i).getX() && primerpunto !=  puntos.get(i)){
                segundopunto = puntos.get(i);
            }
        }
        Punto tercerpunto = new Punto(1000,1000);
        for (int i = 0; i < puntos.size(); i++) {
            if(tercerpunto.getX() >=  puntos.get(i).getX() && primerpunto !=  puntos.get(i) && segundopunto !=  puntos.get(i)){
                tercerpunto = puntos.get(i);
            }
        }
        Punto cuartopunto = new Punto(1000,1000);
        for (int i = 0; i < puntos.size(); i++) {
            if(cuartopunto.getX() >=  puntos.get(i).getX() && primerpunto !=  puntos.get(i) && segundopunto !=  puntos.get(i) && tercerpunto !=  puntos.get(i)){
                cuartopunto = puntos.get(i);
            }
        }
        ArrayList <Punto> puntosOrdenados = new ArrayList<>();
        puntosOrdenados.add(primerpunto);
        puntosOrdenados.add(segundopunto);
        puntosOrdenados.add(tercerpunto);
        puntosOrdenados.add(cuartopunto);
        return puntosOrdenados;
    }

}
