/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cdioproject;

import de.yadrone.base.ARDrone;
import de.yadrone.base.IARDrone;

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
