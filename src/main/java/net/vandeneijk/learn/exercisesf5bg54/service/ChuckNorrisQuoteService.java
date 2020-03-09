/**
 * Created by Robert van den Eijk on 5-3-2020.
 */

package net.vandeneijk.learn.exercisesf5bg54.service;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.stereotype.Service;

@Service
public class ChuckNorrisQuoteService implements QuoteService {

    private final ChuckNorrisQuotes chuckNorrisQuotes;

    public ChuckNorrisQuoteService(ChuckNorrisQuotes chuckNorrisQuotes) {
        this.chuckNorrisQuotes = chuckNorrisQuotes;
    }

    @Override
    public String getQuote() {
        return chuckNorrisQuotes.getRandomQuote();
    }
}
