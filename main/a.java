import java.util.*;
import java.io.IOException;
import java.lang.*;

class a{

	static Scanner sb=new Scanner(System.in);
	static Scanner ssb=new Scanner(System.in);
	static Random dsb=new Random();

	public static final String ANSI_RESET = "\u001B[0m";
	public static final String ANSI_BLACK = "\u001B[30m";
	public static final String ANSI_RED = "\u001B[31m";
	public static final String ANSI_GREEN = "\u001B[32m";
	public static final String ANSI_YELLOW = "\u001B[33m";
	public static final String ANSI_BLUE = "\u001B[34m";
	public static final String ANSI_PURPLE = "\u001B[35m";
	public static final String ANSI_CYAN = "\u001B[36m";
	public static final String ANSI_WHITE = "\u001B[37m";

	

	static String[][] brd=new String[5][5];
	static {
		for(int i=0;i<5;i++)
		{
			for(int j=0;j<5;j++)
			{
				brd[i][j]="  ■  ";
			}
		}
	}
	
	//player's icon
	static int color;
	static String w=ANSI_YELLOW+"(‘ᾥ')"+ANSI_RESET;
	static String ww=ANSI_YELLOW+"('ᾥ’)"+ANSI_RESET;

	//player's position
	static int p1=4, p2=2; 

	//store player's move
	static char move;

	//player's three heart
	static String heart=ANSI_RED+"♥ ♥ ♥"+ANSI_RESET;

	
	//some magical tool helps me a lots
	static String magicwand;


	
	static String m1=" O_o ";
	static String m2=" o.O ";
	static String king="  XD ";

	//some wierd variables

	//player's three hp
	static int g;

	//to control menu
	static int menu;

	//
	static int fightstmt;

	

	//a variable to control animation
	static int anime=0;

	static {
			brd[2][0]=m1;
			brd[2][4]=m2;
			brd[0][2]=king;
	}



	//  Main  //


	public static void main(String [] args){
		cls();
		while(true)
		{
			cls();
			System.out.println("\n");
			System.out.println("╔════════════════════════════════════════════════╗");
			System.out.println("║     Welcome to The Adventure Of Emoticon!      ║ ");
			System.out.println("║                                                ║ ");
			System.out.println("║	Menu:                                    ║ ");
			System.out.println("║                                                ║ ");
			System.out.println("║		  【1. Start  】                 ║");
			System.out.println("║                                                ║");
			System.out.println("║		  【2. Skin   】                 ║ ");
			System.out.println("║                                                ║");
			System.out.println("║		  【3. Gameby 】                 ║ ");
			System.out.println("║                                                ║ ");
			System.out.println("║		  【4. Exit   】                 ║");
			System.out.println("║                                                ║");
			System.out.println("╚════════════════════════════════════════════════╝");
			System.out.println("");
			menu=sb.nextInt();
			menu();
			if(menu==1)
			{
				break;
			}
		}
		brd[4][2]=w;
		cls();
		disply();
		magicwand=ssb.nextLine();
		while(true){
			move=ssb.nextLine().charAt(0);
			switch(move)
			{
				case 'w':
					w();
					disply();
					break;
				case 'a':
					a();
					disply();
					break;
				case 's':
					s();
					disply();
					break;
				case 'd':
					d();
					disply();
					break;
			}
			if(p1==2&&p2==0)
			{
				bridge();
				mn1();
				mn1fightdisply();
			}
			else if(p1==0&&p2==2)
			{
			
			}
			else if(p1==2&&p2==4)
			{
			
			}
		}		
		

		
	}

	//  Main  //

	// Fight! //

//m1's fight
	
	static String fighttext="                       ";
	static String Attack="【1. Attack 】";
	static String Taunt="【3. Taunt  】";
	static String Backpack="【2.Backpack】";
	static String Escape="【4. Escape 】";

	//variable to control:
	
	//attack speed
	static int aspeed;
	
