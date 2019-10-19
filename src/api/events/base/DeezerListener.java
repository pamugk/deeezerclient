package api.events.base;

import api.events.base.DeezerEvent;

import java.util.function.Consumer;

public class DeezerListener<T extends DeezerEvent> {
    private final Consumer<T> eventConsumer;

    public DeezerListener(Consumer<T> eventConsumer) {
        this.eventConsumer = eventConsumer;
    }

    void invoke(T invokedEvent) {
        eventConsumer.accept(invokedEvent);
    }
}
