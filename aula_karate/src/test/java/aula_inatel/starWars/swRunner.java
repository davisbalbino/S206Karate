package aula_inatel.starWars;

import com.intuit.karate.junit5.Karate;


public class swRunner {
    @Karate.Test
    Karate testStarWars() {
        return Karate.run("starWars").relativeTo(getClass());
    }    

}

