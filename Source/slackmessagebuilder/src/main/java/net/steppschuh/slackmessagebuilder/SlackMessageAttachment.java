package net.steppschuh.slackmessagebuilder;

import java.io.Serializable;

public class SlackMessageAttachment implements Serializable {

    private String title;
    private String text;
    private String pretext;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getPretext() {
        return pretext;
    }

    public void setPretext(String pretext) {
        this.pretext = pretext;
    }

}
