package net.steppschuh.slackmessagebuilder;

import org.junit.Test;

import static org.junit.Assert.*;

public class ExampleUnitTest {

    @Test
    public void builder_createsValidMessage() throws Exception {
        SlackMessageBuilder slackMessageBuilder = new SlackMessageBuilder();
        slackMessageBuilder.test();
    }

}