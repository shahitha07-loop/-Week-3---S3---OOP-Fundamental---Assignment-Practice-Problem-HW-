class HallTicket {
    String studentName;
    int seatNumber;

    // Constructor to initialize studentName and seatNumber
    public HallTicket(String studentName, int seatNumber) {
        this.studentName = studentName;
        this.seatNumber = seatNumber;
    }
}

public class HallTicketTest {
    public static void main(String[] args) {
        // Create initial HallTicket object for Priya
        HallTicket priya = new HallTicket("Priya", 0);

        // Assign second variable to point to the same object
        HallTicket copy = priya;

        // Change seatNumber through the second variable
        copy.seatNumber = 45;

        // Print seatNumber as seen through the first variable
        System.out.println("Priya's seatNumber (via first variable): " + priya.seatNumber);

        // Check reference equality between copy and priya
        System.out.println("copy == priya: " + (copy == priya));

        // Create a third, separate object with identical field values
        HallTicket separate = new HallTicket("Priya", 45);

        // Check reference equality between separate and priya
        System.out.println("separate == priya: " + (separate == priya));
    }
}