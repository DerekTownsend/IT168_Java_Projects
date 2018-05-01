/*
 *File name: Order.java
 *
 *Programmer: Derek Townsend
 *ULID: djtown1
 *
 *Date: Oct 26, 2017
 *
 *Class: IT 168
 *Lecture Section: 004
 *Lecture Instructor:Dr Xing Fang
 *Lab Section: 005
 *Lab Instructor: Simran Kaur
 */
package edu.ilstu;
import java.util.Scanner;

/*
 *<insert description>
 *
 * @author Derek
 *
 */
public class Order
{
	private String orderType;
	public final int TOPPING_PRICE=5;
	public final double SALES_TAX=1.075;
	public final double DELIVERY_CHARGE=.20;
	Scanner keyboard =new Scanner(System.in);
	public void setOrderType(String deliveryOrPickup) {		
		boolean orderFlag=true;
		while(orderFlag==true) {
			if (deliveryOrPickup.equals("1")||deliveryOrPickup.equals("2")) {
				orderFlag=false;

			}else {
				orderFlag=true;
				System.out.println("Wrong choice, please type 1 for pickup and 2 for delivery");
				deliveryOrPickup=keyboard.next();
			}
			
		}
	
		if (deliveryOrPickup.equals("1")) {
			orderType="pickup order";
		}else if(deliveryOrPickup.equals("2")) {
			orderType="delivery";
		}
		
	}
	
	public String getOrderType() {
		return orderType;
	}
	
	public void summary(int numOfToppings) {
		double subtotal,total,deliveryCharge;
		
		if (orderType.equals("pickup order")) {
			

				subtotal=TOPPING_PRICE+(numOfToppings);
				total=subtotal*SALES_TAX;
				System.out.printf("The subtotal is:\t\t$%,.2f \n",subtotal); 
				System.out.printf("The total cost is:\t\t$%,.2f \n",total);

		}else if(orderType.equals("delivery")) {
				subtotal=TOPPING_PRICE+(numOfToppings);
				deliveryCharge=subtotal*DELIVERY_CHARGE;
				total=(subtotal+deliveryCharge)*SALES_TAX;
				System.out.printf("The subtotal is:\t\t$%,.2f \n",subtotal); 
				System.out.printf("The delivery charge is:\t\t$%,.2f \n",deliveryCharge);
				System.out.printf("The total cost is:\t\t$%,.2f \n",total);
		}
	}
	
	

	
}
