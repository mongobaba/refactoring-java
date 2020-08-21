package org.mongobaba.refactory.Chapter11;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.mongobaba.refactory.Chapter11.Chapter11_10.*;

class Chapter11_10Test {
    private Movie movie;
    private Rental rental;
    private Customer customer;

    @BeforeEach
    void init() {
        movie = new Movie("Fast & Furious");
        rental = new Rental(movie);
        customer = new Customer("Tabor");
        customer.addRental(rental);
    }

    @Test
    void statement() {
        String expected =
                "Rental Record for Tabor\n" +
                "\tFast & Furious\t10.0\n" +
                "Amount owed is 10.0\n" +
                "You earned 1 frequent renter points";
        assertEquals(expected, customer.statement());
    }

    @Test
    void htmlStatement() {
        String expected =
                "<H1>Rentals for <EM>Tabor</EM></H1><P>\n" +
                "Fast & Furious: 10.0<BR>\n" +
                "<P>You owed <EM>10.0</EM><P>\n" +
                "On this rental you earned <EM>1</EM> frequent renter points<P>";
        assertEquals(expected, customer.htmlStatement());
    }
}