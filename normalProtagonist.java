/**********************************************
Tania Cao, Jerry Ye, Eddie Zhu -- Monster
APCS1 pd1
HW#28
2017-11-08

**********************************************/

public class normalProtagonist extends Character{


    //constructor
    public normalProtagonist(String newName){
	name = newName;
	health = 125;
	strength = 100;
	defense = 40;
	attackRating = 0.4;
    }

    public String about(){
	return "A normal protagonist";
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
