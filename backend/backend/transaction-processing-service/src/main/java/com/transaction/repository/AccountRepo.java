package com.transaction.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.transaction.model.Account;

@Repository
public interface AccountRepo extends JpaRepository<Account, Long> {
    
}
