package kalki;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Kalki {
	
	JFrame window;
	JPanel TPanel, buttonpanel, maintextpanel, ch1, ch2, ch3, ch4, next,playerpanel1, playerpanel2, playerpanel3, enter;
	JLabel Tname, hp, hpnumber, weapon, weaponnumber, keys, keysnumber;
	Font Tfont = new Font("Times New Roman", Font.PLAIN,50);
	Font buttonfont = new Font("Times New Roman", Font.ITALIC,20);
	Font textfont = new Font("Times New Roman", Font.PLAIN,30);
	JButton button, C1, C2, C3, C4, nex, ent;
	JTextArea maintextarea;
	
	int hpnum, keycount, devil, mon1, mon2, mon3, mon4, mon5, mon6, mon7, mon8, mon9, k1, k2, k3, k4, k5, k6, k7, k8, k9;
	String weaponnum, position;
	
	TitleScreenHandler tshandler = new TitleScreenHandler();
	ChoiceHandler chandler = new ChoiceHandler();
	
	public static void main(String[] args) {
		
		new Kalki();
	}
	
	public Kalki()
	{
		window = new JFrame();
		window.setSize(800, 600);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.getContentPane().setBackground(Color.black);
		window.setLayout(null);
		
		TPanel = new JPanel();
		TPanel.setBounds(100, 100, 600, 100);
		TPanel.setBackground(Color.black);
		
		Tname = new JLabel("Kalki: The Final Adventure");
		Tname.setForeground(Color.YELLOW);
		Tname.setFont(Tfont);
		TPanel.add(Tname);
		
		buttonpanel = new JPanel();
		buttonpanel.setBounds(300,300, 200, 150);
		buttonpanel.setBackground(Color.black);
		
		button = new JButton("START");
		button.setBackground(Color.black);
		button.setForeground(Color.yellow);
		button.setFont(buttonfont);
		button.addActionListener(tshandler);
		button.setFocusPainted(false);
		buttonpanel.add(button);
		
		window.add(TPanel);
		window.add(buttonpanel);
		window.setVisible(true);
	}
	
	public void createGameScreen() {
		
		TPanel.setVisible(false);
		buttonpanel.setVisible(false);
		
		maintextpanel = new JPanel();
		maintextpanel.setBounds(100, 100, 600, 250);
		maintextpanel.setBackground(Color.black);
		
		
		maintextarea = new JTextArea("This is a text area.");
		maintextarea.setBounds(100, 100, 600, 200);
		maintextarea.setBackground(Color.black);
		maintextarea.setForeground(Color.yellow);
		maintextarea.setFont(textfont);
		maintextarea.setLineWrap(true);
		
		maintextpanel.add(maintextarea);
		
		window.add(maintextpanel);
		
		ch1 = new JPanel();
		ch1.setBounds(250, 350, 300, 50);
		ch1.setBackground(Color.black);
		
		ch2 = new JPanel();
		ch2.setBounds(50, 400, 300, 50);
		ch2.setBackground(Color.black);
		
		ch3 = new JPanel();
		ch3.setBounds(450, 400, 300, 50);
		ch3.setBackground(Color.black);
		
		ch4 = new JPanel();
		ch4.setBounds(250, 450, 300, 50);
		ch4.setBackground(Color.black);
		
		next = new JPanel();
		next.setBounds(550, 450, 300, 50);
		next.setBackground(Color.black);
		
		enter = new JPanel();
		enter.setBounds(350, 400, 100, 50);
		enter.setBackground(Color.black);
		
		window.add(ch1);
		window.add(ch2);
		window.add(ch3);
		window.add(ch4);
		window.add(next);
		window.add(enter);
		
		C1 = new JButton("Choice 1");
		C1.setBackground(Color.black);
		C1.setForeground(Color.yellow);
		C1.setFont(buttonfont);
		C1.setFocusPainted(false);
		ch1.add(C1);
		C1.addActionListener(chandler);
		C1.setActionCommand("c1");
		
		C2 = new JButton("Choice 2");
		C2.setBackground(Color.black);
		C2.setForeground(Color.yellow);
		C2.setFont(buttonfont);
		C2.setFocusPainted(false);
		ch2.add(C2);
		C2.addActionListener(chandler);
		C2.setActionCommand("c2");
		
		C3 = new JButton("Choice 3");
		C3.setBackground(Color.black);
		C3.setForeground(Color.yellow);
		C3.setFont(buttonfont);
		C3.setFocusPainted(false);
		ch3.add(C3);
		C3.addActionListener(chandler);
		C3.setActionCommand("c3");
		
		C4 = new JButton("Choice 4");
		C4.setBackground(Color.black);
		C4.setForeground(Color.yellow);
		C4.setFont(buttonfont);
		C4.setFocusPainted(false);
		ch4.add(C4);
		C4.addActionListener(chandler);
		C4.setActionCommand("c4");
		
		nex = new JButton("Next>");
		nex.setBackground(Color.black);
		nex.setForeground(Color.yellow);
		nex.setFont(buttonfont);
		nex.setFocusPainted(false);
		next.add(nex);
		nex.addActionListener(chandler);
		nex.setActionCommand("next");
		
		ent = new JButton("Enter");
		ent.setBackground(Color.black);
		ent.setForeground(Color.yellow);
		ent.setFont(buttonfont);
		ent.setFocusPainted(false);
		enter.add(ent);
		ent.addActionListener(chandler);
		ent.setActionCommand("enter");
		
		playerpanel1 = new JPanel();
		playerpanel1.setBounds(100, 15, 150, 50);
		playerpanel1.setBackground(Color.black);
		playerpanel1.setLayout(new GridLayout(1,2));
		
		playerpanel2 = new JPanel();
		playerpanel2.setBounds(250, 15, 300, 50);
		playerpanel2.setBackground(Color.black);
		playerpanel2.setLayout(new GridLayout(1,2));
		
		playerpanel3 = new JPanel();
		playerpanel3.setBounds(550, 15, 150, 50);
		playerpanel3.setBackground(Color.black);
		playerpanel3.setLayout(new GridLayout(1,2));
		
		hp = new JLabel("HP :");
		hp.setFont(textfont);
		hp.setForeground(Color.yellow);
		playerpanel1.add(hp);
		
		hpnumber = new JLabel();
		hpnumber.setFont(textfont);
		hpnumber.setForeground(Color.blue);
		playerpanel1.add(hpnumber);
		
		weapon = new JLabel("Weapon :");
		weapon.setFont(textfont);
		weapon.setForeground(Color.yellow);
		playerpanel2.add(weapon);
		
		weaponnumber = new JLabel();
		weaponnumber.setFont(textfont);
		weaponnumber.setForeground(Color.blue);
		playerpanel2.add(weaponnumber);
		
		keys = new JLabel("Keys:");
		keys.setFont(textfont);
		keys.setForeground(Color.yellow);
		playerpanel3.add(keys);
		
		keysnumber = new JLabel();
		keysnumber.setFont(textfont);
		keysnumber.setForeground(Color.blue);
		playerpanel3.add(keysnumber);
		
		window.add(playerpanel1);
		window.add(playerpanel2);
		window.add(playerpanel3);
		playersetup();
		
	}
	
	public void playersetup() {
		
		hpnum = 50;
		keycount = 0;
		mon1 = 50;
		mon2 = 50;
		mon3 = 50;
		mon4 = 50;
		mon5 = 50;
		mon6 = 50;
		mon7 = 50;
		mon8 = 50;
		mon9 = 50;
		k1 = 0;
		k2 = 0;k3 = 0;k4 = 0; k5 = 0; k6 = 0; k7 = 0; k8 = 0; k9 = 0;
		weaponnum = "Sword";
		weaponnumber.setText(weaponnum);
		hpnumber.setText(""+hpnum);
		keysnumber.setText(""+keycount);
		
		story1();
	}
	public void story1() {
		position = "story1";
		
		maintextarea.setText("This a Final adventure may by Kalki to open the\nsecret door present in Kailasa Mountain.\n");
		
		C1.setVisible(false);
		C2.setVisible(false);
		C3.setVisible(false);
		C4.setVisible(false);
		nex.setVisible(true);
		ent.setVisible(false);
	}
	
	public void story2() {
		position = "story2";
		
		maintextarea.setText("You have to collect all the Keys present in the\ndifferent temple and combine them to open secret door.\n\nYou have to start from siddhivinayak temple.");
		
		C1.setVisible(false);
		C2.setVisible(false);
		C3.setVisible(false);
		C4.setVisible(false);
		nex.setVisible(true);
		ent.setVisible(false);
		
	}
	
	public void siddhivinayak() {
		position = "siddhivinayak";
		
		maintextarea.setText("You are at Siddhivinayak temple.\n\nWhat do you do?");
		
		C4.setText("Padmanabhaswamy Temple");
		ent.setText("Enter");
		C1.setVisible(false);
		C2.setVisible(false);
		C3.setVisible(false);
		C4.setVisible(true);
		nex.setVisible(false);
		ent.setVisible(true);
	}
	
	public void monster1() {
		position = "monster1";
		
		maintextarea.setText("There is a Demon named Sumukha.\n\nWhat do you do?\n\n Demon HP: "+mon1);
		
		C1.setText("Attack");
		ent.setText("Exit");
		C1.setVisible(true);
		C2.setVisible(false);
		C3.setVisible(false);
		C4.setVisible(false);
		nex.setVisible(false);
		ent.setVisible(true);
	}
	
	public void padmanabhaswamy() {
		position = "padmanabhaswamy";
		
		maintextarea.setText("You are at Sree Padmanabhaswamy temple.\n\nWhat do you do?");
		
		C3.setText("Kanchi Kamkshi Temple");
		C1.setText("siddhivinayak Temple");
		ent.setText("Enter");
		C1.setVisible(true);
		C2.setVisible(false);
		C3.setVisible(true);
		C4.setVisible(false);
		nex.setVisible(false);
		ent.setVisible(true);
	}
	
	public void monster2() {
		position = "monster2";
		
		maintextarea.setText("There is a Demon named Naga Asur.\n\nWhat do you do? \n\nDemon HP: "+mon2);
		
		C1.setText("Attack");
		ent.setText("Exit");
		C1.setVisible(true);
		C2.setVisible(false);
		C3.setVisible(false);
		C4.setVisible(false);
		nex.setVisible(false);
		ent.setVisible(true);
	}
	
	public void kamakshi() {
		position = "kamakshi";
		
		maintextarea.setText("You are at Kanchi Kamkshi temple.\n\nWhat do you do?");
		
		C1.setText("Tirumala Temple");
		C2.setText("Padmanabhaswamy Temple");
		ent.setText("Enter");
		C1.setVisible(true);
		C2.setVisible(true);
		C3.setVisible(false);
		C4.setVisible(false);
		nex.setVisible(false);
		ent.setVisible(true);
	}
	
	public void monster3() {
		position = "monster3";
		
		maintextarea.setText("There is a Demon named Simhika.\n\nWhat do you do? \n\nDemon HP: "+mon3);
		
		C1.setText("Attack");
		ent.setText("Exit");
		C1.setVisible(true);
		C2.setVisible(false);
		C3.setVisible(false);
		C4.setVisible(false);
		nex.setVisible(false);
		ent.setVisible(true);
	}
	
	public void tirupati() {
		position = "tirupati";
		
		maintextarea.setText("You are at Tirumala temple.\n\nWhat do you do?");
		
		C3.setText("Konark Sun Temple");
		C4.setText("Kanchi Kamkshi Temple");
		ent.setText("Enter");
		C1.setVisible(false);
		C2.setVisible(false);
		C3.setVisible(true);
		C4.setVisible(true);
		nex.setVisible(false);
		ent.setVisible(true);
	}
	
	public void monster4() {
		position = "monster4";
		
		maintextarea.setText("There is a Demon named Kaliya.\n\nWhat do you do? \n\nDemon HP: "+mon4);
		
		C1.setText("Attack");
		ent.setText("Exit");
		C1.setVisible(true);
		C2.setVisible(false);
		C3.setVisible(false);
		C4.setVisible(false);
		nex.setVisible(false);
		ent.setVisible(true);
	}
	
	public void sunTemple() {
		position = "sunTemple";
		
		maintextarea.setText("You are at Konark Sun temple.\n\nWhat do you do?");
		
		C2.setText("Tirumala Temple");
		C3.setText("Puri Jagannadh Temple");
		ent.setText("Enter");
		C1.setVisible(false);
		C2.setVisible(true);
		C3.setVisible(true);
		C4.setVisible(false);
		nex.setVisible(false);
		ent.setVisible(true);
	}
	
	public void monster5() {
		position = "monster5";
		
		maintextarea.setText("There is a Demon named Mahishasura.\n\nWhat do you do?  \n\nDemon HP: "+mon5);
		
		C1.setText("Attack");
		ent.setText("Exit");
		C1.setVisible(true);
		C2.setVisible(false);
		C3.setVisible(false);
		C4.setVisible(false);
		nex.setVisible(false);
		ent.setVisible(true);
	}
	
	public void puriJagannadh() {
		position = "puriJagannadh";
		
		maintextarea.setText("You are at Puri Jagannadh temple.\n\nWhat do you do?");
		
		C2.setText("Konark Sun Temple");
		C1.setText("Kalighat Kali Temple");
		ent.setText("Enter");
		C1.setVisible(true);
		C2.setVisible(true);
		C3.setVisible(false);
		C4.setVisible(false);
		nex.setVisible(false);
		ent.setVisible(true);
	}
	
	public void monster6() {
		position = "monster6";
		
		maintextarea.setText("There is a Demon named Shakuni.\n\nWhat do you do?  \n\nDemon HP: "+mon6);
		
		C1.setText("Attack");
		ent.setText("Exit");
		C1.setVisible(true);
		C2.setVisible(false);
		C3.setVisible(false);
		C4.setVisible(false);
		nex.setVisible(false);
		ent.setVisible(true);
	}
	
	public void kalighatKali() {
		position = "kalighatKali";
		
		maintextarea.setText("You are at Kalighat Kali temple.\n\nWhat do you do");
		
		C4.setText("Puri Jagannadh Temple");
		C2.setText("Varanasi Temple");
		ent.setText("Enter");
		C1.setVisible(false);
		C2.setVisible(true);
		C3.setVisible(false);
		C4.setVisible(true);
		nex.setVisible(false);
		ent.setVisible(true);
	}
	
	public void monster7() {
		position = "monster7";
		
		maintextarea.setText("There is a Demon named Raktabija.\n\nWhat do you do? \n\nDemon HP: "+mon7);
		
		C1.setText("Attack");
		ent.setText("Exit");
		C1.setVisible(true);
		C2.setVisible(false);
		C3.setVisible(false);
		C4.setVisible(false);
		nex.setVisible(false);
		ent.setVisible(true);
	}
	
	public void varanasi() {
		position = "varanasi";
		
		maintextarea.setText("You are at Varanasi temple.\n\nWhat do you do?");
		
		C3.setText("Kalighat Kaliumala Temple");
		C1.setText("Kailasa Temple");
		ent.setText("Enter");
		C1.setVisible(true);
		C2.setVisible(false);
		C3.setVisible(true);
		C4.setVisible(false);
		nex.setVisible(false);
		ent.setVisible(true);
	}
	
	public void monster8() {
		position = "monster8";
		
		maintextarea.setText("There is a Demon named Bhasmasura.\n\nWhat do you do? \n\nDemon HP: "+mon8);
		
		C1.setText("Attack");
		ent.setText("Exit");
		C1.setVisible(true);
		C2.setVisible(false);
		C3.setVisible(false);
		C4.setVisible(false);
		nex.setVisible(false);
		ent.setVisible(true);
	}
	
	public void kailasa() {
		position = "kailasa";
		
		maintextarea.setText("You are at Kailasa Mountain.\n\nWhat do you do?");
		
		C4.setText("Varanasi Temple");
		ent.setText("Enter");
		C1.setVisible(false);
		C2.setVisible(false);
		C3.setVisible(false);
		C4.setVisible(true);
		nex.setVisible(false);
		ent.setVisible(true);
	}
	
	public void monster9() {
		position = "monster9";
		
		maintextarea.setText("There is a Demon named Kali.\n\nWhat do you do?\n\n Demon HP: "+mon9);
		
		C1.setText("Attack");
		ent.setText("Exit");
		C1.setVisible(true);
		C2.setVisible(false);
		C3.setVisible(false);
		C4.setVisible(false);
		nex.setVisible(false);
		ent.setVisible(true);
	}
	
	public void playerAttack() {
		position = "playerattack";
		
		int damage = 0;
		
		if(weaponnum.equals("Sword"))
		{
			damage = new java.util.Random().nextInt(8);
		}
		else if(weaponnum.equals("Garudastra")){
			damage = new java.util.Random().nextInt(12);
		}
		else if(weaponnum.equals("Nagastra")){
			damage = new java.util.Random().nextInt(16);
		}
		else if(weaponnum.equals("Pashupatastra")){
			damage = new java.util.Random().nextInt(20);
		}
		else if(weaponnum.equals("Vaishnavastra")){
			damage = new java.util.Random().nextInt(24);
		}
		else if(weaponnum.equals("Agneyastra")){
			damage = new java.util.Random().nextInt(28);
		}
		else if(weaponnum.equals("Narayanastra")){
			damage = new java.util.Random().nextInt(32);
		}
		else if(weaponnum.equals("Brahmashira Astra")){
			damage = new java.util.Random().nextInt(36);
		}
		else if(weaponnum.equals("Vajra")){
			damage = new java.util.Random().nextInt(40);
		}
		else if(weaponnum.equals("Brahmastra")){
			damage = new java.util.Random().nextInt(50);
		}
		maintextarea.setText("You attacked the Demon and gave "+damage+" damage!");
		
		switch(devil) {
			case 1 : mon1 = mon1 -damage;break;
			case 2 : mon2 = mon2 -damage;break;
			case 3 : mon3 = mon3 -damage;break;
			case 4 : mon4 = mon4 -damage;break;
			case 5 : mon5 = mon5 -damage;break;
			case 6 : mon6 = mon6 -damage;break;
			case 7 : mon7 = mon7 -damage;break;
			case 8 : mon8 = mon8 -damage;break;
			case 9 : mon9 = mon9 -damage;break;
		}
		C1.setVisible(false);
		C2.setVisible(false);
		C3.setVisible(false);
		C4.setVisible(false);
		nex.setVisible(true);
		ent.setVisible(false);
	}
	
	public void monsterAttack() {
		position = "monsterattack";
		
		
		int damage = 0;
		
		switch(devil) {
			case 1 : damage = new java.util.Random().nextInt(4);break;
			case 2 : damage = new java.util.Random().nextInt(6);break;
			case 3 : damage = new java.util.Random().nextInt(8);break;
			case 4 : damage = new java.util.Random().nextInt(10);break;
			case 5 : damage = new java.util.Random().nextInt(12);break;
			case 6 : damage = new java.util.Random().nextInt(14);break;
			case 7 : damage = new java.util.Random().nextInt(16);break;
			case 8 : damage = new java.util.Random().nextInt(18);break;
			case 9 : damage = new java.util.Random().nextInt(20);break;
		}
		maintextarea.setText("Demon attacked you and gave "+damage+" damage!");
		
		hpnum = hpnum - damage;
		hpnumber.setText(""+hpnum);
		
		C1.setVisible(false);
		C2.setVisible(false);
		C3.setVisible(false);
		C4.setVisible(false);
		nex.setVisible(true);
		ent.setVisible(false);
		
	}
	
	public void win() {
		position = "win";
		
		maintextarea.setText("Wow! You killed the Demon.\nYou got a key.\n(Your hp is recovered and weapon upgraded)");
		
		switch(devil) {
			case 1 : if(k1 == 0) {
				keycount++;
				k1 = 1;
			}
			break;
			case 2 : if(k2 == 0) {
				keycount++;
				k2 = 1;
			}
			break;
			case 3 : if(k3 == 0) {
				keycount++;
				k3 = 1;
			}
			break;
			case 4 : if(k4 == 0) {
				keycount++;
				k4 = 1;
			}
			break;
			case 5 : if(k5 == 0) {
				keycount++;
				k5 = 1;
			}
			break;
			case 6 : if(k6 == 0) {
				keycount++;
				k6 = 1;
			}
			break;
			case 7 : if(k7 == 0) {
				keycount++;
				k7 = 1;
			}
			break;
			case 8 : if(k8 == 0) {
				keycount++;
				k8 = 1;
			}
			break;
			case 9 : if(k9 == 0) {
				keycount++;
				k9 = 1;
			}
			break;
		}
		
		hpnum = 50;
		hpnumber.setText(""+hpnum);
		keysnumber.setText(""+keycount);
		
		C1.setVisible(false);
		C2.setVisible(false);
		C3.setVisible(false);
		C4.setVisible(false);
		nex.setVisible(true);
		ent.setVisible(false);
	}
	
	public void lose() {
		position = "lose";
		
		maintextarea.setText("You are Dead!\n\n<Adventure Failed>");
		
		C1.setVisible(false);
		C2.setVisible(false);
		C3.setVisible(false);
		C4.setVisible(false);
		nex.setVisible(false);
		ent.setVisible(false);
	}
	
	public void ending() {
		position = "ending";
		
		maintextarea.setText("Hail Kalki Maharaj!\n\nYou have completed the Final Adventure\n\n<THE END OF KALIYUG>");
		
		C1.setVisible(false);
		C2.setVisible(false);
		C3.setVisible(false);
		C4.setVisible(false);
		nex.setVisible(false);
		ent.setVisible(false);
	}
	
	public void incomplete() {
		position = "incomplete";
		
		maintextarea.setText("You didn't collect all the keys\nYou can't open the secret door.");
		
		C1.setVisible(false);
		C2.setVisible(false);
		C3.setVisible(false);
		C4.setVisible(false);
		nex.setVisible(true);
		ent.setVisible(false);
	}
	
	
	public class TitleScreenHandler implements ActionListener{
		
		public void actionPerformed(ActionEvent event) {
			
			createGameScreen();
		}
	}
	public class ChoiceHandler implements ActionListener{
		
		public void actionPerformed(ActionEvent event) {
			String ch = event.getActionCommand();
			switch(position) {
			case "story1":
				switch(ch) {
				case "next":story2();break;
				}
				break;
			case "story2":
				switch(ch) {
				case "next": siddhivinayak();break;
				}
				break;
			case "siddhivinayak":
				switch(ch) {
				case "enter":
					if(k1 == 1) {
						devil = 1;
						win();
					}
					else {
					monster1();
					}
					break;
				case "c4":padmanabhaswamy();break;
				}
				break;
			case "padmanabhaswamy":
				switch(ch) {
				case "c1": siddhivinayak(); break;
				case "c3": kamakshi(); break;
				case "enter":
					if(k2 == 1) {
						devil = 2;
						win();
					}
					else {
						monster2();
					}
					break;
				}
				break;
			case "kamakshi":
				switch(ch) {
				case "c1": tirupati();break;
				case "c2": padmanabhaswamy(); break;
				case "enter":
					if(k3 == 1) {
						devil = 3;
						win();
					}
					else {
						monster3();
					}
					break;
				}
				break;
			case "tirupati":
				switch(ch) {
				case "c3": sunTemple();break;
				case "c4": kamakshi(); break;
				case "enter":
					if(k4 == 1) {
						devil = 4;
						win();
					}
					else {
						monster4();
					}
					break;
				}
				break;
			case "sunTemple":
				switch(ch) {
				case "c2": tirupati();break;
				case "c3": puriJagannadh();break;
				case "enter":
					if(k5 == 1) {
						devil = 5;
						win();
					}
					else {
						monster5();
					}
					break;
				}
				break;
			case "puriJagannadh":
				switch(ch) {
				case "c1": kalighatKali();break;
				case "c2": sunTemple();break;
				case "enter":
					if(k6 == 1) {
						devil = 6;
						win();
					}
					else {
						monster6();
					}
					break;
				}
				break;
			case "kalighatKali":
				switch(ch) {
				case "c2": varanasi();break;
				case "c4": puriJagannadh();break;
				case "enter":
					if(k7 == 1) {
						devil = 7;
						win();
					}
					else {
						monster7();
					}
					break;
				}
				break;
			case "varanasi":
				switch(ch) {
				case "c1": kailasa();break;
				case "c3": kalighatKali();break;
				case "enter":
					if(k8 == 1) {
						devil = 8;
						win();
					}
					else {
						monster8();
					}
					break;
				}
				break;
			case "kailasa":
				switch(ch) {
				case "c4": varanasi();break;
				case "enter":
					if(k9 == 1) {
						devil = 9;
						win();
					}
					else {
						monster9();
					}
					break;
				}
				break;
				
			case "incomplete":
				switch(ch) {
				case "next": kailasa();break;
				}
			case "monster1":
				switch(ch) {
				case "enter":siddhivinayak();break;
				case "c1":
					devil = 1;
					playerAttack();break;
				}
				break;
			case "monster2":
				switch(ch) {
				case "enter":padmanabhaswamy();break;
				case "c1":
					devil = 2;
					playerAttack();break;
				}
				break;
			case "monster3":
				switch(ch) {
				case "enter":kamakshi();break;
				case "c1":
					devil = 3;
					playerAttack();break;
				}
				break;
			case "monster4":
				switch(ch) {
				case "enter":tirupati();break;
				case "c1":
					devil = 4;
					playerAttack();break;
				}
				break;
			case "monster5":
				switch(ch) {
				case "enter":sunTemple();break;
				case "c1":
					devil = 5;
					playerAttack();break;
				}
				break;
			case "monster6":
				switch(ch) {
				case "enter":puriJagannadh();break;
				case "c1":
					devil = 6;
					playerAttack();break;
				}
				break;
			case "monster7":
				switch(ch) {
				case "enter":kalighatKali();break;
				case "c1":
					devil = 7;
					playerAttack();break;
				}
				break;
			case "monster8":
				switch(ch) {
				case "enter":varanasi();break;
				case "c1":
					devil = 8;
					playerAttack();break;
				}
				break;	
			case "monster9":
				switch(ch) {
				case "enter":kailasa();break;
				case "c1":
					devil = 9;
					playerAttack();break;
				}
				break;	
				
			case "playerattack":
				switch(ch) {
				case "next":
					switch(devil) {
					case 1 : if(mon1 < 0) {
						win();
					}
					else {
						monsterAttack();
					}
					break;
					case 2 : if(mon2 < 0) {
						win();
					}
					else {
						monsterAttack();
					}
					break;
					case 3 : if(mon3 < 0) {
						win();
					}
					else {
						monsterAttack();
					}
					break;
					case 4 : if(mon4 < 0) {
						win();
					}
					else {
						monsterAttack();
					}
					break;
					case 5 : if(mon5 < 0) {
						win();
					}
					else {
						monsterAttack();
					}
					break;
					case 6 : if(mon6 < 0) {
						win();
					}
					else {
						monsterAttack();
					}
					break;
					case 7 : if(mon7 < 0) {
						win();
					}
					else {
						monsterAttack();
					}
					break;
					case 8 : if(mon8 < 0) {
						win();
					}
					else {
						monsterAttack();
					}
					break;
					case 9 : if(mon9 < 0) {
						win();
					}
					else {
						monsterAttack();
					}
					break;
					}
					break;
				}
				break;
			case "monsterattack":
				switch(ch) {
				case "next":
					if(hpnum<1) {
						lose();
					}
					else {
					switch(devil) {
					case 1 : monster1();break;
					case 2 : monster2();break;
					case 3 : monster3();break;
					case 4 : monster4();break;
					case 5 : monster5();break;
					case 6 : monster6();break;
					case 7 : monster7();;break;
					case 8 : monster8();break;
					case 9 : monster9();break;
					}
					}
				}
				break;
			case "win":
				switch(ch) {
				case "next":
					switch(devil) {
					case 1: 
						weaponnum = "Garudastra";
						weaponnumber.setText(weaponnum);
						siddhivinayak();break;
					case 2: 
						weaponnum = "Nagastra";
						weaponnumber.setText(weaponnum);
						padmanabhaswamy();break;
					case 3: 
						weaponnum = "Pashupatastra";
						weaponnumber.setText(weaponnum);
						kamakshi();break;
					case 4: 
						weaponnum = "Vaishnavastra";
						weaponnumber.setText(weaponnum);
						tirupati();break;
					case 5: 
						weaponnum = "Agneyastra";
						weaponnumber.setText(weaponnum);
						sunTemple();break;
					case 6: 
						weaponnum = "Narayanastra";
						weaponnumber.setText(weaponnum);
						puriJagannadh();break;
					case 7: 
						weaponnum = "Brahmashira Astra";
						weaponnumber.setText(weaponnum);
						kalighatKali();break;
					case 8: 
						weaponnum = "Vajra";
						weaponnumber.setText(weaponnum);
						varanasi();break;
					case 9: if(keycount == 9) {
						ending();
					}
					else {
						weaponnum = "Brahmastra";
						weaponnumber.setText(weaponnum);
						incomplete();
					}
					break;
					}
				}
				
			}
			
		}
	}
}