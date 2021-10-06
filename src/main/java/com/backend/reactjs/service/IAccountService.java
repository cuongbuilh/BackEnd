package com.backend.reactjs.service;

import com.backend.reactjs.entity.Account;
import com.backend.reactjs.form.AccountFormForCreating;
import com.backend.reactjs.form.AccountFormForUpdating;

import java.util.List;



public interface IAccountService {
    public List<Account> getAllAccount();

    public Account getAccountById(short id);
    //
//	public Account getAccountByName(String name);
//
    public void createAccount(AccountFormForCreating form);

    public void updateAccount(short id, AccountFormForUpdating form);

    public void deleteAccount(short id);
//
//	public boolean isAccountExistsByID(short id);
//
//	public boolean isAccountExistsByName(String name);
}

