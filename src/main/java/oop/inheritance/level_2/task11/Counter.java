package oop.inheritance.level_2.task11;

public class Counter extends Product{
    public Counter() {
    }

    public Counter(int productionYear, int rebate, String name, int price, String productor) {
        super(productionYear, rebate, name, price, productor);
    }

    public void rebate(){
        if(price > 1000){
            price -= price*30/100;
        }else{
            if(price < 500)
                price += price*30/100;
        }
    }

}
