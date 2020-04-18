package io.swagger.myphotographer.common.mappers;

import java.util.List;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import io.swagger.myphotographer.common.domain.RequestTO;
import io.swagger.myphotographer.request.Request;


@Mapper(uses = {PhotographerMapper.class, UserMapper.class}, componentModel = "spring")
public interface RequestMapper {

	RequestMapper INSTANCE = Mappers.getMapper(RequestMapper.class);
	
	Request requestTO2Request(RequestTO requestTO);

	RequestTO request2RequestTO(Request request);

	List<Request> requestTO2Request(List<RequestTO> requestTO);

	List<RequestTO> request2RequestTO(List<Request> request);
}
