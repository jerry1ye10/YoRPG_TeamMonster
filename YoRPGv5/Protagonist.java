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
    public abstract String about ();
    public abstract boolean critAttack();

    //constructor
    public Protagonist(String newName){
	name = newName;
	health = 125;
	strength = 100;
	defense = 40;
	attackRating = 0.4;
    }
}
