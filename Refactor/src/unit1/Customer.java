package unit1;/**
 * Created by Administrator on 2021/7/10.
 */

import java.util.Enumeration;
import java.util.Vector;

/**
 * @Author liwenming
 * @Description //TODO
 * @Date 2021/7/10 1:44
 **/
public class Customer {

    private String _name;

    private Vector _rentals = new Vector();

    public Customer(String name){
        _name = name;
    }

    public void addRental(Rental arg){
        _rentals.addElement(arg);
    }

    public String get_name() {
        return _name;
    }

    public String statement(){
        double totalAmount = 0;
        int frequentRenterPoints = 0;
        Enumeration rentals = _rentals.elements();
        String result = "Rental Record for " + get_name() + "\n";
        while (rentals.hasMoreElements()){
            double thisAmount = 0;
            Rental each = (Rental) rentals.nextElement();
            switch (each.get_movie().get_priceCode()){
                case Movie.REGULARS:
                    thisAmount += 2;
                    if(each.get_daysRented() > 2){
                        thisAmount += (each.get_daysRented() - 2) * 1.5;
                    }
                    break;
                case Movie.NEW_RELEASE:
                    thisAmount += each.get_daysRented() * 3;
                    break;
                case Movie.CHILDRENS:
                    thisAmount += 1.5;
                    if(each.get_daysRented() > 3){
                        thisAmount += (each.get_daysRented() - 3) * 1.5;
                    }
                    break;
            }
            frequentRenterPoints ++;
            if (each.get_movie().get_priceCode() == Movie.NEW_RELEASE && each.get_daysRented() > 1){
                frequentRenterPoints ++;
            }
            result += "\t" + each.get_movie().get_title() + "\t" + String.valueOf(thisAmount) + "\n";
            totalAmount += totalAmount;
        }
        result += "Amout owed is" + String.valueOf(totalAmount) + "\n";
        result += "You earned " + String.valueOf(frequentRenterPoints) + " frequent renter points";
        return result;
    }
}
