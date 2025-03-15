import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;

public class Delta {
    public static void main(String[] args) {
        try {
            // URL of the server endpoint
            URL url = new URL("https://example.com/api/resource");
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();

            // Set the request method to POST
            connection.setRequestMethod("POST");
            connection.setRequestProperty("Content-Type", "application/json; utf-8");
            connection.setRequestProperty("Accept", "application/json");
            connection.setDoOutput(true);

            // JSON payload
            String jsonInputString = "{\"name\": \"John\", \"age\": 30}";

            // Write the JSON payload to the output stream
            try (OutputStream os = connection.getOutputStream()) {
                byte[] input = jsonInputString.getBytes("utf-8");
                os.write(input, 0, input.length);
            }

            // Get the response code
            int responseCode = connection.getResponseCode();
            System.out.println("POST Response Code :: " + responseCode);

            // Handle the response
            if (responseCode == HttpURLConnection.HTTP_OK) { // success
                System.out.println("POST request worked");
            } else {
                System.out.println("POST request did not work");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}