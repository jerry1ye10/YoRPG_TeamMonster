public class healthMonster extends Character{
    public healthMonster(){
	health = 500;
	defense = 20;
	attackRating = 1;
	strength = (int)(Math.random() * 45) + 20;
	    }
    public String about(){
	return "A Monster with a substantial amount of health";
    }
}
