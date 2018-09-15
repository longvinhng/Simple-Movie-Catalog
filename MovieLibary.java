import java.util.ArrayList;

/**
 * A movie catalog to store movies created using java ArrayList
 * 
 * @author Andy Nguyen
 * @version 9.14.2018
 */
public class MovieLibary
{
    private ArrayList<Movie> movies; //array of movies

    /**
     * Default constructors
     */
    public MovieLibary()
    {
        movies = new ArrayList<Movie>(); // create an empty list
    }

    /**
     * Add new movie into the movies list
     */
    void addMovie(String aTitle, int aYear, int aStarRating)
    {
        Movie movie; // variable to hold new movie
        
        // create new movie
        movie = new Movie(aTitle, aYear, aStarRating);
        
        //add movie the that movies list
        movies.add(movie);       
    }
       
    /**
     * Print out the number of movie inside the movies list
     */
    void getNumberOfMovies()
    {
        System.out.println("The list of movies has " + movies.size() + " movies");
    }
    
    /**
     * Print out movie detail of all movie inside the movies list
     */
    void printMovies()
    {
        int numMovies; // number of movies
        
        numMovies = movies.size();
        
        System.out.println();
        System.out.println("#################"); // begin printing movie output
        
        // print out movie information for all movie inside movies list
        // out put "No movies in the library" mess if there is no movie in
        // the movies list
        
        if( numMovies == 0)
        {
            System.out.println("No movies in the library");
        }
        else
        {
            // print out of information of movies inside the movie list
            for(Movie movie : movies)
            {
                movie.printMovieInfo();
            }
        }
        
        System.out.println("#################"); //ending printing movie output
        System.out.println();
    }
}
