package hotelManagement;

public interface Calculator <T extends Number> {
    
    double calculateFees(T clubID);
    
}
