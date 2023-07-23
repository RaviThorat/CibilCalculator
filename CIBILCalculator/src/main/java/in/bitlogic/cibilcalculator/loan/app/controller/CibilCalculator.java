package in.bitlogic.cibilcalculator.loan.app.controller;

import java.util.Random;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin("*")
@RestController
@RequestMapping("/cibilcalculator")
public class CibilCalculator {
	
	
	@GetMapping("/getCibil/{panCardNo}")
	public Integer getCibil(@PathVariable("panCardNo") String panCardNo)
	{
		if(panCardNo.length()==8)
		{
			return new Random().nextInt(500,900);
		}
		else
			return null;
	}

}
