package dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class BookingDTO {

	@Id
	@GeneratedValue
	private int booking_id;
	private String custemer_name;
	private String movie_name;
	private int seat_no;
	private double ticket_price;
	private int no_of_ticket;
	public int getBooking_id() {
		return booking_id;
	}
	public void setBooking_id(int booking_id) {
		this.booking_id = booking_id;
	}
	public String getCustemer_name() {
		return custemer_name;
	}
	public void setCustemer_name(String custemer_name) {
		this.custemer_name = custemer_name;
	}
	public String getMovie_name() {
		return movie_name;
	}
	public void setMovie_name(String movie_name) {
		this.movie_name = movie_name;
	}
	public int getSeat_no() {
		return seat_no;
	}
	public void setSeat_no(int seat_no) {
		this.seat_no = seat_no;
	}
	public double getTicket_price() {
		return ticket_price;
	}
	public void setTicket_price(double ticket_price) {
		this.ticket_price = ticket_price;
	}
	public int getNo_of_ticket() {
		return no_of_ticket;
	}
	public void setNo_of_ticket(int no_of_ticket) {
		this.no_of_ticket = no_of_ticket;
	}

}
