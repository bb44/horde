


	import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;

	import javax.swing.JPanel;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
	 
	public class Panneau extends JPanel { 
		
		public int n=-1;
		public int p=1;
		
	   public void paintComponent(Graphics g){
	// System.out.println("panneau");
	      int x = this.getWidth();
	      int y = this.getHeight();
	      g.setColor(Color.GRAY);
	      g.fillRect(0, 0, this.getWidth(), this.getHeight()); 
 if(n==-1) {g.setColor(Color.red);
	      
	      try {
	          Image img = ImageIO.read(new File("fond.gif"));
	          
	          //Pour une image de fond
	          g.drawImage(img, 0, 0, this.getWidth(), this.getHeight(), this);
	        } catch (IOException e) {
	          e.printStackTrace();
	        }   
	      }
	      if(n==1) {g.setColor(Color.red);
	      
	      try {
	          Image img = ImageIO.read(new File("ville.jpg"));
	          
	          //Pour une image de fond
	          g.drawImage(img, 0, 0, this.getWidth(), this.getHeight(), this);
	        } catch (IOException e) {
	          e.printStackTrace();
	        }   
	      }
	     if(n==2) {g.setColor(Color.red);
	      
	      try {
	          Image img = ImageIO.read(new File("warehouse.gif"));
	          
	          //Pour une image de fond
	          g.drawImage(img, 0, 0, this.getWidth(), this.getHeight(), this);
	        } catch (IOException e) {
	          e.printStackTrace();
	        }   
	      }
	     if(n==3) {g.setColor(Color.red);
	      
	      try {
	          Image img = ImageIO.read(new File("maison.gif"));
	          
	          //Pour une image de fond
	          g.drawImage(img, 0, 0, this.getWidth(), this.getHeight(), this);
	        } catch (IOException e) {
	          e.printStackTrace();
	        }   
	      }
	     
	     if(n==4) {g.setColor(Color.red);
	      
	      try {
	          Image img = ImageIO.read(new File("ambulance.gif"));
	          
	          //Pour une image de fond
	          g.drawImage(img, 0, 0, this.getWidth(), this.getHeight(), this);
	        } catch (IOException e) {
	          e.printStackTrace();
	        }   
	      }
	     if(n==5) {g.setColor(Color.red);
	      
	      try {
	          Image img = ImageIO.read(new File("cachcont.gif"));
	          
	          //Pour une image de fond
	          g.drawImage(img, 0, 0, this.getWidth(), this.getHeight(), this);
	        } catch (IOException e) {
	          e.printStackTrace();
	        }   
	      }
	     if(n==6) {g.setColor(Color.red);
	      
	      try {
	          Image img = ImageIO.read(new File("camion.gif"));
	          
	          //Pour une image de fond
	          g.drawImage(img, 0, 0, this.getWidth(), this.getHeight(), this);
	        } catch (IOException e) {
	          e.printStackTrace();
	        }   
	      }
	     if(n==7) {g.setColor(Color.red);
	      
	      try {
	          Image img = ImageIO.read(new File("labocost.gif"));
	          
	          //Pour une image de fond
	          g.drawImage(img, 0, 0, this.getWidth(), this.getHeight(), this);
	        } catch (IOException e) {
	          e.printStackTrace();
	        }   
	      }
	     if(n==8) {g.setColor(Color.red);
	      
	      try {
	          Image img = ImageIO.read(new File("petibois.gif"));
	          
	          //Pour une image de fond
	          g.drawImage(img, 0, 0, this.getWidth(), this.getHeight(), this);
	        } catch (IOException e) {
	          e.printStackTrace();
	        }   
	      }
	     if(n==9) {g.setColor(Color.red);
	      
	      try {
	          Image img = ImageIO.read(new File("petimais.gif"));
	          
	          //Pour une image de fond
	          g.drawImage(img, 0, 0, this.getWidth(), this.getHeight(), this);
	        } catch (IOException e) {
	          e.printStackTrace();
	        }   
	      }
	     if(n==10) {g.setColor(Color.red);
	      
	      try {
	          Image img = ImageIO.read(new File("carcvoit.gif"));
	          
	          //Pour une image de fond
	          g.drawImage(img, 0, 0, this.getWidth(), this.getHeight(), this);
	        } catch (IOException e) {
	          e.printStackTrace();
	        }   
	      }
	     if(n==11) {g.setColor(Color.red);
	      
	      try {
	          Image img = ImageIO.read(new File("carieffo.gif"));
	          
	          //Pour une image de fond
	          g.drawImage(img, 0, 0, this.getWidth(), this.getHeight(), this);
	        } catch (IOException e) {
	          e.printStackTrace();
	        }   
	      }
	     if(n==12) {g.setColor(Color.red);
	      
	      try {
	          Image img = ImageIO.read(new File("cavofami.gif"));
	          
	          //Pour une image de fond
	          g.drawImage(img, 0, 0, this.getWidth(), this.getHeight(), this);
	        } catch (IOException e) {
	          e.printStackTrace();
	        }   
	      }
	     if(n==13) {g.setColor(Color.red);
	      
	      try {
	          Image img = ImageIO.read(new File("caverne.gif"));
	          
	          //Pour une image de fond
	          g.drawImage(img, 0, 0, this.getWidth(), this.getHeight(), this);
	        } catch (IOException e) {
	          e.printStackTrace();
	        }   
	      }
	     if(n==14) {g.setColor(Color.red);
	      
	      try {
	          Image img = ImageIO.read(new File("cimeindi.gif"));
	          
	          //Pour une image de fond
	          g.drawImage(img, 0, 0, this.getWidth(), this.getHeight(), this);
	        } catch (IOException e) {
	          e.printStackTrace();
	        }   
	      }
	     if(n==15) {g.setColor(Color.red);
	      
	      try {
	          Image img = ImageIO.read(new File("ecolbrul.gif"));
	          
	          //Pour une image de fond
	          g.drawImage(img, 0, 0, this.getWidth(), this.getHeight(), this);
	        } catch (IOException e) {
	          e.printStackTrace();
	        }   
	      }
	     if(n==16) {g.setColor(Color.red);
	      
	      try {
	          Image img = ImageIO.read(new File("kebab.gif"));
	          
	          //Pour une image de fond
	          g.drawImage(img, 0, 0, this.getWidth(), this.getHeight(), this);
	        } catch (IOException e) {
	          e.printStackTrace();
	        }   
	      }
	     if(n==17) {g.setColor(Color.red);
	      
	      try {
	          Image img = ImageIO.read(new File("parking.gif"));
	          
	          //Pour une image de fond
	          g.drawImage(img, 0, 0, this.getWidth(), this.getHeight(), this);
	        } catch (IOException e) {
	          e.printStackTrace();
	        }   
	      }
	     if(n==18) {g.setColor(Color.red);
	      
	      try {
	          Image img = ImageIO.read(new File("vielpomp.gif"));
	          
	          //Pour une image de fond
	          g.drawImage(img, 0, 0, this.getWidth(), this.getHeight(), this);
	        } catch (IOException e) {
	          e.printStackTrace();
	        }   
	      }
	     if(n==19) {g.setColor(Color.red);
	      
	      try {
	          Image img = ImageIO.read(new File("villadela.gif"));
	          
	          //Pour une image de fond
	          g.drawImage(img, 0, 0, this.getWidth(), this.getHeight(), this);
	        } catch (IOException e) {
	          e.printStackTrace();
	        }   
	      }
	     if(n==20) {g.setColor(Color.red);
	      
	      try {
	          Image img = ImageIO.read(new File("velib.gif"));
	          
	          //Pour une image de fond
	          g.drawImage(img, 0, 0, this.getWidth(), this.getHeight(), this);
	        } catch (IOException e) {
	          e.printStackTrace();
	        }   
	      }
	     if(n==21) {g.setColor(Color.red);
	      
	      try {
	          Image img = ImageIO.read(new File("avion.gif"));
	          
	          //Pour une image de fond
	          g.drawImage(img, 0, 0, this.getWidth(), this.getHeight(), this);
	        } catch (IOException e) {
	          e.printStackTrace();
	        }   
	      }
	     if(n==22) {g.setColor(Color.red);
	      
	      try {
	          Image img = ImageIO.read(new File("chanabon.gif"));
	          
	          //Pour une image de fond
	          g.drawImage(img, 0, 0, this.getWidth(), this.getHeight(), this);
	        } catch (IOException e) {
	          e.printStackTrace();
	        }   
	      }
	     if(n==23) {g.setColor(Color.red);
	      
	      try {
	          Image img = ImageIO.read(new File("meuble.gif"));
	          
	          //Pour une image de fond
	          g.drawImage(img, 0, 0, this.getWidth(), this.getHeight(), this);
	        } catch (IOException e) {
	          e.printStackTrace();
	        }   
	      }
	     if(n==24) {g.setColor(Color.red);
	      
	      try {
	          Image img = ImageIO.read(new File("parc.gif"));
	          
	          //Pour une image de fond
	          g.drawImage(img, 0, 0, this.getWidth(), this.getHeight(), this);
	        } catch (IOException e) {
	          e.printStackTrace();
	        }   
	      }
	     if(n==25) {g.setColor(Color.red);
	      
	      try {
	          Image img = ImageIO.read(new File("pharma.gif"));
	          
	          //Pour une image de fond
	          g.drawImage(img, 0, 0, this.getWidth(), this.getHeight(), this);
	        } catch (IOException e) {
	          e.printStackTrace();
	        }   
	      }
	     if(n==26) {g.setColor(Color.red);
	      
	      try {
	          Image img = ImageIO.read(new File("route.gif"));
	          
	          //Pour une image de fond
	          g.drawImage(img, 0, 0, this.getWidth(), this.getHeight(), this);
	        } catch (IOException e) {
	          e.printStackTrace();
	        }   
	      }
	     if(n==27) {g.setColor(Color.red);
	      
	      try {
	          Image img = ImageIO.read(new File("market.gif"));
	          
	          //Pour une image de fond
	          g.drawImage(img, 0, 0, this.getWidth(), this.getHeight(), this);
	        } catch (IOException e) {
	          e.printStackTrace();
	        }   
	      }
	     if(n==28) {g.setColor(Color.red);
	      
	      try {
	          Image img = ImageIO.read(new File("armurerie.gif"));
	          
	          //Pour une image de fond
	          g.drawImage(img, 0, 0, this.getWidth(), this.getHeight(), this);
	        } catch (IOException e) {
	          e.printStackTrace();
	        }   
	      }
	     if(n==29) {g.setColor(Color.red);
	      
	      try {
	          Image img = ImageIO.read(new File("bar.gif"));
	          
	          //Pour une image de fond
	          g.drawImage(img, 0, 0, this.getWidth(), this.getHeight(), this);
	        } catch (IOException e) {
	          e.printStackTrace();
	        }   
	      }
	     if(n==30) {g.setColor(Color.red);
	      
	      try {
	          Image img = ImageIO.read(new File("hydro.gif"));
	          
	          //Pour une image de fond
	          g.drawImage(img, 0, 0, this.getWidth(), this.getHeight(), this);
	        } catch (IOException e) {
	          e.printStackTrace();
	        }   
	      }
	     if(n==31) {g.setColor(Color.red);
	      
	      try {
	          Image img = ImageIO.read(new File("fete.gif"));
	          
	          //Pour une image de fond
	          g.drawImage(img, 0, 0, this.getWidth(), this.getHeight(), this);
	        } catch (IOException e) {
	          e.printStackTrace();
	        }   
	      }
	     if(n==32) {g.setColor(Color.red);
	      
	      try {
	          Image img = ImageIO.read(new File("tranche.gif"));
	          
	          //Pour une image de fond
	          g.drawImage(img, 0, 0, this.getWidth(), this.getHeight(), this);
	        } catch (IOException e) {
	          e.printStackTrace();
	        }   
	      }
	     if(n==33) {g.setColor(Color.red);
	      
	      try {
	          Image img = ImageIO.read(new File("abri.gif"));
	          
	          //Pour une image de fond
	          g.drawImage(img, 0, 0, this.getWidth(), this.getHeight(), this);
	        } catch (IOException e) {
	          e.printStackTrace();
	        }   
	      }
	     if(n==34) {g.setColor(Color.red);
	      
	      try {
	          Image img = ImageIO.read(new File("abriatom.gif"));
	          
	          //Pour une image de fond
	          g.drawImage(img, 0, 0, this.getWidth(), this.getHeight(), this);
	        } catch (IOException e) {
	          e.printStackTrace();
	        }   
	      }
	     if(n==35) {g.setColor(Color.red);
	      
	      try {
	          Image img = ImageIO.read(new File("commissariat.gif"));
	          
	          //Pour une image de fond
	          g.drawImage(img, 0, 0, this.getWidth(), this.getHeight(), this);
	        } catch (IOException e) {
	          e.printStackTrace();
	        }   
	      }
	     if(n==36) {g.setColor(Color.red);
	      
	      try {
	          Image img = ImageIO.read(new File("cafe.gif"));
	          
	          //Pour une image de fond
	          g.drawImage(img, 0, 0, this.getWidth(), this.getHeight(), this);
	        } catch (IOException e) {
	          e.printStackTrace();
	        }   
	      }
	     if(n==37) {g.setColor(Color.red);
	      
	      try {
	          Image img = ImageIO.read(new File("biblio.gif"));
	          
	          //Pour une image de fond
	          g.drawImage(img, 0, 0, this.getWidth(), this.getHeight(), this);
	        } catch (IOException e) {
	          e.printStackTrace();
	        }   
	      }
	     if(n==38) {g.setColor(Color.red);
	      
	      try {
	          Image img = ImageIO.read(new File("poste.gif"));
	          
	          //Pour une image de fond
	          g.drawImage(img, 0, 0, this.getWidth(), this.getHeight(), this);
	        } catch (IOException e) {
	          e.printStackTrace();
	        }   
	      }
	     if(n==39) {g.setColor(Color.red);
	      
	      try {
	          Image img = ImageIO.read(new File("cabane.gif"));
	          
	          //Pour une image de fond
	          g.drawImage(img, 0, 0, this.getWidth(), this.getHeight(), this);
	        } catch (IOException e) {
	          e.printStackTrace();
	        }   
	      }
	     if(n==40) {g.setColor(Color.red);
	      
	      try {
	          Image img = ImageIO.read(new File("epicerie.gif"));
	          
	          //Pour une image de fond
	          g.drawImage(img, 0, 0, this.getWidth(), this.getHeight(), this);
	        } catch (IOException e) {
	          e.printStackTrace();
	        }   
	      }
	     if(n==41) {g.setColor(Color.red);
	      
	      try {
	          Image img = ImageIO.read(new File("fastfood.gif"));
	          
	          //Pour une image de fond
	          g.drawImage(img, 0, 0, this.getWidth(), this.getHeight(), this);
	        } catch (IOException e) {
	          e.printStackTrace();
	        }   
	      }
	     if(n==42) {g.setColor(Color.red);
	      
	      try {
	          Image img = ImageIO.read(new File("mini.gif"));
	          
	          //Pour une image de fond
	          g.drawImage(img, 0, 0, this.getWidth(), this.getHeight(), this);
	        } catch (IOException e) {
	          e.printStackTrace();
	        }   
	      }
	     if(n==43) {g.setColor(Color.red);
	      
	      try {
	          Image img = ImageIO.read(new File("silo.gif"));
	          
	          //Pour une image de fond
	          g.drawImage(img, 0, 0, this.getWidth(), this.getHeight(), this);
	        } catch (IOException e) {
	          e.printStackTrace();
	        }   
	      }
	     if(n==44) {g.setColor(Color.red);
	      
	      try {
	          Image img = ImageIO.read(new File("villa.gif"));
	          
	          //Pour une image de fond
	          g.drawImage(img, 0, 0, this.getWidth(), this.getHeight(), this);
	        } catch (IOException e) {
	          e.printStackTrace();
	        }   
	      }
	     if(n==45) {g.setColor(Color.red);
	      
	      try {
	          Image img = ImageIO.read(new File("avant_poste_militarie.png"));
	          
	          //Pour une image de fond
	          g.drawImage(img, 0, 0, this.getWidth(), this.getHeight(), this);
	        } catch (IOException e) {
	          e.printStackTrace();
	        }   
	      }
	     if(n==46) {g.setColor(Color.red);
	      
	      try {
	          Image img = ImageIO.read(new File("caverne_anciennement_habite.png"));
	          
	          //Pour une image de fond
	          g.drawImage(img, 0, 0, this.getWidth(), this.getHeight(), this);
	        } catch (IOException e) {
	          e.printStackTrace();
	        }   
	      }
	     if(n==47) {g.setColor(Color.red);
	      
	      try {
	          Image img = ImageIO.read(new File("char.png"));
	          
	          //Pour une image de fond
	          g.drawImage(img, 0, 0, this.getWidth(), this.getHeight(), this);
	        } catch (IOException e) {
	          e.printStackTrace();
	        }   
	      }
	     if(n==48) {g.setColor(Color.red);
	      
	      try {
	          Image img = ImageIO.read(new File("hangars.png"));
	          
	          //Pour une image de fond
	          g.drawImage(img, 0, 0, this.getWidth(), this.getHeight(), this);
	        } catch (IOException e) {
	          e.printStackTrace();
	        }   
	      }
	     if(n==49) {g.setColor(Color.red);
	      
	      try {
	          Image img = ImageIO.read(new File("immeuble.png"));
	          
	          //Pour une image de fond
	          g.drawImage(img, 0, 0, this.getWidth(), this.getHeight(), this);
	        } catch (IOException e) {
	          e.printStackTrace();
	        }   
	      }
	     if(n==50) {g.setColor(Color.red);
	      
	      try {
	          Image img = ImageIO.read(new File("ovni.jpg"));
	          
	          //Pour une image de fond
	          g.drawImage(img, 0, 0, this.getWidth(), this.getHeight(), this);
	        } catch (IOException e) {
	          e.printStackTrace();
	        }   
	      }
	     if(n==51) {g.setColor(Color.red);
	      
	      try {
	          Image img = ImageIO.read(new File("hospice.png"));
	          
	          //Pour une image de fond
	          g.drawImage(img, 0, 0, this.getWidth(), this.getHeight(), this);
	        } catch (IOException e) {
	          e.printStackTrace();
	        }   
	      }
	     if(n==52) {g.setColor(Color.red);
	      
	      try {
	          Image img = ImageIO.read(new File("brico.gif"));
	          
	          //Pour une image de fond
	          g.drawImage(img, 0, 0, this.getWidth(), this.getHeight(), this);
	        } catch (IOException e) {
	          e.printStackTrace();
	        }   
	      }
	     if(n==53) {g.setColor(Color.red);
	      
	      try {
	          Image img = ImageIO.read(new File("enterrer.gif"));
	          
	          //Pour une image de fond
	          g.drawImage(img, 0, 0, this.getWidth(), this.getHeight(), this);
	        } catch (IOException e) {
	          e.printStackTrace();
	        }   
	      }
	     if(p>0){
	      g.setColor(Color.yellow);  
	      g.fillOval(x/2-x/16, y/8, x/8, x/8);
	      g.fillRect(x/2-x/8, x/8+y/8, x/4,3*y/8 );
	      g.fillRect(x/2-x/8,x/8+y/8+3*y/8, x/12, y/4); 
	      g.fillRect(13*x/24,x/8+y/8+3*y/8, x/12, y/4);
	      g.setColor(Color.blue);
	      if(p==1){g.drawString("E", x/2-x/16, y/2+y/8);}
	      if(p==2){g.drawString("V", x/2-x/16, y/2+y/8);}
	      if(p==3){g.drawString("C", x/2-x/16, y/2+y/8);}
	      if(p==4){g.drawString("L", x/2-x/16, y/2+y/8);}
	   }  
	    //mettre un cadre
	     g.setColor(Color.green);
	     g.drawRect(0, 0, this.getWidth(), this.getHeight());   
	        
	     
	   }
	}

