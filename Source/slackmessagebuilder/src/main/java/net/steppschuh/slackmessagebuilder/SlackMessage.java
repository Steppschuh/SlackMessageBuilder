package net.steppschuh.slackmessagebuilder;

import java.io.Serializable;
import java.util.List;

public class SlackMessage implements Serializable {

    private String channel;
    private String text;
    private String username;
    private String icon_url;
    private String icon_emoji;
    private List<SlackMessageAttachment> attachments;

    public SlackMessage() {
    }

    public SlackMessage(SlackMessageBuilder slackMessageBuilder) {
        this.channel = slackMessageBuilder.getChannel();
        this.text = slackMessageBuilder.getText();
        this.username = slackMessageBuilder.getUsername();
        this.icon_url = slackMessageBuilder.getIcon_url();
        this.icon_emoji = slackMessageBuilder.getIcon_emoji();
        this.attachments = slackMessageBuilder.getAttachments();
    }

    public String getChannel() {
        return channel;
    }

    public void setChannel(String channel) {
        this.channel = channel;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getIcon_url() {
        return icon_url;
    }

    public void setIcon_url(String icon_url) {
        this.icon_url = icon_url;
    }

    public String getIcon_emoji() {
        return icon_emoji;
    }

    public void setIcon_emoji(String icon_emoji) {
        this.icon_emoji = icon_emoji;
    }

    public List<SlackMessageAttachment> getAttachments() {
        return attachments;
    }

    public void setAttachments(List<SlackMessageAttachment> attachments) {
        this.attachments = attachments;
    }
}
