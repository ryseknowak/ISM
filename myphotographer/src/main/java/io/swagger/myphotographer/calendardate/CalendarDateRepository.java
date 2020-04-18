package io.swagger.myphotographer.calendardate;

import org.springframework.stereotype.Repository;

@Repository
public interface CalendarDateRepository {

	public CalendarDate getCalendarDateById(Long id);
}
