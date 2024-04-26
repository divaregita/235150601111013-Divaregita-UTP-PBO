public class User {
    
    private String email;
    private String password;
    private String fullName;
    private double balance;
    private Ticket[] ticketList;
    private int MAXTICKET;

public User(String email, String password, String fullName, double balance, Ticket[] ticketList) {
    this.email = email;
    this.password = password;
    this.fullName = fullName;
    this.balance = balance;
    this.ticketList = ticketList;
    }

public boolean addTicket(Ticket Ticket) {
    return addTicket;
}
public void displayAllTicket() {
    return displayAllTicket;
}
public boolean isMatch(email String, password String) {
    return isMatch;
}
public String getEmail() {
    return getEmail;
}
public String getPassword() {
    return getPassword;
}
public String FullName() {
    return fullName;
}
public double getBalance() {
    return getBalance;
}
public void setBalance(balance ){
    return setBalance;
}
}
