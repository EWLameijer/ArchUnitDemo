package org.ericwubbo.archunitdemo.notification;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class NotificationService {
    public void createNotification(NotificationDto notificationDto) {
        var notification = notificationDto.toNotification();
        log.info("Received notification by module dependency for product {} in date {} by {}.",
                notification.productName(),
                notification.date(),
                notification.format());
    }
}