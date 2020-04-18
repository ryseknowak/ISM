package io.swagger.myphotographer.rate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.myphotographer.common.domain.RateTO;

@RestController
public class RateController {

	@Autowired
	private RateService rateService;
	
	@GetMapping("/rate/{id}")
	public ResponseEntity<RateTO> getRateById(@PathVariable long id){
		return new ResponseEntity<>(rateService.getRate(id), HttpStatus.OK);
	}
	
	@PostMapping("/rate")
	public ResponseEntity<RateTO> addRate(@RequestBody RateTO rateTO){
		return new ResponseEntity<>(rateService.addRate(rateTO), HttpStatus.OK);
	}
}
