package unit1;/**
 * Created by Administrator on 2021/7/10.
 */

/**
 * @Author liwenming
 * @Description //TODO
 * @Date 2021/7/10 1:41
 **/
public class Rental {

    private Movie _movie;

    private int _daysRented;

    public Rental(Movie movie, int daysRented){
        _movie = movie;
        _daysRented = daysRented;
    }

    public Movie get_movie() {
        return _movie;
    }

    public int get_daysRented() {
        return _daysRented;
    }
}
