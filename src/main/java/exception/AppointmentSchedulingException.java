package exception;

public class AppointmentSchedulingException extends RuntimeException {
  public AppointmentSchedulingException(String message) {
    super(message);
  }
}
