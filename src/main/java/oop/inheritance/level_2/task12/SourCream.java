package oop.inheritance.level_2.task12;

public class SourCream extends ProductionInfo{
    protected String name;
    protected int productionMonth;

    public SourCream() {
    }

    public SourCream(String name,int productionMonth,  int finishedMonth) {
        super(finishedMonth);
        this.name = name;
        this.productionMonth = productionMonth;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int getProductionMonth() {
        return productionMonth;
    }

    @Override
    public void setProductionMonth(int productionMonth) {
        this.productionMonth = productionMonth;
    }

    @Override
    public String toString() {
        return name + " " + productionMonth +
                " " + finishMonth ;
    }
}
