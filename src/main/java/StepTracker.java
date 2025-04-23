import java.util.ArrayList;
public class StepTracker
{
 /* to be implemented here */
  private int days, totalSteps, aDays, minSteps;
  public StepTracker (int goal){
   totalSteps = 0; 
   days = 0; 
   aDays = 0; 
   minSteps = goal; 
  }
  public void addDailySteps (int num){
   totalSteps += num; 
   days ++; 
   if (num >= minSteps)
    aDays++; 
  }
  public int activeDays(){
   return aDays; 
  }
  public double averageSteps(){
   return (double)totalSteps/days; 
   if (steps == 0)
    return 0.0; 
  }
} 
