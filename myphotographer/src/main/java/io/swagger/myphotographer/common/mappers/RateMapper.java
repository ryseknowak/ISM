package io.swagger.myphotographer.common.mappers;

import java.util.List;


import org.mapstruct.Mapper;

import io.swagger.myphotographer.common.domain.RateTO;
import io.swagger.myphotographer.rate.Rate;


@Mapper(componentModel = "spring")
public interface RateMapper {

	Rate rateTO2Rate(RateTO rateTO);

	RateTO rate2RateTO(Rate rate);

	List<Rate> rateTO2Rate(List<RateTO> rateTO);

	List<RateTO> rate2RateTO(List<Rate> rate);
}
