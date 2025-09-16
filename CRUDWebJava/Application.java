import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URI;
import java.net.URL;
import java.net.HttpURLConnection;


public class Application {
    public static void main(String[] args) throws IOException {
        // Cria objeto URL a partir do endereço da web
        URL url = URI.create("https://jsonplaceholder.typicode.com/posts/1").toURL();
        HttpURLConnection con = (HttpURLConnection) url.openConnection(); // Abre conexão HTTP
        con.setRequestMethod("GET"); // Define requisição como GET

        BufferedReader in = new BufferedReader(
            new InputStreamReader(con.getInputStream()) // Cria leitor que o servidor vai utilizar
        );
        String inputLine;
        StringBuffer content = new StringBuffer();
        while ((inputLine = in.readLine()) != null) { // Repete até ler todo o conteúdo da resposta e salva na variável content
            content.append(inputLine);
        }
        // Fecha os buffer e conexão HTTP
        in.close();
        con.disconnect();

        System.out.println(content.toString()); // Printa o retorno do servidor
    }
}