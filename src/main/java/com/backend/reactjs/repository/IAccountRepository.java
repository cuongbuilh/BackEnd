package com.backend.reactjs.repository;


import com.backend.reactjs.entity.Account;
import org.springframework.data.jpa.repository.JpaRepository;


public interface IAccountRepository extends JpaRepository<Account, Short> {

}


