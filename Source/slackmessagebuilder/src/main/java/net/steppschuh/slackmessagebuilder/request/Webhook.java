package net.steppschuh.slackmessagebuilder.request;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import net.steppschuh.slackmessagebuilder.message.Message;

public class Webhook {

    private final Gson gson = new GsonBuilder().setPrettyPrinting().create();
    private String url;

    public Webhook(String url) {
        this.url = url;
    }

    public void postMessage(final Message message) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    postMessageSynchronous(message);
                } catch (Exception ex) {
                    ex.printStackTrace();
                }
            }
        }).start();
    }

    public void postMessageSynchronous(Message message) throws Exception {
        String jsonPayload = gson.toJson(message);
        postPayloadSynchronous(jsonPayload);
    }

    public void postPayloadSynchronous(String jsonPayload) throws Exception {
        RequestHelper.postRequestJson(url, jsonPayload);
    }

}
