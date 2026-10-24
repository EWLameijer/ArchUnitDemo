package org.ericwubbo.archunitdemo.notification;

import java.time.LocalDate;

public record Notification(LocalDate date, NotificationType format, String productName) {
}
