package vatlieu;

import java.time.LocalDate;

public class CrispyFlour extends Material {
    private int quantity;

    public CrispyFlour() {
    }

    public CrispyFlour(int quantity) {
        this.quantity = quantity;
    }

    public CrispyFlour(String id, String name, int cost, LocalDate manufacturing, int quantity) {
        super(id, name, cost, manufacturing);
        this.quantity = quantity;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public double getAmount() {
        return quantity * cost;
    }

    @Override
    public LocalDate getExpiryDate() {
        return manufacturing.plusDays(365);
    }

    @Override
    public int getRealMoney() {
        LocalDate currentDate = LocalDate.now();
        int Money = (int) (getAmount() - getAmount() * 0.05);
        if (getExpiryDate().isAfter(currentDate.plusMonths(2))) {
            Money = (int) (Money - Money * 0.4);
        } else if (getExpiryDate().isAfter(currentDate.plusMonths(4))) {
            Money = (int) (Money - Money * 0.2);
        }
        return Money;
    }

    @Override
    public String toString() {
        return "CrispyFlour{" +
                "quantity=" + quantity +
                ", id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", manufacturing=" + manufacturing +
                ", cost=" + cost +
                '}';
    }
}
