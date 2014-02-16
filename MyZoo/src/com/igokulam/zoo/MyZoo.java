package com.igokulam.zoo;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/*
<applet code="AnimalZoo" width = 1200 height = 1000>
</applet>
*/
public class MyZoo extends Applet implements ActionListener
{   
	private static final long serialVersionUID = 100;
	static String PICTURE_FILE_ZOO = "../images/zoo.jpg";
	
    Button elephantButton = new Button("Elephant");
    Button lionButton     = new Button("Lion");
	Button tigerButton    = new Button("Tiger");
	Button catButton      = new Button("Cat");
	Button shepardButton  = new Button("Shepard");
    Button terrierButton  = new Button("Terrier");
    Image currImage = null; 
    
    public void init()
    {
    	setSize(1200, 1000);
		add(elephantButton);
        add(lionButton);
        add(tigerButton);
        add(catButton);
        add(shepardButton);
        add(terrierButton);
	
		elephantButton.addActionListener(this);
		lionButton.addActionListener(this);
		tigerButton.addActionListener(this);
		catButton.addActionListener(this);
		shepardButton.addActionListener(this);
		terrierButton.addActionListener(this);
        
    }

    public String getAppletInfo()
    {
        return "Hare Krsna.. We are in a Zoo!";
    }

    public void start() { 
    	currImage = getImage(getDocumentBase(), PICTURE_FILE_ZOO);
        showStatus(getAppletInfo());
    }

    public void paint(Graphics g)
    {
    	g.drawImage(currImage, 0, 0, this);
    }
    
    public void actionPerformed(ActionEvent e){

		if (e.getSource() == elephantButton) 
			showAnimal(new Elephant("Gajendra"));
		else if (e.getSource() == lionButton)
			showAnimal(new Lion("Mountain Lion"));
		else if (e.getSource() == tigerButton)
			showAnimal(new Tiger("Snow Leopard"));
		else if (e.getSource() == catButton)
			showAnimal(new Cat("Jimmy"));
		else if (e.getSource() == shepardButton)
			showAnimal(new Shepard("Joe"));
		else if (e.getSource() == terrierButton)
			showAnimal(new Terrier("John"));
	} // actionPerformed
    
    private void showAnimal(Animal anAnimal) {
    	String theImageFile = anAnimal.getImageFile();
    	currImage      = getImage(getDocumentBase(),theImageFile);
    	repaint();
    	anAnimal.play();
    }
    
}