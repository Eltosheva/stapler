package exception;

public class AppointmentOverlappingException extends RuntimeException {
  public AppointmentOverlappingException(String message) {
    super(message);
  }
}