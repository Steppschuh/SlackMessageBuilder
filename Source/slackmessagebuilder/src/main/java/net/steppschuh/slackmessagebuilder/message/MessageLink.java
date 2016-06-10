package net.steppschuh.slackmessagebuilder.message;

public class MessageLink {

    private String url;
    private String text;

    public MessageLink(String url) {
        this.url = url;
        this.text = url;
    }

    public MessageLink(String url, String text) {
        this.url = url;
        this.text = text;
    }

    @Override
    public String toString() {
        return "<" + url + "|" + text + ">";
    }

}
