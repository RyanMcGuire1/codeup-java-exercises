public class DishTools {

    public static int AverageCostOfDishInCents = 1300;
    public static void ShoutDishName (Dish dish){
        System.out.println(dish.getNameOfDish().toUpperCase());
    }
    public static void analyzeDishCost(Dish dish){
        if(AverageCostOfDishInCents > dish.getCostInCents()){
            System.out.println("Less expensive than average");
        } else {
                System.out.println("More expensive than average");
        }
    }
    public static void flipRecommendation(Dish dish){
        System.out.println(!dish.getWouldRecommend());
    }
}
