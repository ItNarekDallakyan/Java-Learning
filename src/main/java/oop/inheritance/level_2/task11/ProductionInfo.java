package oop.inheritance.level_2.task11;

public class ProductionInfo {
    protected int productionYear;
    protected int rebate;

    public ProductionInfo() {
    }

    public ProductionInfo(int productionYear, int rebate) {
        this.productionYear = productionYear;
        this.rebate = rebate;
    }

    public int getProductionYear() {
        return productionYear;
    }

    public void setProductionYear(int productionYear) {
        this.productionYear = productionYear;
    }

    public int getRebate() {
        return rebate;
    }

    public void setRebate(int rebate) {
        this.rebate = rebate;
    }

    @Override
    public String toString() {
        return "ProductionInfo{" +
                "productionYear=" + productionYear +
                ", rebate=" + rebate +
                '}';
    }
}