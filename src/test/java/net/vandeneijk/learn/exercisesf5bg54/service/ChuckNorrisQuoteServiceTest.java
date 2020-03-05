package net.vandeneijk.learn.exercisesf5bg54.service;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

class ChuckNorrisQuoteServiceTest {

    private QuoteService quoteService;

    @BeforeEach
    void setUp() {
        quoteService = new ChuckNorrisQuoteService();
    }

    @Test
    void getQuote() {
        String quote = quoteService.getQuote();
        assertTrue(quote != null && quote.length() > 0);
    }
}