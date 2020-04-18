package io.swagger.myphotographer.rate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import io.swagger.myphotographer.common.domain.RateTO;
import io.swagger.myphotographer.common.mappers.RateMapper;

@Service
public class RateService {
	
	private RateRepository rateRepository;
	private RateMapper rateMapper;
	
	@Autowired
	public RateService(RateRepository rateRepository, RateMapper rateMapper) {
		this.rateRepository = rateRepository;
		this.rateMapper = rateMapper;
	}
	
	public RateTO addRate(RateTO rate) {
		return rateMapper.rate2RateTO(rateRepository.save(rateMapper.rateTO2Rate(rate)));
	}
	
	public RateTO getRate(long id) {
		return rateMapper.rate2RateTO(rateRepository.getOne(id));
	}
}
