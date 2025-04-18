package org.example.modules;

import com.google.gson.Gson;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;

public class Payloadmanager {
    Gson gson;
    public String createPayloadbooking(){
        RequestSpecification requestSpecification;
        ValidatableResponse validatableResponse;
        @Test
        public void test_creat_booking_postive(){
            Booking booking=new Booking();
            booking.setFirstname("Jime");
            booking.setLastname("brown");
            booking.setTotalprice(112);
            booking.setDepositpaid(true);

            BookingDates bookingDates=new BookingDates();
            bookingDates.setCheckin("2024-01-01");
            bookingDates.setCheckout("2024-02-01");
//    bookingDates.setBookingDates(bookingdates);
            bookingDates.setAdditionalProperty("breakfast","hello");
            System.out.println(booking);
            Gson gson=new Gson();
            String jsonstring=gson.toJson(booking);
            System.out.println(jsonstring);
return jsonstring;
    }
}
