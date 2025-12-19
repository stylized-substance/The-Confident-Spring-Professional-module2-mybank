package org.stylizedsubstance.mybank.service;

import org.stylizedsubstance.mybank.model.Transaction;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class TransactionService {
    List<Transaction> transactions = new CopyOnWriteArrayList<>();

    public List<Transaction> findAll() {
        return transactions;
    }

    public Transaction create(int amount, String reference) {
        Transaction transaction = new Transaction(amount, reference);
        transactions.add(transaction);
        return transaction;

    }
}