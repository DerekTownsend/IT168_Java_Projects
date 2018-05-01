/*
 *File name: Fundraiser.java
 *
 *Programmer: Derek Townsend
 *ULID: djtown1
 *
 *Date: Oct 10, 2017
 *
 *Class: IT 168
 *Lecture Section: 004
 *Lecture Instructor:Dr Xing Fang
 *Lab Section: 005
 *Lab Instructor: Simran Kaur
 */
package edu.ilstu;

/*
 *<insert description>
 *
 * @author Derek
 *
 */
public class Fundraiser
{
	public final double PASTRY=13, COOKIE_DOUGH=22, TIER1=.08, TIER2=.15;
	private int cinnamon, cheese, strawberry, chocolateChip, peanutButter;
	
	public int getCinnamon(){
		return cinnamon;
	}
	public int getCheese(){
		return cheese;
	}
	public int getStrawberry(){
		return strawberry;
	}
	public int getChocolateChip(){
		return chocolateChip;
	}
	public int getPeanutButter(){
		return peanutButter;
	}
	
	public double getPASTRY(){
		return PASTRY;
	}
	public double getCOOKIE_DOUGH(){
		return COOKIE_DOUGH;
	}
	
	public double getTIER1(){
		return TIER1;
	}
	public double getTIER2(){
		return TIER2;
	}
	
	public void setCinnamon(int cinnamon){
		this.cinnamon=cinnamon;
	}
	public void setCheese(int cheese){
		this.cheese=cheese;
	}
	public void setStrawberry(int strawberry){
		this.strawberry=strawberry;
	}
	public void setChocolateChip(int chocolateChip){
		this.chocolateChip=chocolateChip;
	}
	public void setPeanutButter(int peanutButter){
		this.peanutButter=peanutButter;
	}
	
	
	
	public double calculateSchoolShare() {
		double resultPastry=0, resultCookieDough=0;
		double totalCountPastry=(cinnamon+cheese+strawberry);
		double totalCountCookieDough=(chocolateChip+peanutButter);
		
		if(totalCountPastry>0||totalCountCookieDough>0) {
			if(totalCountPastry<=10) {
				resultPastry=TIER1*calculatePastryCost();
			}
			else {
				resultPastry=TIER2*calculatePastryCost();
			}
			if(totalCountCookieDough<=5){
				resultCookieDough=TIER1*calculateCookieCost();
			}
			else {
				resultCookieDough=TIER2*calculateCookieCost();
			}	
		}
		return resultCookieDough+resultPastry;
		
	}
	
	public double calculatePastryCost() {
		return PASTRY*(cinnamon+cheese+strawberry);
	}
	public double calculateCookieCost() {
		return COOKIE_DOUGH*(chocolateChip+peanutButter);
	}
	public double calculateNetCost() {
		return calculatePastryCost()+calculateCookieCost()-calculateSchoolShare();
	}
	
}
