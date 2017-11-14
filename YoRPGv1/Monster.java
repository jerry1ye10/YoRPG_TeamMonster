/**********************************************
Tania Cao, Jerry Ye, Eddie Zhu -- Monster
APCS1 pd1
HW#28
2017-11-08
* class YoRPG -- Driver file for Ye Olde Role Playing Game.
* Simulates monster encounters of a wandering adventurer.
* Required classes: Protagonist, Monster
**********************************************/

public class Monster{
    //instance variables
    public String name;
    public int health;
    public int strength;
    public int defense;
    public double attackRating;

    //constructor
    public Monster(){
	health = 150;
	defense = 20;
	attackRating = 1;
	strength = (int)(Math.random() * 45) + 20;
	String name = "smaug";
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

    public int attack(Protagonist pat){
	int damageDone = (int)(strength * attackRating) - pat.getDefense();
	pat.health -= damageDone;
	return damageDone;
    }

    
}
