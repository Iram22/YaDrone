/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cdioproject;

import de.yadrone.base.ARDrone;
import de.yadrone.base.IARDrone;
import de.yadrone.base.navdata.AttitudeListener;
import de.yadrone.base.navdata.BatteryListener;
import de.yadrone.base.video.ImageListener;
import java.awt.image.BufferedImage;
import javax.swing.SwingUtilities;

/**
 *
 * @author Iram
 */
public class CDIOproject {

    /**
     * @param args the command line arguments
     */
  public static void main(String[] args)
{
    IARDrone drone = null;
    try
    {
        drone = new ARDrone();
        drone.start();
        
        drone.getNavDataManager().addAttitudeListener(new AttitudeListener() {
			
    public void attitudeUpdated(float pitch, float roll, float yaw)
    {
        System.out.println("Pitch: " + pitch + " Roll: " + roll + " Yaw: " + yaw);
    }

    public void attitudeUpdated(float pitch, float roll) { }
    public void windCompensation(float pitch, float roll) { }
});
        
        drone.getNavDataManager().addBatteryListener(new BatteryListener() {
	
    public void batteryLevelChanged(int percentage)
    {
        System.out.println("Battery: " + percentage + " %");
    }

    public void voltageChanged(int vbat_raw) { }
});
        
     
    }
    catch (Exception exc)
	{
		exc.printStackTrace();
	}
	finally
	{
		if (drone != null)
			drone.stop();
		System.exit(0);
	}
}
  
  
    
}
