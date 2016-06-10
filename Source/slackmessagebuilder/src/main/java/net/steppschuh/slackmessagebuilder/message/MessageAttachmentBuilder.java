package net.steppschuh.slackmessagebuilder.message;

import java.util.ArrayList;
import java.util.List;

public class MessageAttachmentBuilder {

    private String title;
    private String titleLink;
    private String text;
    private String pretext;
    private String color;
    private String fallback;

    private String authorName;
    private String authorLink;
    private String authorIcon;

    private String imageUrl;
    private String thumbUrl;

    private String footer;
    private String footerIcon;

    private List<MessageAttachmentField> fields;

    public MessageAttachmentBuilder() {
    }

    public MessageAttachment build() {
        return new MessageAttachment(this);
    }

    public String getTitle() {
        return title;
    }

    public MessageAttachmentBuilder setTitle(String title) {
        this.title = title;
        return this;
    }

    public String getTitleLink() {
        return titleLink;
    }

    public MessageAttachmentBuilder setTitleLink(String titleLink) {
        this.titleLink = titleLink;
        return this;
    }

    public String getText() {
        return text;
    }

    public MessageAttachmentBuilder setText(String text) {
        this.text = text;
        return this;
    }

    public String getPretext() {
        return pretext;
    }

    public MessageAttachmentBuilder setPretext(String pretext) {
        this.pretext = pretext;
        return this;
    }

    public String getColor() {
        return color;
    }

    public MessageAttachmentBuilder setColor(String color) {
        this.color = color;
        return this;
    }

    public String getFallback() {
        return fallback;
    }

    public MessageAttachmentBuilder setFallback(String fallback) {
        this.fallback = fallback;
        return this;
    }

    public String getAuthorName() {
        return authorName;
    }

    public MessageAttachmentBuilder setAuthorName(String authorName) {
        this.authorName = authorName;
        return this;
    }

    public String getAuthorLink() {
        return authorLink;
    }

    public MessageAttachmentBuilder setAuthorLink(String authorLink) {
        this.authorLink = authorLink;
        return this;
    }

    public String getAuthorIcon() {
        return authorIcon;
    }

    public MessageAttachmentBuilder setAuthorIcon(String authorIcon) {
        this.authorIcon = authorIcon;
        return this;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public MessageAttachmentBuilder setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
        return this;
    }

    public String getThumbUrl() {
        return thumbUrl;
    }

    public MessageAttachmentBuilder setThumbUrl(String thumbUrl) {
        this.thumbUrl = thumbUrl;
        return this;
    }

    public String getFooter() {
        return footer;
    }

    public MessageAttachmentBuilder setFooter(String footer) {
        this.footer = footer;
        return this;
    }

    public String getFooterIcon() {
        return footerIcon;
    }

    public MessageAttachmentBuilder setFooterIcon(String footerIcon) {
        this.footerIcon = footerIcon;
        return this;
    }

    public List<MessageAttachmentField> getFields() {
        return fields;
    }

    public MessageAttachmentBuilder setFields(List<MessageAttachmentField> fields) {
        this.fields = fields;
        return this;
    }

    public MessageAttachmentBuilder addField(MessageAttachmentField field) {
        if (fields == null) {
            fields = new ArrayList<>();
        }
        fields.add(field);
        return this;
    }

}
