package ZarzadzaniePostacia;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

import Postac.Postac;

public class LewelUp extends JFrame implements ActionListener {

	private JLabel imie;
	private Postac postac;
	private JButton zatwierdz;
	private JComboBox<String> podajbonus1 = new JComboBox<String>();
	private JComboBox<String> podajbonus2 = new JComboBox<String>();

	public LewelUp(Postac postac) {
		this.postac = postac;

		setTitle("LewelUP");
		setSize(410, 410);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		setLayout(null);
		setVisible(true);
		setResizable(false);
		setBounds(450, 170, 410, 410);

		imie = new JLabel(postac.getImie());
		add(imie);

		podajbonus1.addItem("sila");
		podajbonus1.addItem("zwinnosc");
		podajbonus1.addItem("szybkosc");
		podajbonus1.addItem("wiedza naukowa");
		podajbonus1.addItem("znajomosc broni");
		podajbonus1.addItem("sily witalne");
		podajbonus1.addItem("wiedza codzienna");
		podajbonus1.addItem("wiedza budowlana");

		add(podajbonus1);

		podajbonus2.addItem("silaCiosu");
		podajbonus2.addItem("terzyznaFizyczna");
		podajbonus2.addItem("gurnik");

		podajbonus2.addItem("celnosc");
		podajbonus2.addItem("unik");
		podajbonus2.addItem("skradanie");

		podajbonus2.addItem("szybkoscCiosu");
		podajbonus2.addItem("szybkoscObrony");
		podajbonus2.addItem("inicjatywa");

		podajbonus2.addItem("anatomia");
		podajbonus2.addItem("traper");
		podajbonus2.addItem("zielarz");

		podajbonus2.addItem("rozbrojenie");
		podajbonus2.addItem("zbrojmistsz");
		podajbonus2.addItem("platnerz");

		podajbonus2.addItem("zdrowie");
		podajbonus2.addItem("kondycja");
		podajbonus2.addItem("pojemnoscZoladka");

		podajbonus2.addItem("gotowanie");
		podajbonus2.addItem("wetkarstwo");
		podajbonus2.addItem("wiedzaCodzienna");

		podajbonus2.addItem("maszynyOblerznicze");
		podajbonus2.addItem("budynkoObronne");
		podajbonus2.addItem("budynkiSocjalne");

		podajbonus1.setBounds(165, 70, 130, 20);
		podajbonus2.setBounds(165, 110, 130, 20);
		imie.setBounds(20, 20, 100, 20);
		add(podajbonus2);

		zatwierdz = new JButton("Zatwierdz");
		zatwierdz.setBounds(1, 1, 100, 20);
		add(zatwierdz);
		zatwierdz.addActionListener(this);

	}

	public static void main(String[] args) {
		int bottt = 1;
		String Zbroja = "";
		Postac postac = new Postac("Tesster", true, true, bottt, bottt, bottt,
				bottt, bottt, bottt, bottt, bottt, bottt, bottt, bottt, bottt,
				bottt, bottt, bottt, bottt, bottt, bottt, bottt, bottt, bottt,
				bottt, bottt, bottt, bottt, bottt, bottt, bottt, bottt, bottt,
				bottt, bottt, bottt, bottt, bottt, bottt, Zbroja, Zbroja,
				Zbroja, Zbroja, Zbroja, Zbroja, Zbroja);
		LewelUp to = new LewelUp(postac);

	}

