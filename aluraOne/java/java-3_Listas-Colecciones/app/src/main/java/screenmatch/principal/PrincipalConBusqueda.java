package screenmatch.principal;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;
import java.util.Scanner;

import screenmatch.modelos.Titulo;

import com.google.gson.Gson;
/**
 * PrincipalConBusqueda
 */
public class PrincipalConBusqueda {

  public static void main(String[] args) throws IOException, InterruptedException {
    Scanner lectura = new Scanner(System.in);

    System.out.println("Escribe la pelicula que deseas buscar: ");
    
    var busqueda = lectura.nextLine();

    String direccion = "http://www.omdbapi.com/?t="+busqueda+"&apikey=a2653150";

    // lectura.close();


    
    HttpClient client = HttpClient.newHttpClient();
    HttpRequest request = HttpRequest.newBuilder()
        .uri(URI.create(direccion))
        .build();

    HttpResponse<String> response = client
        .send(request, BodyHandlers.ofString());

    String json = response.body();

    System.out.println(json);


    Gson gson = new Gson();
    Titulo miTitulo = gson.fromJson(json, Titulo.class);
    System.out.println(miTitulo);

    lectura.close();
    
  }
}
