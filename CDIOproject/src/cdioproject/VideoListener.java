/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cdioproject;

import de.yadrone.base.ARDrone;
import de.yadrone.base.video.ImageListener;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import javax.swing.JFrame;

/**
 *
 * @author Iram
 */
public class VideoListener extends JFrame
{
    private BufferedImage image = null;
    
    public VideoListener(final ARDrone drone)
    {
        super("YADrone Tutorial");
        
        setSize(640,360);
        setVisible(true);
    }
    
    public void paint(Graphics g)
    {
        if (image != null)
            g.drawImage(image, 0, 0, image.getWidth(), image.getHeight(), null);
        
  
    }
    
    
}
    

