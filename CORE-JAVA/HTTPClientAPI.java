import java.net.http.*;
import java.net.URI;
import java.io.IOException;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

public class HTTPClientAPI {
    public static void main(String[] args) throws IOException, InterruptedException {
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("https://api.github.com/users/octocat"))
                .build();

        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

        System.out.println("Status Code: " + response.statusCode());
        System.out.println("Response Body:\n" + response.body());

        
        JsonParser parser = new JsonParser();
        JsonObject json = parser.parse(response.body()).getAsJsonObject();
        System.out.println("\nLogin: " + json.get("login").getAsString());
        System.out.println("Name: " + json.get("name").getAsString());
    }
}
