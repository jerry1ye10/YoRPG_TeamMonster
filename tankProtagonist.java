public class tankProtagonist extends Character{


    //constructor
    public tankProtagonist(String newName){
	name = newName;
	health = 300;
	strength = 100;
	defense = 40;
	attackRating = 0.4;
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
