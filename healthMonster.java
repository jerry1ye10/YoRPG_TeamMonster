public class healthMonster extends Monster{
    public healthMonster(String name){
	super(name);
	health = 500;
	defense = 20;
	attackRating = 1;
	strength = (int)(Math.random() * 45) + 20;
	    }
    public static String about(){
	return "A Monster with a substantial amount of health";
    }
}
