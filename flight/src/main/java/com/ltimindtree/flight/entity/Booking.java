package main.java.com.ltimindtree.flight.entity;

public class Booking {
    private String bookingId;
    private String flightNumber;
    private String username;

    public Booking() {
    }

    public Booking(String bookingId, String flightNumber, String username) {
        this.bookingId = bookingId;
        this.flightNumber = flightNumber;
        this.username = username;
    }

    public String getBookingId() {
        return bookingId;
    }

    public void setBookingId(String bookingId) {
        this.bookingId = bookingId;
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(String flightNumber) {
        this.flightNumber = flightNumber;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
