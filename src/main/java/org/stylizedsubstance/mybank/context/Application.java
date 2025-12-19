package org.stylizedsubstance.mybank.context;

import org.stylizedsubstance.mybank.service.TransactionService;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.stylizedsubstance.mybank.util.DateTimeUtil;

public class Application {
    public static final TransactionService transactionService = new TransactionService();
    public static final ObjectMapper objectMapper = new ObjectMapper();
    public static final DateTimeUtil dateTimeUtil = new DateTimeUtil();
}