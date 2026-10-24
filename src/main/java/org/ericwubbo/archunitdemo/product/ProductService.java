package org.ericwubbo.archunitdemo.product;

import org.ericwubbo.archunitdemo.notification.NotificationService;
import org.ericwubbo.archunitdemo.notification.internal.Notification;
import org.ericwubbo.archunitdemo.notification.internal.NotificationType;
import org.ericwubbo.archunitdemo.product.internal.Product;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Service;

import java.time.LocalDate;

@Service
public class ProductService {

    private final NotificationService notificationService;
    private final ApplicationEventPublisher events;

    public ProductService(ApplicationEventPublisher events, NotificationService notificationService) {
        this.events = events;
        this.notificationService = notificationService;
    }

    public void create(Product product) {
        notificationService.createNotification(new Notification(LocalDate.now(), NotificationType.SMS, product.getName()));
    }
}