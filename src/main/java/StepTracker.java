import java.util.ArrayList;
public class StepTracker
{
 /* to be implemented here */
 public class StepTracker{
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
   if (steps >= minSteps)
    aDays++; 
  }
  public int activeDays(){
   return aDays; 
  }
  public double averageSteps(){
   return (double)totalSteps/days; 
  }
 }
} 
