public class Expense {
    private final String description;
    private final double amount;
    private final String category;
    
    public Expense(String description, double amount, String category) {
        this.description = description;
        this.amount = amount;
        this.category = category;
    }

    // The expense class overrides the toString() method from the Object class.
    // Provides a string representation of the Expense object.
    // Useful for debugging.
    @Override
    public String toString() {
        return "Expense: " + description + ", Amount: $" + amount + ", Category: " + category;
    }
}
