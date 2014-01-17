// I had to make this in my programming class so I pushed it.
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lastschool;
import java.awt.*;
import javax.swing.*;
/**
 *
 * @author henrypitcairn
 */
public class MyMenu {
    private JFrame frame;
    
    public MyMenu() {
        makeGUI();
    }
    public void makeGUI() {
        frame = new JFrame("Menu Project");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container panel = frame.getContentPane();
        JMenuBar menuBar = new JMenuBar();
        
        JMenu file = new JMenu("File");
        JMenu edit = new JMenu("Edit");
        JMenu help = new JMenu("Help");
        
        JMenuItem newMenuItem = new JMenuItem("New...");
        JMenuItem saveAs = new JMenuItem("Save As...");
        JMenuItem exitItem = new JMenuItem("Exit...");
        
        file.add(newMenuItem);
        file.addSeparator();
        file.add(saveAs);
        file.addSeparator();
        file.add(exitItem);
        
        menuBar.add(file);
        menuBar.add(edit);
        menuBar.add(Box.createHorizontalGlue());
        menuBar.add(help);
        frame.setJMenuBar(menuBar);
        frame.setSize(800, 800);
        frame.setVisible(true);
    }
}
