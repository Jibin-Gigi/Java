/******************************************************************************************
 * File				:	Attendance.java
 * Description      :   Find Mark distribution as per attendance
 * Author           :   Jibin Gigi
 * Version          :   1.0
 * Date             :   26/09/23
***********************************************************************************************/
import java.util.Scanner;

public class Attendance{
		public static void main(String[] args) {
			int Attendance_Percentage;
			Scanner sc= new Scanner(System.in);
			System.out.println("Enter the percentage of attendance: ");
			Attendance_Percentage=sc.nextInt();
			if(Attendance_Percentage>90) {
				System.out.println("The internal marks for attendance is "+10);
			}
			else {
				System.out.println("The internal marks for Attendance is "+(float)Attendance_Percentage/10);
			}
			sc.close();
		}
}
