package com.example.kubofinanciero.repository;

import com.example.kubofinanciero.entity.Pagare;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface PagareRepository extends CrudRepository<Pagare, Integer>{

	@Query(value = "{call UpdateFieldsPagares()}", nativeQuery = true)
	int updateFieldsPagares();
	
	public abstract Pagare findByCuentaID(Integer cuentaId);
	
	@Query(value = "{update pagares set MontoInversion = : amountInvestissement where PagareID = : pagareID}", nativeQuery = true)
	void updateAmountInvestissement(@Param("amountInvestissement") long amountInvestissement, @Param("pagareID") int pagareID);
}
