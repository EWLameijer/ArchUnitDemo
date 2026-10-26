package org.ericwubbo.archunitdemo.notification;

import org.ericwubbo.archunitdemo.notification.internal.Notification;
import org.ericwubbo.archunitdemo.notification.internal.NotificationType;

import java.time.LocalDate;

public record NotificationDto(LocalDate date, String format, String productName) {
    Notification toNotification() {
        var notificationType = NotificationType.valueOf(format);
        return new Notification(date, notificationType, productName);
    }
}
