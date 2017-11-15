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
        public void specialize(){
	defense = (int)(defense * 0.5);
	attackRating = attackRating * 2;
    }
    //resets defense and attackRating
    public void normalize(){
	defense = 40;
	attackRating = .4;
	   
    
    }
}
