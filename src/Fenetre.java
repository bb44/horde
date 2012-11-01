import java.awt.*;
import javax.swing.*;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
public class Fenetre extends JFrame  {

	public Monde M;
	public int cx;
	public int cy;
	
   public Fenetre (Monde v, int x,int y){
	   M=v;
	   cx=x;
	   cy=y;
	   System.out.println(" fenetre cx="+cx+ " et cy="+cy);
     	this.dessiner();	
   }

   public void set(Monde v){
	   M=v;
   }
   public void dessiner(){
	   this.setTitle("La Horde par Brice Le Dain");
	     System.out.println("cx="+cx+ "et cy="+cy);
	      this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	      this.setLocationRelativeTo(null);
	      this.setExtendedState(this.MAXIMIZED_BOTH);
	     
	      
	      
			
	      //Le conteneur principal
	      JPanel content = new JPanel();
	      content.setPreferredSize(new Dimension(700, 700));
	      content.setBackground(Color.WHITE);
	      //On d�finit le layout manager
	      content.setLayout(new GridBagLayout());
	      //L'objet servant � positionner les composants
	      GridBagConstraints gbc = new GridBagConstraints();
			

	      //La taille en hauteur et en largeur
	      gbc.gridheight = 1;
	      gbc.gridwidth = 1;
	      //centrage
	     System.out.println("matrice");
	      //matrice de donnee
	       int[][] A=new int[13][13];
	       for(int i=0;i<13;i++){
		    	for(int j=0;j<13;j++){
		    		A[i][j]=-1;
		    	}
		    }
	       //ajouter les batiment
	       for(int j=0;j<M.batiments.size();j++){
	    		//si le batiment est dans la zone
	    	   int x=M.batiments.get(j).x;
	    	   int y=M.batiments.get(j).y;
	    	   if((x>cx-7)&&(x<cx+7)&&(y>cy-7)&&(y<cy+7)){A[x-cx+6][y-cy+6]=M.batiments.get(j).Type();}
	    	   }
	    for(int i=0;i<13;i++){
	    	for(int j=0;j<13;j++){
	    		   //On positionne la case du composant
	    		gbc.gridx = i;
	    	    gbc.gridy = j;
	    	    //on ajoute la cellule au conteneur
	    	    Panneau cell=new Panneau();
	    	    cell.n=A[j][i];
	    	    cell.p=0;
	    	    cell.repaint();
	    	    cell.setPreferredSize(new Dimension(50, 50));	
	    	    content.add(cell, gbc);
	        }
	    }
	    this.setLayout(new BorderLayout());
	    JPanel cell1 = new JPanel();
	    cell1.setBackground(Color.YELLOW);
	    cell1.setPreferredSize(new Dimension(60, 40));
	   
	   
	    this.getContentPane().add(content, BorderLayout.WEST);
	   
	    this.getContentPane().add(cell1, BorderLayout.CENTER);
	   //On ajoute l'écouteur à notre composant
	    this.addKeyListener(new ClavierListener());
	      //On ajoute le conteneur
	     // this.setContentPane(content);
	      this.setVisible(true);
   }
   
   class ClavierListener implements KeyListener{

	    public void keyPressed(KeyEvent event) {
	      System.out.println("Code touche pressée : " + event.getKeyCode() + " - caractère touche pressée : " + event.getKeyChar());
	      if(event.getKeyCode()==37){cy=cy-1;pause();}
	      if(event.getKeyCode()==38){cx=cx-1;pause();}
	      if(event.getKeyCode()==39){cy=cy+1;pause();}
	      if(event.getKeyCode()==40){cx=cx+1;pause();}
	      if(event.getKeyCode()==27){fin();}
	      if(event.getKeyCode()==17){cy=0;cx=0;pause();}
	    }

	    public void keyReleased(KeyEvent event) {
	     // System.out.println("Code touche relâchée : " + event.getKeyCode() + " - caractère touche relâchée : " + event.getKeyChar());         
	                      
	    }

	    public void keyTyped(KeyEvent event) {
	     // System.out.println("Code touche tapée : " + event.getKeyCode() + " - caractère touche tapée : " + event.getKeyChar());
	      
	    }   	
	  }  
   private void pause(){
	    try {
	      Thread.sleep(1);
	    } catch (InterruptedException e) {
	      e.printStackTrace();
	    }
	    System.out.println("pause cx="+cx+ " et cy="+cy);
	   Monde W=new Monde();
	    W=this.M;int x=this.cx;int y=this.cy;
	    this.dispose();
	    Fenetre F=new Fenetre(W,x,y);
	  }  
   private void fin(){
	    this.dispose();
	  }  

}


