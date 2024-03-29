/**
 * A code stub/template for a simple GUI
 * - This file describes the main window
 * 
 * @author Justin Jang
 * @version 11/25/2019
 */

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JComponent;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Dimension;


public class MyCustomFrame extends JFrame
{
    private JButton button1, button2;
    private JLabel label;
    private JPanel panel;
    private JComponent component;
    
    private static final int FRAME_WIDTH = 500;
    private static final int FRAME_HEIGHT = 500;
    private static final int COMPONENT_WIDTH = 400;
    private static final int COMPONENT_HEIGHT = 400;
    
    // Constructor
    public MyCustomFrame()
    {
        createComponents();
        setSize(FRAME_WIDTH, FRAME_HEIGHT);
    }
    
    private void createComponents()
    {
        // Create the GUI components
        
        // Create the buttons
        button1 = new JButton("Click Me 1");
        button2 = new JButton("Click Me 2");
        // Connect the listeners (event handlers) to the buttons
        button1.addActionListener(new MyButtonListener1());
        button2.addActionListener(new MyButtonListener2());
        
        // Create the label
        label = new JLabel("This is it: ");
        
        // Create the component (which we will use draw things)
        component = new MyCustomComponent();
        component.setPreferredSize(new Dimension(COMPONENT_WIDTH, COMPONENT_HEIGHT));
        
        // Create the panel and add the GUI components to the panel
        panel = new JPanel();
        panel.add(label);
        panel.add(button1);
        panel.add(button2);
        panel.add(component);
        //panel.setBackground(Color.RED);
        
        // Add the panel to the frame
        this.add(panel);
    }
    
    
    // Event handlers
    
    class MyButtonListener1 implements ActionListener
    {
        public void actionPerformed(ActionEvent event)
        {
            System.out.println("Clicked 1");
        }
    }
    
    class MyButtonListener2 implements ActionListener
    {
        public void actionPerformed(ActionEvent event)
        {
            System.out.println("Clicked 2");
        }
    }
    
}
