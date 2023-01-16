import comida.*;
import musica.*;
import videojuego.*;
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        try {
            List milista = new ArrayList();
            milista.add(new Yaguarlocro("Yaguarlocro", "Sierra", 2.23, "Papas, mani, menudo"));
            milista.add(new Cancion("Arctic Monkeys", "Alternative rock", "505", "4:14"));
            milista.add(new Codigo("Dota 2", "Estrategia", "c++ lua"));
        }catch(Exception ex){
            System.out.println("Error");
        }
    }
}