	public static void mn1fightdisply(){
		//m1's attack speed is 3
		mn1board();
		fightstmt=sb.nextInt();
		switch(fightstmt)
		{
			case 1:
				Attack="【1.  Bite  】";
				Taunt="【2. Murmur 】";
				Backpack="            ";
				Escape="            ";
				fightstmt=sb.nextInt();
				switch(fightstmt)
				{
					case 1:
						Attack="            ";
						Taunt="            ";
						fighttext="  Bite!                ";
						mn1board();
						
					case 2:
						Attack="            ";
						Taunt="            ";
						fighttext="  Murmur!               ";
						mn1board();
					
					
				}
				mn1board();
			case 2:
			
			case 3:
			
			case 4:
				
		}		
	}
	public static void mn1board(){
		cls();
		System.out.println("\n");
		System.out.println("    "+playershp+"      	     "+opponentshp);
		System.out.println("                       ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⡴⠶⢶⡄");
		System.out.println("                  ⠀     ⢀⡤⠤⣤⠀⠀⠀⠀⠀⠀⠀⠀⣾⠀⠀⠀⢿");
		System.out.println("                       ⢀⡟⠀⠀⠈⣧⠀⠀⠀⠀⠀⠀⠀⣿⠀⠀⠀⢸ ");
		System.out.println("                       ⠘⣇⠀⠀⢀⡟⠀⠀⠀⠀⠀⠀⠀⣿⠀⠀⠀⡾");
		System.out.println("                       ⠀⠙⠶⠶⠞⠁⠀⠀⠀⠀⠀⠀⠀⠈⠳⠶⠞ ");
		System.out.println("       ♕           ⠀    ⠀⠀⠀⠀⠀⢠⣤⣤⣤⣤⣤⡄     ");
		System.out.println("     "+ww+"        v.s                     ");
		System.out.println("  ╔═══════════════════════════════════╗");
		System.out.println("  ║ Fight begin! It's your turn now.  ║");
		System.out.println("  ║				      ║");
		System.out.println("  ║   "+Attack+"   "+Taunt+" ║");
		System.out.println("  ║"+fighttext+"            ║");
		System.out.println("  ║   "+Backpack+"   "+Escape+" ║");
		System.out.println("  ╚═══════════════════════════════════╝");
		System.out.println("\n");
	}


	// Fight! //

	// Tools //

	public static void w(){
		if(p1>0)
		{
			brd[p1][p2]="  ■  ";
			brd[p1-1][p2]=w;
			p1=p1-1;
		}
		else
		{
			System.out.println("You can't leave this map!");
		}
	}
	public static void a(){
		if(p2>0)
		{
			brd[p1][p2]="  ■  ";
			brd[p1][p2-1]=ww;
			p2=p2-1;
		}
		else
		{
			System.out.println("You can't leave this map!");
		}
	}
	public static void s(){
		if(p1<4)
		{
			brd[p1][p2]="  ■  ";
			brd[p1+1][p2]=w;
			p1=p1+1;
		}
		else
		{
			System.out.println("You can't leave this map!");
		}
	}
	public static void d(){
		if(p2<4)
		{
			brd[p1][p2]="  ■  ";
			brd[p1][p2+1]=ww;
			p2=p2+1;
		}
		else
		{
			System.out.println("You can't leave this map!");
		}
	}
		
	//menu switch
	public static void menu(){
		switch(menu)
		{
			case 1:
				cls();
				break;
			case 2:
				cls();
				w=ANSI_YELLOW+"(‘ᾥ')"+ANSI_RESET;
				System.out.println("	1."+w);
				System.out.println("");
				w=ANSI_GREEN+"(‘ᾥ')"+ANSI_RESET;
				System.out.println("		2."+w);
				System.out.println("");
				w=ANSI_BLUE+"(‘ᾥ')"+ANSI_RESET;
				System.out.println("			3."+w);
				System.out.println("");
				w=ANSI_PURPLE+"(‘ᾥ')"+ANSI_RESET;
				System.out.println("	4."+w);
				System.out.println("");
				w=ANSI_CYAN+"(‘ᾥ')"+ANSI_RESET;
				System.out.println("		5."+w);
				System.out.println("");
				w=ANSI_RED+"(‘ᾥ')"+ANSI_RESET;
				System.out.println("			6."+w);
				System.out.println("");
				System.out.println("Choose the skin you like!");
				color=ssb.nextInt();
				switch(color)
				{
					case 1:
						w=ANSI_YELLOW+"(‘ᾥ')"+ANSI_RESET;
						ww=ANSI_YELLOW+"('ᾥ’)"+ANSI_RESET;
						break;
					case 2:
						w=ANSI_GREEN+"(‘ᾥ')"+ANSI_RESET;
						ww=ANSI_GREEN+"('ᾥ’)"+ANSI_RESET;
						break;
					case 3:
						w=ANSI_BLUE+"(‘ᾥ')"+ANSI_RESET;
						ww=ANSI_BLUE+"('ᾥ’)"+ANSI_RESET;
						break;
					case 4:
						w=ANSI_PURPLE+"(‘ᾥ')"+ANSI_RESET;
						ww=ANSI_PURPLE+"('ᾥ’)"+ANSI_RESET;
						break;
					case 5:
						w=ANSI_CYAN+"(‘ᾥ')"+ANSI_RESET;
						ww=ANSI_CYAN+"('ᾥ’)"+ANSI_RESET;
						break;
					case 6:
						w=ANSI_RED+"(‘ᾥ')"+ANSI_RESET;
						ww=ANSI_RED+"('ᾥ’)"+ANSI_RESET;
						break;
					default:
						break;
				}
				break;
			case 3:
				cls();
				System.out.println("");
				System.out.println("");
				System.out.println("A game by"+ANSI_RED+" Zaviel Ho "+ANSI_RESET+"& his partner"+ANSI_CYAN+" Liu Kevin"+ANSI_RESET+" ! ");
				System.out.println("");
				System.out.println("");
				System.out.println("");
				System.out.println("			press enter to leave.");
				magicwand=sb.nextLine();
				magicwand=sb.nextLine();
				break;
			case 4:
				cls();
				System.exit(0);
				break;
		}
	}
	//print out the map

