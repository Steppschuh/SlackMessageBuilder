# Slack Message Builder
This lightweight library can be utilized to generate Slack messages that can be sent to the Slack API via webhooks.

![Screenshot](https://raw.githubusercontent.com/Steppschuh/SlackMessageBuilder/master/Media/example_message_01.jpg)

## Setup
#### Get the JAR
Download the [library](https://github.com/Steppschuh/SlackMessageBuilder/tree/master/Library) and add it to your project.

#### Add a WebHook
Go to the [custom integrations](https://steppschuh.slack.com/apps/build/custom-integration) site and add an [incoming webhook](https://api.slack.com/incoming-webhooks) to your Slack. Note your `WebHook URL`, you'll need it later.

#### Look at the Unit Test
Check out the example implementation [unit test](https://github.com/Steppschuh/SlackMessageBuilder/blob/master/Source/app/src/test/java/net/steppschuh/slackmessagebuilder/MessageBuilderUnitTest.java). Update the `WebHook URL` and the Slack channel (or it will post to `#general`).

![Screenshot](https://raw.githubusercontent.com/Steppschuh/SlackMessageBuilder/master/Media/example_code_01.jpg)

## Usage
#### Create a message
You can use the [MessageBuilder](https://github.com/Steppschuh/SlackMessageBuilder/blob/master/Source/slackmessagebuilder/src/main/java/net/steppschuh/slackmessagebuilder/message/MessageBuilder.java) to create a [Message](https://github.com/Steppschuh/SlackMessageBuilder/blob/master/Source/slackmessagebuilder/src/main/java/net/steppschuh/slackmessagebuilder/message/Message.java) object:

``` java
Message message = new MessageBuilder()
  .setChannel("#general")
  .setUsername("Slack Message Builder")
  .setText("I'm the message text")
  .build();
```

#### Create a message attachment
You can use the [AttachmentBuilder](https://github.com/Steppschuh/SlackMessageBuilder/blob/master/Source/slackmessagebuilder/src/main/java/net/steppschuh/slackmessagebuilder/message/attachment/AttachmentBuilder.java) to create a [Attachment](https://github.com/Steppschuh/SlackMessageBuilder/blob/master/Source/slackmessagebuilder/src/main/java/net/steppschuh/slackmessagebuilder/message/attachment/Attachment.java) object:

``` java
Attachment attachment = new AttachmentBuilder()
  .setTitle("Attachment")
  .setText("I'm the attachment text")
  .setColor(Attachment.COLOR_WARNING)
  .addField(new AttachmentField("Property", "Value"))
  .setFooter("Created by Slack Message Builder")
  .build();
```

#### Post to Slack
You can simply serialize a Message object to a JSON string and send a Post request to your `WebHook URL`. The [Webhook](https://github.com/Steppschuh/SlackMessageBuilder/blob/master/Source/slackmessagebuilder/src/main/java/net/steppschuh/slackmessagebuilder/request/Webhook.java) can also do the work for you:

``` java
Webhook webhook = new Webhook(SLACK_WEBHOOK_URL);
webhook.postMessage(message);
```

#### Dependencies
The serialization depends on [Gson](https://github.com/google/gson).
