package unit1;/**
 * Created by Administrator on 2021/7/10.
 */

/**
 * @Author liwenming
 * @Description //TODO
 * @Date 2021/7/10 1:37
 **/
public class Movie {

    public static final int CHILDRENS = 2;
    public static final int REGULARS = 0;
    public static final int NEW_RELEASE = 1;

    private String _title;
    private int _priceCode;

    public Movie(String title, int priceCode){
        _title = title;
        _priceCode = priceCode;
    }

    public String get_title() {
        return _title;
    }

    public int get_priceCode() {
        return _priceCode;
    }

    public void set_priceCode(int _priceCode) {
        this._priceCode = _priceCode;
    }
}
