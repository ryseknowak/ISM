package io.swagger.myphotographer.common.mappers;

import java.util.List;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import io.swagger.myphotographer.calendardate.CalendarDate;
import io.swagger.myphotographer.common.domain.CalendarDateTO;

@Mapper (uses = PhotographerMapper.class, componentModel = "spring")
public interface CalendarDateMapper {
	
	CalendarDateMapper INSTANCE = Mappers.getMapper(CalendarDateMapper.class);
	
	CalendarDate calendarDateTO2CalendarDate(CalendarDateTO calendarDateTO);

	CalendarDateTO calendarDate2CalendarDateTO(CalendarDate calendarDate);

	List<CalendarDate> calendarDateTO2CalendarDate(List<CalendarDateTO> calendarDateTO);

	List<CalendarDateTO> calendarDate2CalendarDateTO(List<CalendarDate> calendarDate);
}
