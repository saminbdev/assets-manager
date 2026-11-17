import java.math.BigDecimal;

public class Asset {
    String description;
    String dateAcquired;
    int originalCost;

    public Asset(String description, String dateAcquired, int originalCost) {
        this.description = description;
        this.dateAcquired = dateAcquired;
        this.originalCost = originalCost;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDateAcquired() {
        return dateAcquired;
    }

    public void setDateAcquired(String dateAcquired) {
        this.dateAcquired = dateAcquired;
    }

    public int getOriginalCost() {
        return originalCost;
    }

    public void setOriginalCost(int originalCost) {
        this.originalCost = originalCost;
    }

    public BigDecimal getValue() {
        return BigDecimal.valueOf(originalCost);
    }

}
