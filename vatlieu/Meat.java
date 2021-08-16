package vatlieu;

import java.time.LocalDate;

public class Meat extends Material {
    protected double weight;

    public Meat() {
    }

    public Meat(double weight) {
        this.weight = weight;
    }

    public Meat(String id, String name, int cost, LocalDate manufacturing, double weight) {
        super(id, name, cost, manufacturing);
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public double getAmount() {
        return weight * cost;
    }

    @Override
    public LocalDate getExpiryDate() {
        return manufacturing.plusDays(7);
    }

    @Override
    public int getRealMoney() {
            LocalDate currentDate = LocalDate.now();
            int Monney = (int) (getAmount() - getAmount() * 0.1);
            if (getExpiryDate().isAfter(currentDate.plusDays(3))) {
                Monney = (int) (Monney - Monney * 0.5);
            } else if (getExpiryDate().isAfter(currentDate.plusDays(5))) {
                Monney = (int) (Monney - Monney * 0.3);
            }
            return Monney;
        }

        @Override
        public String toString () {
            return "Meat{" +
                    "id='" + id + '\'' +
                    ", name='" + name + '\'' +
                    ", manufacturing=" + manufacturing +
                    ", cost=" + cost +
                    ", weight=" + weight +
                    '}';
        }
    }
