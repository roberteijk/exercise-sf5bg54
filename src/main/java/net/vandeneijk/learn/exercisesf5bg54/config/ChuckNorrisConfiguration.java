/**
 * Created by Robert van den Eijk on 9-3-2020.
 */

package net.vandeneijk.learn.exercisesf5bg54.config;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;

//@Configuration
public class ChuckNorrisConfiguration {

//    @Bean
    public ChuckNorrisQuotes chuckNorrisQuotes() {
        return new ChuckNorrisQuotes();
    }
}