	public void actionPerformed(ActionEvent e) {
		String color = podajbonus1.getSelectedItem().toString();

		if (color.equals("sila")) {
			((Postac) postac).setSila(((Postac) postac).getSila() + 2);
		} else if (color.equals("zwinnosc")) {
			((Postac) postac).setZwinnosc(((Postac) postac).getZwinnosc() + 2);
		} else if (color.equals("szybkosc")) {
			((Postac) postac).setSzybkosc(((Postac) postac).getSzybkosc() + 2);
		} else if (color.equals("wiedza naukowa")) {
			((Postac) postac).setWiedzaNaukowa(((Postac) postac)
					.getWiedzaNaukowa() + 2);
		} else if (color.equals("znajomosc broni")) {
			((Postac) postac).setZnajomoscBroni(((Postac) postac)
					.getZnajomoscBroni() + 2);
		} else if (color.equals("sily witalne")) {
			((Postac) postac)
					.setSilyWitalne(((Postac) postac).getSilyWitalne() + 2);
		} else if (color.equals("wiedza codzienna")) {
			((Postac) postac).setWiedzaCodzienna(((Postac) postac)
					.getWiedzaCodzienna() + 2);
		} else {
			((Postac) postac).setWiedzaBudowlana(((Postac) postac)
					.getWiedzaBudowlana() + 2);
		}

		System.out.println(((Postac) postac).getSila());

		if (color.equals("silaCiosu")) {
			postac.setSilaCiosu(postac.getSilaCiosu() + 2);
		} else if (color.equals("terzyznaFizyczna")) {
			((Postac) postac).setTerzyznaFizyczna(((Postac) postac)
					.getTerzyznaFizyczna() + 2);
		} else if (color.equals("gurnik")) {
			((Postac) postac).setGurnik(((Postac) postac).getGurnik() + 2);
		} else if (color.equals("celnosc")) {
			((Postac) postac).setCelnosc(((Postac) postac).getCelnosc() + 2);
		} else if (color.equals("unik")) {
			((Postac) postac).setUnik(((Postac) postac).getUnik() + 2);
		} else if (color.equals("skradanie")) {
			((Postac) postac)
					.setSkradanie(((Postac) postac).getSkradanie() + 2);
		} else if (color.equals("szybkoscCiosu")) {
			((Postac) postac).setSzybkoscCiosu(((Postac) postac)
					.getSzybkoscCiosu() + 2);
		} else if (color.equals("szybkoscObrony")) {
			((Postac) postac).setSzybkoscObrony(((Postac) postac)
					.getSzybkoscObrony() + 2);
		} else if (color.equals("inicjatywa")) {
			((Postac) postac)
					.setInicjatywa(((Postac) postac).getInicjatywa() + 2);
		} else if (color.equals("anatomia")) {
			((Postac) postac).setAnatomia(((Postac) postac).getAnatomia() + 2);
		} else if (color.equals("traper")) {
			((Postac) postac).setTraper(((Postac) postac).getTraper() + 2);
		} else if (color.equals("zielarz")) {
			((Postac) postac).setZielarz(((Postac) postac).getZielarz() + 2);
		} else if (color.equals("rozbrojenie")) {
			((Postac) postac)
					.setRozbrojenie(((Postac) postac).getRozbrojenie() + 2);
		} else if (color.equals("zbrojmistsz")) {
			((Postac) postac)
					.setZbrojmistsz(((Postac) postac).getZbrojmistsz() + 2);
		} else if (color.equals("platnerz")) {
			((Postac) postac).setPlatnerz(((Postac) postac).getPlatnerz() + 2);
		} else if (color.equals("zdrowie")) {
			((Postac) postac).setZdrowie(((Postac) postac).getZdrowie() + 2);

		} else if (color.equals("kondycja")) {
			((Postac) postac).setKondycja(((Postac) postac).getKondycja() + 2);
		} else if (color.equals("pojemnoscZoladka")) {
			((Postac) postac).setPojemnoscZoladka(((Postac) postac)
					.getPojemnoscZoladka() + 2);
		} else if (color.equals("gotowanie")) {
			((Postac) postac)
					.setGotowanie(((Postac) postac).getGotowanie() + 2);
		} else if (color.equals("wetkarstwo")) {
			((Postac) postac)
					.setWetkarstwo(((Postac) postac).getWetkarstwo() + 2);
		} else if (color.equals("wiedzaCodzienna")) {
			((Postac) postac).setWiedzaCodzienna(((Postac) postac)
					.getWiedzaCodzienna() + 2);
		} else if (color.equals("maszynyOblerznicze")) {
			((Postac) postac).setMaszynyOblerznicze(((Postac) postac)
					.getMaszynyOblerznicze() + 2);
		} else if (color.equals("budynkoObronne")) {
			((Postac) postac).setBudynkoObronne(((Postac) postac)
					.getBudynkoObronne() + 2);
		} else {
			((Postac) postac).setBudynkiSocjalne(((Postac) postac)
					.getBudynkiSocjalne() + 2);
		}

	}

}
