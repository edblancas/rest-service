package example;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MoviesController {

    @RequestMapping(value="/movies", method = RequestMethod.GET)
    public Movie[] movies() {
        return new Movie[]{
                new Movie(0, "Star Wars I"),
                new Movie(1, "Star Wars II"),
                new Movie(1, "Star Wars III")
        };
    }
}
