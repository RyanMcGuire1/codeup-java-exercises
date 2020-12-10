public class DishTest {
    public static void main(String[] args){
//        Dish dish1 = new Dish();
//        dish1.setCostInCents();
//        dish1.setNameOfDish("Burger Combo") ;
//        dish1.wouldRecommend = true;
//        dish1.printSummary();
//        DishTools.ShoutDishName(dish1);
//        DishTools.analyzeDishCost(dish1);
//        DishTools.flipRecommendation(dish1);
        Dish dish1 = new Dish(500, "Turkey Burger", false);
        dish1.printSummary();
        DishTools.ShoutDishName(dish1);
        System.out.println(dish1.getNameOfDish());
    }
}