	static String maptext="                             Adventure Time!";
	
	public static void disply(){
		cls();
		System.out.println("");
		switch(g)
		{
			case 3:
				break;
			case 2:
				heart=heart.substring(0, 4)+"♡";
			case 1:
				heart=heart.substring(0, 3)+"♡";
			case 0:
				
				break;
		}
		System.out.println("╔══════════════════════════════════════════╗");
		System.out.println("║                                          ║");
		for(int i=0;i<5;i++)
		{
			System.out.print("║        ");
			for(int j=0;j<5;j++)
			{
				System.out.print(brd[i][j]);
			}
			System.out.print("         ║");
			System.out.println("\n║                                          ║");
			System.out.print("");
		}
		System.out.println("║                          "+heart+"           ║");
		System.out.println("╚══════════════════════════════════════════╝");
		System.out.println("");
		System.out.println(maptext);
	}


	
	public static void m1animattion(){
		cls();
		System.out.println("\n");
           	System.out.println("    "+playershp+"      	     "+opponentshp);
		System.out.println("                       ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀       ");
		System.out.println("                       ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀       ");
		System.out.println("                       ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀       ");
		System.out.println("                       ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀       ");
		System.out.println("                       ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀       ");
		System.out.println("       ♕           ⠀                      ");
		System.out.println("     "+w+"        v.s          "+m1+"        ");
		System.out.println("  ╔═══════════════════════════════════╗");
		System.out.println("  ║ Fight!                            ║");
		System.out.println("  ║				      ║");
		System.out.println("  ║				      ║");
		System.out.println("  ║"+text+"            ║");
		System.out.println("  ║				      ║");
		System.out.println("  ╚═══════════════════════════════════╝");
		System.out.println("\n");
	}
	
	static String   playershp="♥ ♥ ♥ ♥ ♥";
	static String opponentshp="♥ ♥ ♥ ♥ ♥";
	static int hpst=5;

	public static void minushp(){
		switch(hpst)
		{
			case 5:
				break;
			case 4:
				break;
			case 3:
				break;
			case 2:
				heart=heart.substring(0, 4)+"♡";
			case 1:
				heart=heart.substring(0, 3)+"♡";
			case 0:
				
				break;
		}
	}

	// Tools //


	
	// Animation //
	
	static String text="   : Hi!               ";

