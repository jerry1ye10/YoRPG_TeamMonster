public class damageProtagonist extends Protagonist{


    //constructor
    public damageProtagonist(String newName){
	super(newName);
	health = 125;
	strength = 150;
	defense = 40;
	attackRating = 0.6;
    }
    public String about(){
	return "A Protagonist with extra high attack damage";
    }
}
