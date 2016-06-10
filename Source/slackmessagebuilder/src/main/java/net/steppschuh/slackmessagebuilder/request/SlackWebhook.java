package net.steppschuh.slackmessagebuilder.request;

import com.google.gson.Gson;

import net.steppschuh.slackmessagebuilder.SlackMessage;

public class SlackWebhook {

    final Gson gson = new Gson();
    private String url;

    public SlackWebhook(String url) {
        this.url = url;
    }

    public void postMessage(SlackMessage slackMessage) throws Exception {
        String jsonPayload = gson.toJson(slackMessage);
        postPayload(jsonPayload);
    }

    public void postPayload(String jsonPayload) throws Exception {
        RequestHelper.postRequestJson(url, jsonPayload);
    }

}
