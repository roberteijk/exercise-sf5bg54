/**
 * Created by Robert van den Eijk on 5-3-2020.
 */

package net.vandeneijk.learn.exercisesf5bg54.controller;

import net.vandeneijk.learn.exercisesf5bg54.service.ChuckNorrisQuoteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class QuoteController {

    private final ChuckNorrisQuoteService chuckNorrisQuoteService;

    @Autowired
    public QuoteController(ChuckNorrisQuoteService chuckNorrisQuoteService) {
        this.chuckNorrisQuoteService = chuckNorrisQuoteService;
    }

    @RequestMapping({"/", ""})
    public String getQuote(Model model) {
        model.addAttribute("joke", chuckNorrisQuoteService.getQuote());
        return "jokes/joke";
    }
}
