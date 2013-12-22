package rockmails;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Graphic {
    JFrame window;
    JMenuBar menue;
    GridBagLayout gbl = new GridBagLayout();
    GridBagConstraints gblc = new GridBagConstraints();

    JMenu data;
    JMenu konto;
    JMenu help;
    JMenuItem newMail;
    JMenuItem call;
    JMenuItem exit;
    JMenuItem kontoAdd;
    JMenuItem kontoFeatures;
    JMenuItem about;
    
    JTextArea quickMail;
    
    Graphic()
    {
        window = new JFrame("Rockmails");
        menue = new JMenuBar();
        data = new JMenu("Datei");
        konto = new JMenu("Konto");
        help = new JMenu("Extra");
        newMail = new JMenuItem("Neue E-Mail");
        call = new JMenuItem("Abrufen");
        exit = new JMenuItem("Beenden");
        kontoAdd = new JMenuItem("Beenden");
        kontoFeatures = new JMenuItem("Kontoeigenschaften");
        about = new JMenuItem("About");
        quickMail = new JTextArea();
        
        menue.add(data);
        menue.add(konto);
        menue.add(help);
        data.add(newMail);
        data.add(call);
        data.addSeparator();
        data.add(exit);
        konto.add(kontoAdd);
        konto.add(kontoFeatures);
        help.add(about);
        window.setJMenuBar(menue);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setLocation(0,0);
        window.resize(Toolkit.getDefaultToolkit().getScreenSize());
        window.setLayout(gbl);
        
    }
    
   public void start()
    {
        window.setVisible(true);
    }
    
    
}
