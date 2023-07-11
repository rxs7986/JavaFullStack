package backend.Threads;

class TicketBookingSystem {
    private int availableTickets;

    public TicketBookingSystem(int totalTickets) {
        availableTickets = totalTickets;
    }

    public synchronized void bookTicket(String threadName, int numTickets) {
        if (availableTickets >= numTickets) {
            System.out.println(threadName + " successfully booked " + numTickets + " ticket(s).");
            availableTickets -= numTickets;
        } else {
            System.out.println(threadName + " failed to book " + numTickets + " ticket(s). Not enough tickets available.");
        }
    }
}

class BookingThread extends Thread {
    private TicketBookingSystem bookingSystem;
    private int numTickets;

    public BookingThread(TicketBookingSystem system, int tickets) {
        bookingSystem = system;
        numTickets = tickets;
    }

    public void run() {
        String threadName = Thread.currentThread().getName();
        bookingSystem.bookTicket(threadName, numTickets);
    }
}

public class TicketSystem {
    public static void main(String[] args) {
        int totalTickets = 7;
        TicketBookingSystem bookingSystem = new TicketBookingSystem(totalTickets);

        BookingThread thread1 = new BookingThread(bookingSystem, 3);
        BookingThread thread2 = new BookingThread(bookingSystem, 5);
        BookingThread thread3 = new BookingThread(bookingSystem, 4);

        thread1.start();
        thread2.start();
        thread3.start();
    }
}
