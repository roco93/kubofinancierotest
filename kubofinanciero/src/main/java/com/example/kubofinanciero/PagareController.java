package com.example.kubofinanciero;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.kubofinanciero.entity.Pagare;
import com.example.kubofinanciero.service.PagareService;

@RestController
@RequestMapping("/pagares")
public class PagareController {
	
	@Autowired
	PagareService pagareService;
	
	@PutMapping("/updateFields")
	public ResponseEntity<Integer> updateFields(){
		int result = pagareService.updateFieldsPagares();
		return new ResponseEntity<Integer>(result,HttpStatus.OK);
	}
	
	@PostMapping("/insertAndValidatePagare")
	public Pagare insertAndValidatePagare(@RequestBody Pagare pagare) {
		return this.pagareService.savePagare(pagare);
	}
}
