public class superProtagonist extends Protagonist{
    public superProtagonist(String name){
	super(name);
	health = 100000;
        defense = 10000;
	strength = 100000;
    }
    public String about(){
	return "This is the strongest possible class of Protagonist";
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
	
