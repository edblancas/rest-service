package example;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MoviesController {

    @RequestMapping(value="/movies", method = RequestMethod.GET)
    public Movie[] movies() {
        return new Movie[]{
                new Movie(0, "Episode I – The Phantom Menace (1999)"),
                new Movie(1, "Star Wars II – Attack of the Clones (2002)"),
                new Movie(2, "Star Wars II – Revenge of the Sith (2005)"),
                new Movie(3, "Star Wars IV – A New Hope (1977)"),
                new Movie(4, "Star Wars V – The Empire Strikes Back (1980)"),
                new Movie(5, "Star Wars VI – Return of the Jedi (1983)"),
                new Movie(7, "Star Wars VII – The Force Awakens (2015)"),
        };
    }
}
