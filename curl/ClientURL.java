package curl;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ClientURL {
  public static void main(String[] args) throws IOException, InterruptedException {
    var url = args[0];

    var request = HttpRequest.newBuilder().uri(URI.create(url)).GET().build();
    var httpClient = HttpClient.newBuilder().build();
    var response = httpClient.send(request, HttpResponse.BodyHandlers.ofString());

    System.out.println(response.body());
  }
}
