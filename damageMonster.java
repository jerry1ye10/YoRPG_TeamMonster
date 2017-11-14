public class damageMonster extends Character{

    //constructor
    public damageMonster(){
	health = 150;
	defense = 20;
	attackRating = 1;
	strength = (int)(Math.random() * 60) + 50;
    }
    //about
    public String about(){
	return "A monster that has incredibly high attack damage";
    }
    
}
