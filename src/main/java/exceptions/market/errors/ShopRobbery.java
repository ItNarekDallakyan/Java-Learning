package exceptions.market.errors;

public class ShopRobbery extends Error { //robbery = koxoput
    private String message;

    public ShopRobbery(String message){
        this.message = message;
    }

    public void message(){
        System.out.println(message);

    }
}
