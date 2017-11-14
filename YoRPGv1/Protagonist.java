/**********************************************
Tania Cao, Jerry Ye, Eddie Zhu -- Monster
APCS1 pd1
HW#28
2017-11-08
* class YoRPG -- Driver file for Ye Olde Role Playing Game.
* Simulates monster encounters of a wandering adventurer.
* Required classes: Protagonist, Monster
**********************************************/

public class Protagonist{
    //instance variables
    public String name;
    public int health;
    public int strength;
    public int defense;
    public double attackRating;

    //constructor
    public Protagonist(String newName){
	name = newName;
	health = 125;
	strength = 100;
	defense = 40;
	attackRating = 0.4;
    }

    //returns true if health is above 0
    public boolean isAlive(){
	return (health > 0);
    }
    //returns the defense amount
    public int getDefense(){
	return defense;
    }
    //returns the name
    public String getName(){
	return name;
    }
    //reduces health by the damage taken
    public int lowerHP(int damageTaken){
	return (health - damageTaken);
    }
    //returns the damage done to the monster based on formula
    public int attack(Monster smaug){
	int damageDone = (int)(strength * attackRating) - smaug.getDefense();
	smaug.health -= damageDone;
	return damageDone;
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
