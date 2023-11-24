package oop.inheritance.level_2.task12;

public class ProductionInfo {
    protected int finishMonth;

    public ProductionInfo() {
    }

    public ProductionInfo(int productionMonth) {
        this.finishMonth = productionMonth;
    }

    public int getProductionMonth() {
        return finishMonth;
    }

    public void setProductionMonth(int productionMonth) {
        this.finishMonth = productionMonth;
    }

    @Override
    public String toString() {
        return "ProductionInfo{" +
                "productionMonth=" + finishMonth +
                '}';
    }
}