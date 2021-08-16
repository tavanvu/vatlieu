package vatlieu;

import java.time.LocalDate;

public abstract class Material implements Discount {
    protected String id, name;
    protected int cost;
    protected LocalDate manufacturing;

    public Material() {
    }

    public Material(String id, String name, int cost, LocalDate manufacturing) {
        this.id = id;
        this.name = name;
        this.cost = cost;
        this.manufacturing = manufacturing;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public LocalDate getManufacturing() {
        return manufacturing;
    }

    public void setManufacturing(LocalDate manufacturing) {
        this.manufacturing = manufacturing;
    }

    public abstract double getAmount();

    public abstract LocalDate getExpiryDate();

    @Override
    public String toString() {
        return "Material{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", manufacturing=" + manufacturing +
                ", cost=" + cost +
                '}';
    }
}
