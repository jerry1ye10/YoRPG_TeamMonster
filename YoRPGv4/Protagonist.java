/**********************************************
Tania Cao, Jerry Ye, Eddie Zhu -- Monster
APCS1 pd1
HW#28
2017-11-08

**********************************************/

public abstract class Protagonist extends Character{

    //instant variables
    public abstract void normalize ();
    public abstract void specialize ();
    public abstract void about ();

    //constructor
    public Protagonist(String newName){
	name = newName;
	health = 125;
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
