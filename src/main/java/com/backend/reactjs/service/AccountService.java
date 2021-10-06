package com.backend.reactjs.service;


import java.util.List;

import com.backend.reactjs.entity.Account;
import com.backend.reactjs.entity.Department;
import com.backend.reactjs.entity.Position;
import com.backend.reactjs.form.AccountFormForCreating;
import com.backend.reactjs.form.AccountFormForUpdating;
import com.backend.reactjs.repository.IAccountRepository;
import com.backend.reactjs.repository.IDepartmentRepository;
import com.backend.reactjs.repository.IPossitionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class AccountService implements IAccountService {
    @Autowired
    private IAccountRepository accountRepository;
    @Autowired
    private IDepartmentRepository departmentRepository;
    @Autowired
    private IPossitionRepository possitionRepository;

    @Override
    public List<Account> getAllAccount() {
        // TODO Auto-generated method stub
        return accountRepository.findAll();
    }

    @Override
    public Account getAccountById(short id) {
        // TODO Auto-generated method stub
        return accountRepository.getById(id);
    }

    @Override
    public void deleteAccount(short id) {
        accountRepository.deleteById(id);

    }

    @Override
    public void createAccount(AccountFormForCreating form) {
        Account account = new Account();
        Department department = departmentRepository.getById(form.getDepartmentId());
        Position position = possitionRepository.getById(form.getPositionId());
        account.setEmail(form.getEmail());
        account.setUsername(form.getUsername());
        account.setFullname(form.getFullname());
        account.setDepartment(department);
        account.setPosition(position);
        accountRepository.save(account);
    }

    @Override
    public void updateAccount(short id, AccountFormForUpdating form) {
        Account account = accountRepository.getById(id);
        Department department = departmentRepository.getById(form.getDepartmentId());
        Position position = possitionRepository.getById(form.getPositionId());
        account.setFullname(form.getFullname());
        account.setDepartment(department);
        account.setPosition(position);
        accountRepository.save(account);
    }

}


