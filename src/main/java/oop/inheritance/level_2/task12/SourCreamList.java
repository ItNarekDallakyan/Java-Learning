package oop.inheritance.level_2.task12;

public class SourCreamList extends SourCream{
    private SourCream sourCreams[]= {
            new SourCream("Marianna",2,3),
            new SourCream("Ashtarak",2,2),
            new SourCream("Chanax",4,3),
            new SourCream("Ani",2,3),
    };

    public void counterOverdue(){
    for (SourCream sourCream:sourCreams) {
        if(sourCream.finishMonth - sourCream.productionMonth < 0){
            System.out.println(sourCream);
        }
    }
}

}