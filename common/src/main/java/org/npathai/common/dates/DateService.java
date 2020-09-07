package org.npathai.common.dates;

import java.time.ZonedDateTime;

public class DateService implements IDateService {

    @Override
    public ZonedDateTime getTime() {
        return ZonedDateTime.now();
    }
}
