package Logging;

import java.net.URI;
import java.net.URL;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.logging.LogRecord;
import java.util.logging.StreamHandler;

public class TelegramAlarmHandler extends StreamHandler {

    public TelegramAlarmHandler(){
        super.setFilter(new TelegramAlarmFilter());
        super.setFormatter(new TelegramAlarmFormatter());
    }

    @Override
    public void publish(LogRecord record) {
        if (isLoggable(record)) {
            try {
                String bodyMessage = """
                        {
                            "chat_id":"%s",
                            "text":"%s"
                        }""".formatted(Secrets.chatId, getFormatter().format(record));
                HttpClient httpClient = HttpClient.newHttpClient();
                HttpRequest request = HttpRequest.newBuilder()
                        .POST(HttpRequest.BodyPublishers.ofString(bodyMessage))
                        .uri(URI.create(Secrets.sendMessage))
                        .header("Content-Type", "application/json").build();
                httpClient.send(request, HttpResponse.BodyHandlers.ofString());

                // to telegram send
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    @Override
    public boolean isLoggable(LogRecord record) {
        return getFilter().isLoggable(record);
    }
}
