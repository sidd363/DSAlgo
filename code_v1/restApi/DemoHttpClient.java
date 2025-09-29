package restApi;


import com.google.gson.Gson;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;
public class DemoHttpClient {
    //@JsonIgnoreProperties(ignoreUnknown = true)
    static class User{
        String login;

//        public String getLogin() {
//            return login;
//        }
//
//        public void setLogin(String login) {
//            this.login = login;
//        }
    }
    public static void main(String[] args) {
        String url = "https://api.github.com/users/sidd363";
        try {
            URL uri = new URL(url);
            HttpURLConnection httpURLConnection = (HttpURLConnection) uri.openConnection();
            httpURLConnection.connect();

            int responseCode = httpURLConnection.getResponseCode();
            System.out.println("rc "+responseCode);

            Scanner scanner = new Scanner(uri.openStream());
            StringBuilder sb = new StringBuilder();

            while(scanner.hasNext()){
                sb.append(scanner.nextLine());
            }
            scanner.close();
//            ObjectMapper m = new ObjectMapper();
//            DemoHttpClient.User user = m.readValue(sb.toString(), DemoHttpClient.User.class);

            Gson gson = new Gson();
            User user = gson.fromJson(sb.toString(), User.class);
            System.out.println(sb);
            System.out.println(user.login);

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