	public static void mn1(){
		int speedsetting=0;
		int i=700;
		
		try
		{
      			for(int j = 0 ; j<140 ; j++)
      			{
				if(speedsetting>10&&speedsetting<40)
				{
					i=70;
						
				}
				else if(speedsetting>40&&speedsetting<70)
				{
					i=30;
				}
				else if(speedsetting>70)
				{
					i=5;	
					text="   : What...happened???";
				}
				if(speedsetting==40)
				{
					text="   : What.             ";	
				}
				if(speedsetting==50)
				{
					text="   : What..            ";	
				}
				if(speedsetting==60)
				{
					text="   : What...           ";	
				}
        			switch(anime)
        			{
          				case 1:
						m1="O_o";
						m1animattion();
            					break;
          				case 2:
						m1="o_O";
						m1animattion();
            					break;
					default:
            					anime = 0;
        			}
				speedsetting++;
        			anime++;
     		   		Thread.sleep(i);
			
			}
			anime=1;
			m1="o_O";
			for(int l=0;l<16;l++)
			{
				switch(anime)
        			{
          				case 1:
						m1animattion();
            					break;
          				case 2:
						cls();
						System.out.println("\n");
						System.out.println("    "+playershp+"      	     "+opponentshp);
						System.out.println("                       ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⡴⠶⢶⡄");
						System.out.println("                  ⠀     ⢀⡤⠤⣤⠀⠀⠀⠀⠀⠀⠀⠀⣾⠀⠀⠀⢿");
						System.out.println("                       ⢀⡟⠀⠀⠈⣧⠀⠀⠀⠀⠀⠀⠀⣿⠀⠀⠀⢸ ");
						System.out.println("                       ⠘⣇⠀⠀⢀⡟⠀⠀⠀⠀⠀⠀⠀⣿⠀⠀⠀⡾");
						System.out.println("                       ⠀⠙⠶⠶⠞⠁⠀⠀⠀⠀⠀⠀⠀⠈⠳⠶⠞ ");
						System.out.println("       ♕           ⠀    ⠀⠀⠀⠀⠀⢠⣤⣤⣤⣤⣤⡄     ");
						System.out.println("     "+ww+"        v.s                     ");
						System.out.println("  ╔═══════════════════════════════════╗");
						System.out.println("  ║ Fight!                            ║");
						System.out.println("  ║				      ║");
						System.out.println("  ║				      ║");
						System.out.println("  ║"+text+"            ║");
						System.out.println("  ║				      ║");
						System.out.println("  ╚═══════════════════════════════════╝");
						System.out.println("\n");
            					break;
					default:
            					anime = 0;
        			}
				speedsetting++;
        			anime++;
     		   		Thread.sleep(150);
			}

		
		}
		catch(InterruptedException e)
		{
			System.out.println("I'm useless. Since there's no thread will interrupt.");
		}
	}
	public static void mn2(){
	
	}

	// Aniamtion //

