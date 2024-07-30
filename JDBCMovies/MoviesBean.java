package JDBCMovies;

import javax.print.DocFlavor.STRING;

public class MoviesBean {

    int movieId;
    STRING movieName;
    int movieReleasedYear;
    public int getMovieId() {
        return movieId;
    }
    public void setMovieId(int movieId) {
        this.movieId = movieId;
    }
    public STRING getMovieName() {
        return movieName;
    }
    public void setMovieName(String string) {
        this.movieName = string;
    }
    public int getMovieReleasedYear() {
        return movieReleasedYear;
    }
    public void setMovieReleasedYear(int movieReleasedYear) {
        this.movieReleasedYear = movieReleasedYear;
    }
    
}
