package org.mongobaba.refactory.Chapter1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CustomerTest {
    private final Movie childrenMovie = new Movie("Toy Story 2", Movie.CHILDREN);
    private final Movie regularMovie = new Movie("Saving Private Ryan", Movie.REGULAR);
    private final Movie newReleaseMovie = new Movie("Fast & Furious", Movie.NEW_RELEASE);

    @Test
    void statement() {
        Customer customer = new Customer("John");
        customer.addRental(new Rental(childrenMovie, 1));
        customer.addRental(new Rental(childrenMovie, 4));
        customer.addRental(new Rental(regularMovie, 1));
        customer.addRental(new Rental(regularMovie, 3));
        customer.addRental(new Rental(newReleaseMovie, 1));
        customer.addRental(new Rental(newReleaseMovie, 2));
        String expected = "Rental Record for John\n" +
                "\tToy Story 2\t1.5\n" +
                "\tToy Story 2\t3.0\n" +
                "\tSaving Private Ryan\t2.0\n" +
                "\tSaving Private Ryan\t3.5\n" +
                "\tFast & Furious\t3.0\n" +
                "\tFast & Furious\t6.0\n" +
                "Amount owed is 19.0\n" +
                "You earned 7 frequent renter points";
        assertEquals(expected, customer.statement());
    }
}