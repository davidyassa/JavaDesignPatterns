/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Structural.Facade.Travel;

/**
 *
 * @author DELL 7550
 */
public class TravelFacade {

    FlightBooking flightBooking;
    TrainBooking trainBooking;
    HotelBooking hotelBooking;

    public enum BookingType {
        Flight,
        Train,
        Hotel,
        Flight_And_Hotel,
        Train_And_Hotel
    }

    public TravelFacade() {
        flightBooking = new FlightBooking();
        trainBooking = new TrainBooking();
        hotelBooking = new HotelBooking();
    }

    public void book(BookingType type, BookingInfo info) {
        switch (type) {
            case Flight ->
                flightBooking.bookFlight(info);
            case Hotel ->
                hotelBooking.bookHotel(info);
            case Train ->
                trainBooking.bookTrain(info);
            case Flight_And_Hotel -> {
                flightBooking.bookFlight(info);
                hotelBooking.bookHotel(info);
            }
            case Train_And_Hotel -> {
                trainBooking.bookTrain(info);
                hotelBooking.bookHotel(info);
            }

            default ->
                throw new IllegalArgumentException();
        }
    }
}
