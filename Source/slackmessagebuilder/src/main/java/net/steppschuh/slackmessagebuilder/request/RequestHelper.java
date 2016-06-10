package net.steppschuh.slackmessagebuilder.request;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;

public class RequestHelper {

    public static final String DEFAULT_ENCODING = "UTF-8";

    public static String postRequestJson(String endpoint, String payload) throws Exception {
        URL url = new URL(endpoint);
        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
        conn.setDoOutput(true);
        conn.setRequestMethod("POST");
        conn.setRequestProperty("Content-Type", "application/json");

        System.out.println(payload);

        OutputStream os = conn.getOutputStream();
        os.write(payload.getBytes(DEFAULT_ENCODING));
        os.flush();

        if (conn.getResponseCode() != HttpURLConnection.HTTP_OK) {
            throw new Exception("HTTP response: " + conn.getResponseCode() + " - " + conn.getResponseMessage());
        }

        BufferedReader br = new BufferedReader(new InputStreamReader((conn.getInputStream())));
        StringBuilder outputBuilder = new StringBuilder();
        String output;
        while ((output = br.readLine()) != null) {
            outputBuilder.append(output);
        }

        conn.disconnect();
        return outputBuilder.toString();
    }

}
