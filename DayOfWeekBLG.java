import java.util.Scanner;

public class DayOfWeekBLG  {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
      
 

      System.out.print("Enter the year");
		int year = input.nextInt();
		System.out.print("Enter month: (ex 1-12) ");
		int m = input.nextInt();
		System.out.print("Enter the day of the month: (ex 1-31):");
		int q = input.nextInt();
      
      if (m == 1 || m == 2) {
		
			m = (m == 1) ? 13 : 14;
			year--;
		}

      
      //h = day of week (OUTPUT NOT INPUT)
      //q = day of month
      //m = month
      //j = century
      //k = year of century
      
      int k = (year % 100);
      int j = (year / 100);
      
      int day = ((q + (((m + 1 ) * 26) / 10) + k + (k / 4) + (j / 4)) + (5 * j)) %7;
      
      if (day == 0) {
      System.out.println("The Day is Saturday");
      }
      else if (day == 1) {
      System.out.println("The Day is Sunday");
      }
      else if (day == 2) {
      System.out.println("The Day is Monday");
      }
      else if (day == 3) {
      System.out.println("The Day is Tuesday");
      }
      else if (day == 4) {
      System.out.println("The Day is Wednesday");
      }
      else if (day == 5) {
      System.out.println("The Day is Thursday");
      }
      else if (day == 6) {
      System.out.println("The Day is Friday");
      }
      
      
      
      //System.out.println("The day of the month is" + day );


	
		}
	}
