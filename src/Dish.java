public class Dish {
    private int costInCents;
    public int getCostInCents(){
        return costInCents;
    }
    public void setCostInCents(){
        this.costInCents = costInCents;
    }
    private String nameOfDish;
    public String getNameOfDish(){
        return nameOfDish;
    }
    public void setNameOfDish(){
        this.nameOfDish = nameOfDish;
    }
    private Boolean wouldRecommend;
    public Boolean getWouldRecommend(){
        return wouldRecommend;
    }
    public void setWouldRecommend(){
        this.wouldRecommend = wouldRecommend;
    }
    public Dish(){

    }
    public Dish (int costInCents, String nameOfDish, Boolean wouldRecommend){
        this.costInCents = costInCents;
        this.nameOfDish = nameOfDish;
        this.wouldRecommend = wouldRecommend;
    }
    public void printSummary(){
         System.out.printf("cost:" + costInCents + "\nName:" + nameOfDish + "\nRecommended:" + wouldRecommend + "\n");
    }
}
