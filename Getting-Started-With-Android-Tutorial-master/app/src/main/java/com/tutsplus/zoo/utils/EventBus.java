package com.tutsplus.zoo.utils;

import com.squareup.otto.Bus;

public class EventBus extends Bus {
    private static final EventBus bus = new EventBus();

    public static Bus getInstance() {
        return bus;
    }

    private EventBus() {

    }
}
