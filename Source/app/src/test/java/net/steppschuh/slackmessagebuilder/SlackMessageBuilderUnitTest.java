package net.steppschuh.slackmessagebuilder;

import net.steppschuh.slackmessagebuilder.request.SlackWebhook;

import org.junit.Test;

import static org.junit.Assert.*;

public class SlackMessageBuilderUnitTest {

    @Test
    public void builder_exampleMessage() throws Exception {
        // create a webhook
        String hookUrl = "https://hooks.slack.com/services/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";
        SlackWebhook slackWebhook = new SlackWebhook(hookUrl);

        // create a message
        SlackMessageBuilder slackMessageBuilder = new SlackMessageBuilder()
                .setChannel("@random")
                .setUsername("Slack Message Builder")
                .setIcon_emoji(":+1:")
                .setText("I'm the message text");

        // add some attachments
        int attachmentCount = 3;
        for (int index = 1; index <= attachmentCount; index++) {
            SlackMessageAttachment attachment = new SlackMessageAttachment();
            attachment.setPretext("Attachment " + index + " incoming:");
            attachment.setTitle("Attachment " + index);
            attachment.setText("I'm attachment " + index + " text.");
            slackMessageBuilder.addAttachment(attachment);
        }

        // send message
        slackWebhook.postMessage(slackMessageBuilder.build());
    }

}