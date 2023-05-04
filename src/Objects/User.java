package Objects;

import java.util.ArrayList;
import java.util.List;

public class Patron {

    private String id;
    private String name;
    private int maxItems;
    private String category;
    private String email;
    private List<Loan> loans = new ArrayList<Loan>();

    public Patron(String id, String name, int maxItems, String category, String email) {
        this.id = id;
        this.name = name;
        this.maxItems = maxItems;
        this.category = category;
        this.email = email;
    }

    public void addLoan(Loan loan) {
        this.loans.add(loan);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMaxItems() {
        return maxItems;
    }

    public void setMaxItems(int maxItems) {
        this.maxItems = maxItems;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}

