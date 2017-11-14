public class tankProtagonist extends Character{


    //constructor
    public tankProtagonist(String newName){
	name = newName;
	health = 500;
	strength = 100;
	defense = 40;
	attackRating = 0.4;
    }
    public String about(){
	return "A Protagonist with a substantial amount of health";
    }
    //decrease defense, increase attackRating
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
