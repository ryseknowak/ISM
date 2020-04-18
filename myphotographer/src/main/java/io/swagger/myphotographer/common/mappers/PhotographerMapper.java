package io.swagger.myphotographer.common.mappers;

import java.util.List;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import io.swagger.myphotographer.common.domain.PhotographerTO;
import io.swagger.myphotographer.photographer.Photographer;

@Mapper(componentModel = "spring")
public interface PhotographerMapper {

	PhotographerMapper INSTANCE = Mappers.getMapper(PhotographerMapper.class);
	
	Photographer photographerTO2Photographer(PhotographerTO photographerTO);

	PhotographerTO photographer2PhotographerTO(Photographer photographer);

	List<Photographer> photographerTO2Photographer(List<PhotographerTO> photographerTO);

	List<PhotographerTO> photographer2PhotographerTO(List<Photographer> photographer);
}
