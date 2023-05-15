import model.Equipo;
import model.Liga;
import model.Partido;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

public class App {
    public static final String DELIMITADOR = "::";

    public static void main(String[] args) {
        Liga liga = new Liga();
        liga.agregarPartidos(leerFichero());
        System.out.println(liga.obtenerClasificacion())  ;
        liga.crearFichero();
        liga.crearPaginaClasificacion();
        liga.crearPaginaGolesAFavor();
        liga.crearPaginaGolesEnContra();
    }

    private static Set<Partido> leerFichero() {
        Set<Partido> partidos = new HashSet<>();
        try {
            BufferedReader reader = new BufferedReader(new FileReader("src/main/resources/ut5-tarea13-partidos.txt"));

            String linea;
            while ((linea = reader.readLine()) != null) {
                String[] datos = linea.split(DELIMITADOR);
                Partido partido = new Partido(
                        new Equipo(datos[0].trim()),
                        new Equipo(datos[1].trim()),
                        Integer.parseInt(datos[2]),
                        Integer.parseInt(datos[3])
                );
                partidos.add(partido);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        return partidos;
    }
}
