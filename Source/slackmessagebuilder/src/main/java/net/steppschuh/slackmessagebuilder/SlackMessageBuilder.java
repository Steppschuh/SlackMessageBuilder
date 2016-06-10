package net.steppschuh.slackmessagebuilder;

import java.util.ArrayList;
import java.util.List;

public class SlackMessageBuilder {

    private String channel;
    private String text;
    private String username;
    private String icon_url;
    private String icon_emoji;
    private List<SlackMessageAttachment> attachments;

    public SlackMessageBuilder() {
    }

    public SlackMessageBuilder(String text) {
        this.text = text;
    }

    public SlackMessageBuilder(String channel, String text) {
        this.channel = channel;
        this.text = text;
    }

    public SlackMessage build() {
        return new SlackMessage(this);
    }

    public String getChannel() {
        return channel;
    }

    public SlackMessageBuilder setChannel(String channel) {
        this.channel = channel;
        return this;
    }

    public String getText() {
        return text;
    }

    public SlackMessageBuilder setText(String text) {
        this.text = text;
        return this;
    }

    public String getUsername() {
        return username;
    }

    public SlackMessageBuilder setUsername(String username) {
        this.username = username;
        return this;
    }

    public String getIcon_url() {
        return icon_url;
    }

    public SlackMessageBuilder setIcon_url(String icon_url) {
        this.icon_url = icon_url;
        return this;
    }

    public String getIcon_emoji() {
        return icon_emoji;
    }

    public SlackMessageBuilder setIcon_emoji(String icon_emoji) {
        this.icon_emoji = icon_emoji;
        return this;
    }

    public List<SlackMessageAttachment> getAttachments() {
        return attachments;
    }

    public SlackMessageBuilder setAttachments(List<SlackMessageAttachment> attachments) {
        this.attachments = attachments;
        return this;
    }

    public SlackMessageBuilder addAttachment(SlackMessageAttachment attachment) {
        if (attachments == null) {
            attachments = new ArrayList<>();
        }
        attachments.add(attachment);
        return this;
    }

}