	public static void bridge(){
		try
		{
      			for(int j = 0 ; j<20 ; j++)
      			{
        			switch(anime)
        			{
					case 1:
						cls();
						System.out.println("■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■");
           					System.out.println("■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■");
						System.out.println("■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■");
						System.out.println("■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■");
						System.out.println("■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■");
						System.out.println("■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■");
						System.out.println("■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■");
						System.out.println("■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■");
						System.out.println("■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■");
						System.out.println("■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■");
						System.out.println("■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■");
						System.out.println("■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■");
						System.out.println("■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■");
						System.out.println("■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■");
						System.out.println("■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■");
						System.out.println("■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■");
            					break;
					case 2:
						cls();
						System.out.println("■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■");
           					System.out.println("■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■");
						System.out.println("■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■");
						System.out.println("■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■");
						System.out.println("■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■");
						System.out.println("■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■");
						System.out.println("■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■");
						System.out.println("■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■");
						System.out.println("■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■");
						System.out.println("□■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■");
						System.out.println("□□■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■");
						System.out.println("□□□■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■");
						System.out.println("□□□□■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■");
						System.out.println("□□□□□■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■");
						System.out.println("□□□□□□□■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■");
						System.out.println("□□□□□□□□□■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■");
            					break;
					case 3:
						cls();
						System.out.println("■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■");
           					System.out.println("■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■");
						System.out.println("■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■");
						System.out.println("■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■");
						System.out.println("■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■");
						System.out.println("■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■");
						System.out.println("■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■");
						System.out.println("■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■");
						System.out.println("■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■");
						System.out.println("□■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■");
						System.out.println("□□■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■");
						System.out.println("□□□■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■");
						System.out.println("□□□□□■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■");
						System.out.println("□□□□□□□■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■");
						System.out.println("□□□□□□□□□■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■");
						System.out.println("□□□□□□□□□□□□■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■");
            					break;
					case 4:
						cls();
						System.out.println("■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■");
           					System.out.println("■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■");
						System.out.println("■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■");
						System.out.println("■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■");
						System.out.println("■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■");
						System.out.println("■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■");
						System.out.println("■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■");
						System.out.println("□■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■");
						System.out.println("□□■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■");
						System.out.println("□□□□■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■");
						System.out.println("□□□□□□■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■");
						System.out.println("□□□□□□□□■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■");
						System.out.println("□□□□□□□□□□□■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■");
						System.out.println("□□□□□□□□□□□□□■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■");
						System.out.println("□□□□□□□□□□□□□□□□■■■■■■■■■■■■■■■■■■■■■■■■■■■");
						System.out.println("□□□□□□□□□□□□□□□□□□□□□■■■■■■■■■■■■■■■■■■■■■■");
            					break;
					case 5:
						cls();
						System.out.println("■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■");
           					System.out.println("■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■");
						System.out.println("■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■");
						System.out.println("□■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■");
						System.out.println("□□■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■");
						System.out.println("□□□■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■");
						System.out.println("□□□□□■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■");
						System.out.println("□□□□□□□■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■");
						System.out.println("□□□□□□□□■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■");
						System.out.println("□□□□□□□□□□■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■");
						System.out.println("□□□□□□□□□□□□■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■");
						System.out.println("□□□□□□□□□□□□□□■■■■■■■■■■■■■■■■■■■■■■■■■■■■■");
						System.out.println("□□□□□□□□□□□□□□□□□■■■■■■■■■■■■■■■■■■■■■■■■■■");
						System.out.println("□□□□□□□□□□□□□□□□□□□■■■■■■■■■■■■■■■■■■■■■■■■");
						System.out.println("□□□□□□□□□□□□□□□□□□□□□□■■■■■■■■■■■■■■■■■■■■■");
						System.out.println("□□□□□□□□□□□□□□□□□□□□□□□□□□□■■■■■■■■■■■■■■■■");
            					break;
					case 6:
						cls();
						System.out.println("□■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■");
           					System.out.println("□□■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■");
						System.out.println("□□□■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■");
						System.out.println("□□□□□□■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■");
						System.out.println("□□□□□□□■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■");
						System.out.println("□□□□□□□□■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■");
						System.out.println("□□□□□□□□□□■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■");
						System.out.println("□□□□□□□□□□□□■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■");
						System.out.println("□□□□□□□□□□□□□■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■");
						System.out.println("□□□□□□□□□□□□□□□■■■■■■■■■■■■■■■■■■■■■■■■■■■■");
						System.out.println("□□□□□□□□□□□□□□□□□■■■■■■■■■■■■■■■■■■■■■■■■■■");
						System.out.println("□□□□□□□□□□□□□□□□□□□■■■■■■■■■■■■■■■■■■■■■■■■");
						System.out.println("□□□□□□□□□□□□□□□□□□□□□□■■■■■■■■■■■■■■■■■■■■■");
						System.out.println("□□□□□□□□□□□□□□□□□□□□□□□□■■■■■■■■■■■■■■■■■■■");
						System.out.println("□□□□□□□□□□□□□□□□□□□□□□□□□□□■■■■■■■■■■■■■■■■");
						System.out.println("□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□■■■■■■■■■■■");
            					break;
					case 7:
						cls();
						System.out.println("□□■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■");
           					System.out.println("□□□□□■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■");
						System.out.println("□□□□□□■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■");
						System.out.println("□□□□□□□□□■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■");
						System.out.println("□□□□□□□□□□■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■");
						System.out.println("□□□□□□□□□□□■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■");
						System.out.println("□□□□□□□□□□□□□■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■");
						System.out.println("□□□□□□□□□□□□□□□■■■■■■■■■■■■■■■■■■■■■■■■■■■■");
						System.out.println("□□□□□□□□□□□□□□□□□□■■■■■■■■■■■■■■■■■■■■■■■■■");
						System.out.println("□□□□□□□□□□□□□□□□□□□□■■■■■■■■■■■■■■■■■■■■■■■");
						System.out.println("□□□□□□□□□□□□□□□□□□□□□□■■■■■■■■■■■■■■■■■■■■■");
						System.out.println("□□□□□□□□□□□□□□□□□□□□□□□□■■■■■■■■■■■■■■■■■■■");
						System.out.println("□□□□□□□□□□□□□□□□□□□□□□□□□□■■■■■■■■■■■■■■■■■");
						System.out.println("□□□□□□□□□□□□□□□□□□□□□□□□□□□□■■■■■■■■■■■■■■■");
						System.out.println("□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□■■■■■■■■■■■■");
						System.out.println("□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□■■■■■■■");
            					break;
					case 8:
						cls();
						System.out.println("□□□□■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■");
           					System.out.println("□□□□□■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■");
						System.out.println("□□□□□□□■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■");
						System.out.println("□□□□□□□□□□■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■");
						System.out.println("□□□□□□□□□□□□■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■");
						System.out.println("□□□□□□□□□□□□□□■■■■■■■■■■■■■■■■■■■■■■■■■■■■■");
						System.out.println("□□□□□□□□□□□□□□□□■■■■■■■■■■■■■■■■■■■■■■■■■■■");
						System.out.println("□□□□□□□□□□□□□□□□□□■■■■■■■■■■■■■■■■■■■■■■■■■");
						System.out.println("□□□□□□□□□□□□□□□□□□□□□■■■■■■■■■■■■■■■■■■■■■■");
						System.out.println("□□□□□□□□□□□□□□□□□□□□□□□□■■■■■■■■■■■■■■■■■■■");
						System.out.println("□□□□□□□□□□□□□□□□□□□□□□□□□□■■■■■■■■■■■■■■■■■");
						System.out.println("□□□□□□□□□□□□□□□□□□□□□□□□□□□□■■■■■■■■■■■■■■■");
						System.out.println("□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□■■■■■■■■■■■■");
						System.out.println("□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□■■■■■■■■■");
						System.out.println("□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□■■■■■■");
						System.out.println("□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□■■");
            					break;
					case 9:
						cls();
						System.out.println("□□□□■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■");
           					System.out.println("□□□□□■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■");
						System.out.println("□□□□□□□■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■");
						System.out.println("□□□□□□□□□□■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■");
						System.out.println("□□□□□□□□□□□□■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■");
						System.out.println("□□□□□□□□□□□□□□■■■■■■■■■■■■■■■■■■■■■■■■■■■■■");
						System.out.println("□□□□□□□□□□□□□□□□■■■■■■■■■■■■■■■■■■■■■■■■■■■");
						System.out.println("□□□□□□□□□□□□□□□□□□■■■■■■■■■■■■■■■■■■■■■■■■■");
						System.out.println("□□□□□□□□□□□□□□□□□□□□□■■■■■■■■■■■■■■■■■■■■■■");
						System.out.println("□□□□□□□□□□□□□□□□□□□□□□□□■■■■■■■■■■■■■■■■■■■");
						System.out.println("□□□□□□□□□□□□□□□□□□□□□□□□□□■■■■■■■■■■■■■■■■■");
						System.out.println("□□□□□□□□□□□□□□□□□□□□□□□□□□□□■■■■■■■■■■■■■■■");
						System.out.println("□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□■■■■■■■■■■■■");
						System.out.println("□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□■■■■■■■■■");
						System.out.println("□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□■■■■■■");
						System.out.println("□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□■■");
            					break;
					case 10:
						cls();
						System.out.println("□□□□□□□□□■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■");
           					System.out.println("□□□□□□□□□□■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■");
						System.out.println("□□□□□□□□□□□□■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■");
						System.out.println("□□□□□□□□□□□□□■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■");
						System.out.println("□□□□□□□□□□□□□□□□□■■■■■■■■■■■■■■■■■■■■■■■■■■");
						System.out.println("□□□□□□□□□□□□□□□□□□□■■■■■■■■■■■■■■■■■■■■■■■■");
						System.out.println("□□□□□□□□□□□□□□□□□□□□□■■■■■■■■■■■■■■■■■■■■■■");
						System.out.println("□□□□□□□□□□□□□□□□□□□□□□□■■■■■■■■■■■■■■■■■■■■");
						System.out.println("□□□□□□□□□□□□□□□□□□□□□□□□□□■■■■■■■■■■■■■■■■■");
						System.out.println("□□□□□□□□□□□□□□□□□□□□□□□□□□□□□■■■■■■■■■■■■■■");
						System.out.println("□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□■■■■■■■■■■■■");
						System.out.println("□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□■■■■■■■■■■■");
						System.out.println("□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□■■■■■■■■");
						System.out.println("□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□■■■■");
						System.out.println("□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□■■■");
						System.out.println("□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□");
            					break;
					case 11:
						cls();
						System.out.println("□□□□□□□□□□□■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■");
           					System.out.println("□□□□□□□□□□□□■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■");
						System.out.println("□□□□□□□□□□□□□□■■■■■■■■■■■■■■■■■■■■■■■■■■■■■");
						System.out.println("□□□□□□□□□□□□□□□■■■■■■■■■■■■■■■■■■■■■■■■■■■■");
						System.out.println("□□□□□□□□□□□□□□□□□□□■■■■■■■■■■■■■■■■■■■■■■■■");
						System.out.println("□□□□□□□□□□□□□□□□□□□□□■■■■■■■■■■■■■■■■■■■■■■");
						System.out.println("□□□□□□□□□□□□□□□□□□□□□□□■■■■■■■■■■■■■■■■■■■■");
						System.out.println("□□□□□□□□□□□□□□□□□□□□□□□□□□■■■■■■■■■■■■■■■■■");
						System.out.println("□□□□□□□□□□□□□□□□□□□□□□□□□□□□■■■■■■■■■■■■■■■");
						System.out.println("□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□■■■■■■■■■■■■");
						System.out.println("□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□■■■■■■■■■■");
						System.out.println("□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□■■■■■■■■");
						System.out.println("□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□■■■■■");
						System.out.println("□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□■■");
						System.out.println("□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□");
						System.out.println("□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□");
            					break;
					case 12:
						cls();
						System.out.println("□□□□□□□□□□□□□■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■");
           					System.out.println("□□□□□□□□□□□□□□■■■■■■■■■■■■■■■■■■■■■■■■■■■■■");
						System.out.println("□□□□□□□□□□□□□□□□■■■■■■■■■■■■■■■■■■■■■■■■■■■");
						System.out.println("□□□□□□□□□□□□□□□□□□□■■■■■■■■■■■■■■■■■■■■■■■■");
						System.out.println("□□□□□□□□□□□□□□□□□□□□□■■■■■■■■■■■■■■■■■■■■■■");
						System.out.println("□□□□□□□□□□□□□□□□□□□□□□□■■■■■■■■■■■■■■■■■■■■");
						System.out.println("□□□□□□□□□□□□□□□□□□□□□□□□□■■■■■■■■■■■■■■■■■■");
						System.out.println("□□□□□□□□□□□□□□□□□□□□□□□□□□□□■■■■■■■■■■■■■■■");
						System.out.println("□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□■■■■■■■■■■■■■");
						System.out.println("□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□■■■■■■■■■■");
						System.out.println("□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□■■■■■■■■");
						System.out.println("□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□■■■■■■");
						System.out.println("□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□■■");
						System.out.println("□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□");
						System.out.println("□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□");
						System.out.println("□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□");
            					break;
					case 13:
						cls();
						System.out.println("□□□□□□□□□□□□□□□■■■■■■■■■■■■■■■■■■■■■■■■■■■■");
           					System.out.println("□□□□□□□□□□□□□□□□□■■■■■■■■■■■■■■■■■■■■■■■■■■");
						System.out.println("□□□□□□□□□□□□□□□□□□□■■■■■■■■■■■■■■■■■■■■■■■■");
						System.out.println("□□□□□□□□□□□□□□□□□□□□□□■■■■■■■■■■■■■■■■■■■■■");
						System.out.println("□□□□□□□□□□□□□□□□□□□□□□□□■■■■■■■■■■■■■■■■■■■");
						System.out.println("□□□□□□□□□□□□□□□□□□□□□□□□□□□■■■■■■■■■■■■■■■■");
						System.out.println("□□□□□□□□□□□□□□□□□□□□□□□□□□□□□■■■■■■■■■■■■■■");
						System.out.println("□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□■■■■■■■■■■■");
						System.out.println("□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□■■■■■■■■■");
						System.out.println("□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□■■■■■■");
						System.out.println("□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□■■■■");
						System.out.println("□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□■■");
						System.out.println("□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□");
						System.out.println("□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□");
						System.out.println("□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□");
						System.out.println("□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□");
            					break;
					case 14:
						cls();
						System.out.println("□□□□□□□□□□□□□□□□□■■■■■■■■■■■■■■■■■■■■■■■■■■");
           					System.out.println("□□□□□□□□□□□□□□□□□□□■■■■■■■■■■■■■■■■■■■■■■■■");
						System.out.println("□□□□□□□□□□□□□□□□□□□□□■■■■■■■■■■■■■■■■■■■■■■");
						System.out.println("□□□□□□□□□□□□□□□□□□□□□□□□■■■■■■■■■■■■■■■■■■■");
						System.out.println("□□□□□□□□□□□□□□□□□□□□□□□□□□■■■■■■■■■■■■■■■■■");
						System.out.println("□□□□□□□□□□□□□□□□□□□□□□□□□□□□■■■■■■■■■■■■■■■");
						System.out.println("□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□■■■■■■■■■■■■");
						System.out.println("□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□■■■■■■■■■");
						System.out.println("□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□■■■■■");
						System.out.println("□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□■■");
						System.out.println("□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□");
						System.out.println("□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□");
						System.out.println("□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□");
						System.out.println("□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□");
						System.out.println("□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□");
						System.out.println("□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□");
            					break;
					case 15:
						cls();
						System.out.println("□□□□□□□□□□□□□□□□□□□□□■■■■■■■■■■■■■■■■■■■■■■");
           					System.out.println("□□□□□□□□□□□□□□□□□□□□□□□□■■■■■■■■■■■■■■■■■■■");
						System.out.println("□□□□□□□□□□□□□□□□□□□□□□□□□□□■■■■■■■■■■■■■■■■");
						System.out.println("□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□■■■■■■■■■■■■■");
						System.out.println("□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□■■■■■■■■■■■");
						System.out.println("□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□■■■■■■■■■");
						System.out.println("□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□■■■■■■");
						System.out.println("□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□■■■");
						System.out.println("□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□■");
						System.out.println("□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□");
						System.out.println("□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□");
						System.out.println("□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□");
						System.out.println("□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□");
						System.out.println("□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□");
						System.out.println("□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□");
						System.out.println("□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□");
            					break;
					case 16:
						cls();
						System.out.println("□□□□□□□□□□□□□□□□□□□□□□□□□□□■■■■■■■■■■■■■■■■");
           					System.out.println("□□□□□□□□□□□□□□□□□□□□□□□□□□□□□■■■■■■■■■■■■■■");
						System.out.println("□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□■■■■■■■■■■■■");
						System.out.println("□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□■■■■■■■■■■");
						System.out.println("□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□■■■■■■■■");
						System.out.println("□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□■■■■■■");
						System.out.println("□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□■■■");
						System.out.println("□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□■");
						System.out.println("□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□");
						System.out.println("□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□");
						System.out.println("□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□");
						System.out.println("□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□");
						System.out.println("□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□");
						System.out.println("□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□");
						System.out.println("□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□");
						System.out.println("□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□");
            					break;
					case 17:
						cls();
						System.out.println("□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□■■■■■■■■■■■");
           					System.out.println("□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□■■■■■■■■■");
						System.out.println("□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□■■■■■■■");
						System.out.println("□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□■■■■");
						System.out.println("□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□■");
						System.out.println("□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□■");
						System.out.println("□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□");
						System.out.println("□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□");
						System.out.println("□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□");
						System.out.println("□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□");
						System.out.println("□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□");
						System.out.println("□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□");
						System.out.println("□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□");
						System.out.println("□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□");
						System.out.println("□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□");
						System.out.println("□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□");
            					break;
					case 18:
						cls();
						System.out.println("□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□■■■■■■");
           					System.out.println("□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□■■■■");
						System.out.println("□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□■■");
						System.out.println("□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□■");
						System.out.println("□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□");
						System.out.println("□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□");
						System.out.println("□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□");
						System.out.println("□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□");
						System.out.println("□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□");
						System.out.println("□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□");
						System.out.println("□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□");
						System.out.println("□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□");
						System.out.println("□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□");
						System.out.println("□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□");
						System.out.println("□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□");
						System.out.println("□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□");
            					break;
					case 19:
						cls();
						System.out.println("□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□");
           					System.out.println("□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□");
						System.out.println("□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□");
						System.out.println("□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□");
						System.out.println("□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□");
						System.out.println("□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□");
						System.out.println("□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□");
						System.out.println("□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□");
						System.out.println("□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□");
						System.out.println("□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□");
						System.out.println("□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□");
						System.out.println("□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□");
						System.out.println("□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□");
						System.out.println("□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□");
						System.out.println("□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□");
						System.out.println("□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□");
            					break;
					default:
            					anime = 0;
        			}
        			anime++;
     		   		Thread.sleep(8);
			
			}
		}
		catch(InterruptedException e)
		{
			System.out.println("I'm useless. Since there's no thread will interrupt.");
		}
	}
	public static void cls(){
   		try
		{
			//("cmd.exe","yourpath","cls")
			new ProcessBuilder("cmd.exe","/mnt/c","cls").inheritIO().start().waitFor();	
		}
		catch(Exception E)
		{
			System.out.println(E);
		}
  	}


}
