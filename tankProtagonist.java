public class tankProtagonist extends Protagonist{


    //constructor
    public tankProtagonist(String newName){
	super(newName); 
	health = 500;
	strength = 100;
	defense = 40;
	attackRating = 0.4;
    }
    public String about(){
	return "A Protagonist with a substantial amount of health";
    }   
}
