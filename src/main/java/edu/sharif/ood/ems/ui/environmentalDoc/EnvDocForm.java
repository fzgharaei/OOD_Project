/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.sharif.ood.ems.ui.environmentalDoc;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 *
 * @author fatemehzahra
 */

public class EnvDocForm
{
    private JPanel contentPane;
    private LegalRequiermentPanel panel1;
    private MisaqnamehPanel panel2;
    private EnvironmentImpactPanel panel3;
    private JComboBox choiceBox;
    private String[] choices = {
                                "الزام‌قانونی",
                                "میثاق‌نامه",
                                "تاثیرمحیطی"
                               };

    private void displayGUI()
    {
        JFrame frame = new JFrame("Card Layout Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel contentPanel = new JPanel();
        contentPanel.setBorder(
            BorderFactory.createEmptyBorder(5, 5, 5, 5));
        contentPanel.setLayout(new CardLayout());

        choiceBox = new JComboBox(choices);
        choiceBox.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent ae) {
               String changeToPanel = (String) choiceBox.getSelectedItem();
               CardLayout cardLayout = (CardLayout) contentPane.getLayout();
               cardLayout.show(contentPane, changeToPanel);
            }
        });

        panel1 = new LegalRequiermentPanel(contentPanel, this);
        panel2 = new MisaqnamehPanel(contentPanel,  this);
        panel3 = new EnvironmentImpactPanel(contentPanel, this);   

        contentPanel.add(panel1, "Panel 1"); 
        contentPanel.add(panel2, "Panel 2");
        contentPanel.add(panel3, "Panel 3");         
        
        frame.getContentPane().add(choiceBox, BorderLayout.PAGE_START);
        frame.getContentPane().add(contentPanel, BorderLayout.CENTER);       
        frame.pack();   
        frame.setLocationByPlatform(true);
        frame.setVisible(true);
    }

    public JComboBox getChoiceBox()
    {
        return choiceBox;
    }

    public static void main(String... args)
    {
        SwingUtilities.invokeLater(new Runnable()
        {
            public void run()
            {
                new EnvDocForm().displayGUI();
            }
        });
    }
}

class EnvironmentImpactPanel extends JPanel 
{
    private JButton jcomp4;
    private JPanel contentPane;
    private JComboBox choiceBox;

    public EnvironmentImpactPanel(JPanel panel, EnvDocForm edf) 
    {
        choiceBox = edf.getChoiceBox();
        contentPane = panel;
        setOpaque(true);
        setBackground(Color.CYAN);
        //construct components
        jcomp4 = new JButton ("Show New Panel");
        jcomp4.addActionListener( new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                String changeToPanel = (String) choiceBox.getSelectedItem();
                CardLayout cardLayout = (CardLayout) contentPane.getLayout();
                cardLayout.show(contentPane, changeToPanel);
            }
        });
        add(jcomp4);
    }

    @Override
    public Dimension getPreferredSize()
    {
        return (new Dimension(500, 500));
    }
}

class MisaqnamehPanel extends JPanel 
{

    private JButton jcomp1;
    private JPanel contentPane;
    private Color backgroundColour;
    private JComboBox choiceBox;

    public MisaqnamehPanel(JPanel panel, EnvDocForm edf) 
    {   
        contentPane = panel;
        backgroundColour = Color.CYAN;
        choiceBox = edf.getChoiceBox();

        setOpaque(true);
        setBackground(backgroundColour);

        //construct components
        jcomp1 = new JButton ("Show New Panel");
        jcomp1.addActionListener( new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                String changeToPanel = (String) choiceBox.getSelectedItem();
                CardLayout cardLayout = (CardLayout) contentPane.getLayout();
                cardLayout.show(contentPane, changeToPanel);
            }
        });

        add(jcomp1);
    }

    @Override
    public Dimension getPreferredSize()
    {
        return (new Dimension(500, 500));
    }
}


//class EnvironmentImpactPanel extends JPanel 
//{
//    private JButton jcomp4;
//    private JPanel contentPane;
//    private JComboBox choiceBox;
//
//    public EnvironmentImpactPanel(JPanel panel, EnvDocForm edf) 
//    {
//        choiceBox = edf.getChoiceBox();
//        contentPane = panel;
//        setOpaque(true);
//        setBackground(Color.RED.darker().darker());
//        //construct components
//        jcomp4 = new JButton ("Show New Panel");
//        jcomp4.addActionListener( new ActionListener()
//        {
//            public void actionPerformed(ActionEvent e)
//            {
//                String changeToPanel = (String) choiceBox.getSelectedItem();
//                CardLayout cardLayout = (CardLayout) contentPane.getLayout();
//                cardLayout.show(contentPane, changeToPanel);
//            }
//        });
//        add(jcomp4);
//    }
//
//    @Override
//    public Dimension getPreferredSize()
//    {
//        return (new Dimension(500, 500));
//    }
//}

class LegalRequiermentPanel extends JPanel 
{

    private JButton jcomp1;
    private JPanel contentPane;
    private Color backgroundColour;
    private JComboBox choiceBox;

    public LegalRequiermentPanel(JPanel panel, EnvDocForm edf) 
    {   
        contentPane = panel;
        backgroundColour = Color.CYAN;
        choiceBox = edf.getChoiceBox();

        setOpaque(true);
        setBackground(backgroundColour);

        //construct components
        jcomp1 = new JButton ("Show New Panel");
        jcomp1.addActionListener( new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                String changeToPanel = (String) choiceBox.getSelectedItem();
                CardLayout cardLayout = (CardLayout) contentPane.getLayout();
                cardLayout.show(contentPane, changeToPanel);
            }
        });

        add(jcomp1);
    }

    @Override
    public Dimension getPreferredSize()
    {
        return (new Dimension(500, 500));
    }
}