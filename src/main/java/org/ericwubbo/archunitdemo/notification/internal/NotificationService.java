package org.ericwubbo.archunitdemo.notification;

import lombok.extern.slf4j.Slf4j;
import org.ericwubbo.archunitdemo.notification.internal.Notification;
import org.springframework.modulith.events.ApplicationModuleListener;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class NotificationService {
    @ApplicationModuleListener
    public void notificationEvent(NotificationDto event) {
        Notification notification = event.toNotification();
        log.info("Received notification by event for product {} in date {} by {}.",
                notification.productName(),
                notification.date(),
                notification.format());
    }
}