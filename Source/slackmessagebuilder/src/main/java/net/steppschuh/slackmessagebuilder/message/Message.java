package net.steppschuh.slackmessagebuilder.message;

import com.google.gson.annotations.SerializedName;

import net.steppschuh.slackmessagebuilder.message.attachment.Attachment;

import java.io.Serializable;
import java.util.List;

public class Message implements Serializable {

    private String channel;
    private String text;
    private String username;
    @SerializedName("icon_url")
    private String iconUrl;
    @SerializedName("icon_emoji")
    private String iconEmoji;
    private List<Attachment> attachments;

    public Message() {
    }

    public Message(MessageBuilder messageBuilder) {
        this.channel = messageBuilder.getChannel();
        this.text = messageBuilder.getText();
        this.username = messageBuilder.getUsername();
        this.iconUrl = messageBuilder.getIconUrl();
        this.iconEmoji = messageBuilder.getIconEmoji();
        this.attachments = messageBuilder.getAttachments();
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

    public String getIconUrl() {
        return iconUrl;
    }

    public void setIconUrl(String iconUrl) {
        this.iconUrl = iconUrl;
    }

    public String getIconEmoji() {
        return iconEmoji;
    }

    public void setIconEmoji(String iconEmoji) {
        this.iconEmoji = iconEmoji;
    }

    public List<Attachment> getAttachments() {
        return attachments;
    }

    public void setAttachments(List<Attachment> attachments) {
        this.attachments = attachments;
    }

}
