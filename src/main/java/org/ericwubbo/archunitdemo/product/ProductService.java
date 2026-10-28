package org.ericwubbo.archunitdemo.product;

import lombok.RequiredArgsConstructor;
import org.ericwubbo.archunitdemo.notification.NotificationDto;
import org.ericwubbo.archunitdemo.notification.NotificationService;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Service;

import java.time.LocalDate;

@Service
@RequiredArgsConstructor
public class ProductService {
    private final NotificationService notificationService;
    private final ApplicationEventPublisher events;

    public void create(String productName, String productDescription, int productPrice) {
        events.publishEvent(new NotificationDto(LocalDate.now(), "SMS", productName));
    }
}