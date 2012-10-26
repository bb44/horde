import java.util.Vector;
public class Monde {

public 	Vector<Batiment> batiments=new Vector();

public Monde(){
	
	//mettre une ville en 0,0
	Ville v= new Ville(0,0);
	Warehouse w=new Warehouse(1,2);
	maison m=new maison(1,-2);
	Ambulance a=new Ambulance(-1,-1);
	cachcont c=new cachcont(-1,0);
	Camion ca=new Camion(-1,1);
	Labo l=new Labo(-1,2);
	petitbois pb=new petitbois(-1,3);
	petitmaison pm=new petitmaison(-1,4);
	carcvoit cv=new carcvoit(-1,5);
	carieffo ce=new carieffo(-1,6);
	cavofami cf=new cavofami(0,6);
	caverne cav=new caverne(0,5);
	cimeindi ci=new cimeindi(0,4);
	ecolbrul e=new ecolbrul(0,3);
	kebab k=new kebab(0,2);
	parking p=new parking(0,1);
	vielpomp vp=new vielpomp(0,-1);
	villadela vi=new villadela(0,-2);
	velib ve=new velib(0,-3);
	avion av=new avion(0,-4);
	chanabon ch=new chanabon(0,-5);
	meuble me=new meuble(0,-6);
	parc pa=new parc(1,-6);
	pharma ph=new pharma(1,-5);
	route r=new route(1,-4);
	market ma=new market(1,-3);
	armurerie ar=new armurerie(1,-1);
	bar b=new bar(1,0);
	hydro h=new hydro(1,1);
	fete f=new fete(1,3);
	tranche t=new tranche(1,4);
	abri ab=new abri(1,5);
	abriatom at=new abriatom(1,6);
	commissariat co=new commissariat(2,6);
	cafe caf=new cafe(2,5);
	batiments.add(v);
	batiments.add(w);
	batiments.add(m);
	batiments.add(a);
	batiments.add(c);
	batiments.add(ca);
	batiments.add(l);
	batiments.add(pb);
	batiments.add(pm);
	batiments.add(cv);
	batiments.add(ce);
	batiments.add(cf);
	batiments.add(cav);
	batiments.add(ci);
	batiments.add(e);
	batiments.add(k);
	batiments.add(p);
	batiments.add(vp);
	batiments.add(vi);
	batiments.add(ve);
	batiments.add(av);
	batiments.add(ch);
	batiments.add(me);
	batiments.add(pa);
	batiments.add(ph);
	batiments.add(r);
	batiments.add(ma);
	batiments.add(ar);
	batiments.add(b);
	batiments.add(h);
	batiments.add(f);
	batiments.add(t);
	batiments.add(ab);
	batiments.add(at);
	batiments.add(co);
	batiments.add(caf);
	}
}






