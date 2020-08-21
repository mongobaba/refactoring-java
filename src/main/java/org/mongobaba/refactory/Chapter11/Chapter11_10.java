package org.mongobaba.refactory.Chapter11;

import java.util.Enumeration;
import java.util.Vector;

/**
 * Form Template Method
 * 塑造模板函数
 */
public class Chapter11_10 {
    static class Movie {
        private String _title;

        public Movie(String title) {
            this._title = title;
        }

        public String getTitle() {
            return _title;
        }
    }

    static class Rental {
        private Movie _movie;

        public Rental(Movie movie) {
            this._movie = movie;
        }

        public Movie getMovie() {
            return _movie;
        }

        public double getCharge() {
            return 10.0;
        }
    }

    static class Customer {
        private String _name;
        private Vector<Object> _rentals = new Vector<>();

        public Customer(String name) {
            this._name = name;
        }

        public String getName() {
            return _name;
        }

        public void addRental(Rental rental) {
            _rentals.add(rental);
        }

        public String statement() {
            Enumeration<Object> rentals = _rentals.elements();
            String result = "Rental Record for " + getName() + "\n";
            while (rentals.hasMoreElements()) {
                Rental each = (Rental) rentals.nextElement();
                // show figures for this rental
                result += "\t" + each.getMovie().getTitle() + "\t" + each.getCharge() + "\n";
            }

            // add footer lines
            result += "Amount owed is " + getTotalCharge() + "\n";
            result += "You earned " + getTotalFrequentRenterPoints() + " frequent renter points";
            return result;
        }

        public String htmlStatement() {
            Enumeration<Object> rentals = _rentals.elements();
            String result = "<H1>Rentals for <EM>" + getName() + "</EM></H1><P>\n";
            while (rentals.hasMoreElements()) {
                Rental each = (Rental) rentals.nextElement();
                // show figures for this rental
                result += each.getMovie().getTitle() + ": " + each.getCharge() + "<BR>\n";
            }

            // add footer lines
            result += "<P>You owed <EM>" + getTotalCharge() + "</EM><P>\n";
            result += "On this rental you earned <EM>" +
                    getTotalFrequentRenterPoints() +
                    "</EM> frequent renter points<P>";
            return result;
        }

        private int getTotalFrequentRenterPoints() {
            return 1;
        }

        private double getTotalCharge() {
            return 10.0;
        }
    }
}
