package org.ericwubbo.archunitdemo.notification.internal;

import java.time.LocalDate;

public record Notification(LocalDate date, NotificationType format, String productName) {
}
