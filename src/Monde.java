import java.util.Vector;
public class Monde {

public 	Vector<Batiment> batiments=new Vector();

public Monde(){
	
	//mettre une ville en 0,0
	Ville v= new Ville(0,0);
	batiments.add(v);

	
	//mettre 20 batiment dans le désert
	for(int i=0;i<20;i++){
		int choix = (int) (Math.random() * 51 + 1);
		int x=1;int y=1;
		if(choix==1){Warehouse w=new Warehouse(x,y);	batiments.add(w);}
		if(choix==2){maison w=new maison(x,y);	batiments.add(w);}
		if(choix==3){	Ambulance w=new Ambulance(x,y);	batiments.add(w);}
		if(choix==4){	cachcont w=new cachcont(x,y);	batiments.add(w);}
		if(choix==5){	Camion w=new Camion(x,y);	batiments.add(w);}
		if(choix==6){	Labo w=new Labo(x,y);	batiments.add(w);}
		if(choix==7){	petitbois w=new petitbois(x,y);	batiments.add(w);}
		if(choix==8){	petitmaison w=new petitmaison(x,y);	batiments.add(w);}
		if(choix==9){	carcvoit w=new carcvoit(x,y);	batiments.add(w);}		
		if(choix==10){	carieffo w=new carieffo(x,y);	batiments.add(w);}
		if(choix==11){	cavofami w=new cavofami(x,y);	batiments.add(w);}
		if(choix==12){	caverne w=new caverne(x,y);	batiments.add(w);}
		if(choix==13){	cimeindi w=new cimeindi(x,y);	batiments.add(w);}
		if(choix==14){	ecolbrul w=new ecolbrul(x,y);	batiments.add(w);}
		if(choix==15){	kebab w=new kebab(x,y);	batiments.add(w);}
		if(choix==16){	parking w=new parking(x,y);	batiments.add(w);}
		if(choix==17){	vielpomp w=new vielpomp(x,y);	batiments.add(w);}
		if(choix==18){	villadela w=new villadela(x,y);	batiments.add(w);}
		if(choix==19){	velib w=new velib(x,y);	batiments.add(w);}
		if(choix==20){	avion w=new avion(x,y);	batiments.add(w);}
		if(choix==21){	chanabon w=new chanabon(x,y);	batiments.add(w);}
		if(choix==22){	meuble w=new meuble(x,y);	batiments.add(w);}
		if(choix==23){	parc w=new parc(x,y);	batiments.add(w);}
		if(choix==24){	pharma w=new pharma(x,y);	batiments.add(w);}
		if(choix==25){	route w=new route(x,y);	batiments.add(w);}
		if(choix==26){	market w=new market(x,y);	batiments.add(w);}
		if(choix==27){	armurerie w=new armurerie(x,y);	batiments.add(w);}
		if(choix==28){	bar w=new bar(x,y);	batiments.add(w);}
		if(choix==29){	hydro w=new hydro(x,y);	batiments.add(w);}
		if(choix==30){	fete w=new fete(x,y);	batiments.add(w);}
		if(choix==31){	tranche w=new tranche(x,y);	batiments.add(w);}
		if(choix==32){	abri w=new abri(x,y);	batiments.add(w);}
		if(choix==33){	abriatom w=new abriatom(x,y);	batiments.add(w);}
		if(choix==34){	commissariat w=new commissariat(x,y);	batiments.add(w);}
		if(choix==35){	cafe w=new cafe(x,y);	batiments.add(w);}
		if(choix==36){	biblio w=new biblio(x,y);	batiments.add(w);}
		if(choix==37){	poste w = new poste(x,y);	batiments.add(w);}
		if(choix==38){	cabane w=new cabane(x,y);	batiments.add(w);}
		if(choix==39){	epicerie w=new epicerie(x,y);	batiments.add(w);}
		if(choix==40){	fastfood w=new fastfood(x,y);	batiments.add(w);}
		if(choix==41){	mini w=new mini(x,y);	batiments.add(w);}
		if(choix==42){	silo w =new silo(x,y);	batiments.add(w);}
		if(choix==43){	villa w =new villa(x,y);	batiments.add(w);}
		if(choix==44){	avant_poste w=new avant_poste(x,y);	batiments.add(w);}
		if(choix==45){	cavern w=new cavern(x,y);	batiments.add(w);}
		if(choix==46){	Char w=new Char(x,y);	batiments.add(w);}
		if(choix==47){	hangars w=new hangars(x,y);	batiments.add(w);}
		if(choix==48){	immeuble w=new immeuble(x,y);	batiments.add(w);}
		if(choix==49){	ovni w=new ovni(x,y);	batiments.add(w);}
		if(choix==50){	hospice w=new hospice(x,y);	batiments.add(w);}
		if(choix==51){	brico w=new brico(x,y);	batiments.add(w);}
		
	}
	this.Placement();
}

void Placement()
{
	System.out.println("placement batiment ");
	//A donne le km au carree
    int[][] A=new int[201][201];
    for(int i=0;i<201;i++){
	    	for(int j=0;j<201;j++){
	    		A[i][j]=0;
	    	}
	    }
	System.out.println("matrice");
	A[101][101]=1;//placement de la ville
	for(int i=1;i<21;i++){//pour chaque batiment
		System.out.println("debut batiment n°"+i);
		int ma=batiments.get(i).max;int ma2=ma*ma;
		int mi=batiments.get(i).min;int mi2=mi*mi;
		boolean libre=true;
		while(libre){
			int x = (int) (Math.random() * 201 -100);
			int y = (int) (Math.random() * 201 -100);
			int d2=x*x+y*y;
			if((d2<ma2+1)&&(d2>mi2-1)&&(A[101+x][101+y]==0)){
				libre=false;
				System.out.println("batiment n°"+i+" type= "+batiments.get(i).Type());
				batiments.get(i).x=x;
				batiments.get(i).y=y;
				A[101+x][101+y]=1;
			}
		}
	}
}
}






