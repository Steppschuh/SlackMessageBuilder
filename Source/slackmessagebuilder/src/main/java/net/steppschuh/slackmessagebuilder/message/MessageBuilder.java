package net.steppschuh.slackmessagebuilder.message;

import net.steppschuh.slackmessagebuilder.message.attachment.Attachment;

import java.util.ArrayList;
import java.util.List;

public class MessageBuilder {

    private String channel;
    private String text;
    private String username;
    private String icon_url;
    private String icon_emoji;
    private List<Attachment> attachments;

    public MessageBuilder() {
    }

    public MessageBuilder(String text) {
        this.text = text;
    }

    public MessageBuilder(String channel, String text) {
        this.channel = channel;
        this.text = text;
    }

    public Message build() {
        return new Message(this);
    }

    public String getChannel() {
        return channel;
    }

    public MessageBuilder setChannel(String channel) {
        this.channel = channel;
        return this;
    }

    public String getText() {
        return text;
    }

    public MessageBuilder setText(String text) {
        this.text = text;
        return this;
    }

    public String getUsername() {
        return username;
    }

    public MessageBuilder setUsername(String username) {
        this.username = username;
        return this;
    }

    public String getIconUrl() {
        return icon_url;
    }

    public MessageBuilder setIconUrl(String icon_url) {
        this.icon_url = icon_url;
        return this;
    }

    public String getIconEmoji() {
        return icon_emoji;
    }

    public MessageBuilder setIconEmoji(String icon_emoji) {
        this.icon_emoji = icon_emoji;
        return this;
    }

    public List<Attachment> getAttachments() {
        return attachments;
    }

    public MessageBuilder setAttachments(List<Attachment> attachments) {
        this.attachments = attachments;
        return this;
    }

    public MessageBuilder addAttachment(Attachment attachment) {
        if (attachments == null) {
            attachments = new ArrayList<>();
        }
        attachments.add(attachment);
        return this;
    }

}
