package io.swagger.myphotographer.common.mappers;

import java.util.List;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import io.swagger.myphotographer.common.domain.PhotoTO;
import io.swagger.myphotographer.photo.Photo;


@Mapper(uses = PhotographerMapper.class, componentModel = "spring")
public interface PhotoMapper {

	PhotoMapper INSTANCE = Mappers.getMapper(PhotoMapper.class);
	
	Photo photoTO2Photo(PhotoTO photoTO);

	PhotoTO photo2PhotoTO(Photo photo);

	List<Photo> photoTO2Photo(List<PhotoTO> photoTO);

	List<PhotoTO> photo2PhotoTO(List<Photo> photo);
}
