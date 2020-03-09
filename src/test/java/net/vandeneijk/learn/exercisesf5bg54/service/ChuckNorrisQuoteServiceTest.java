package net.vandeneijk.learn.exercisesf5bg54.service;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

class ChuckNorrisQuoteServiceTest {

    private QuoteService quoteService;

    @BeforeEach
    void setUp() {
        quoteService = new ChuckNorrisQuoteService(new ChuckNorrisQuotes());
    }

    @Test
    void getQuote() {
        String quote = quoteService.getQuote();
        assertTrue(quote != null && quote.length() > 0);
    }
}