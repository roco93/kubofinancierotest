package com.example.kubofinanciero.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.kubofinanciero.entity.Pagare;
import com.example.kubofinanciero.repository.PagareRepository;

@Service
public class PagareService {
	@Autowired
	PagareRepository pagareRepository;
	
	public int updateFieldsPagares(){
		return pagareRepository.updateFieldsPagares();
	}
	
	public Pagare savePagare(Pagare pagare){
		// If exist other pagare with the same account, we recover it
		Pagare pagareBefore = pagareRepository.findByCuentaID(pagare.getCuentaID());
		// Insert New Pagare
		Pagare actualPagare = pagareRepository.save(pagare);
		// Update field MontoInversion if exists the same account previously
		if(pagareBefore != null){
			pagareRepository.updateAmountInvestissement(pagareBefore.getMontoInversion() + 
					actualPagare.getSaldoProvision(), actualPagare.getPagareID());
			
		}
		
		return actualPagare;
	}
}
