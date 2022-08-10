import java.util.*;
public class Jim{
 public static void main(String args[]){
 System.out.print("<<Enter amount of players [1,2, or training]:>> ");
 Scanner Start = new Scanner (System.in);
 String start= Start.next();
 String sta= start.toLowerCase();
 sta.trim();
 if(sta.equals("1") || sta.equals("one")){
    System.out.print("Tales of Jim - Fangame - pick your character[Cyborg,Knight,Archer,Healer,Assassin,Shieldsman,Warrior,Swordsman]:: ");
    Scanner Startup = new Scanner (System.in);
    String input= Startup.next();
    String inp= input.toLowerCase();
    inp.trim(); 
    String oppclass = " ";
    int player = 0;
    if(inp.equals("cyborg") || inp.equals("knight") || inp.equals("archer") || inp.equals("healer") || inp.equals("assassin") || inp.equals("shieldsman") || inp.equals("warrior") || inp.equals("swordsman")){
       System.out.println("\n");
    }else{ 
       System.out.println("\nX An unknown error occured\n");
    }
    System.out.println("Player chose "+ inp.toUpperCase());
    
    if(inp.equals("cyborg")){
          player=0;
    }
    if(inp.equals("knight")){
       player=1;
    }
    if(inp.equals("archer")){
          player=2;
    } 
    if(inp.equals("healer")){
          player=3;
    } 
    if(inp.equals("assassin")){
          player=4;
    } 
     if(inp.equals("shieldsman")){
          player=5;
    } 
    if(inp.equals("warrior")){
          player=6;
    } 
    if(inp.equals("swordsman")){
          player=7;
    } 
    int computer = (int)(Math.random() * 8) ;
    
    if (computer== 0){
       System.out.println("computer chose CYBORG");
       oppclass = "CYBORG";
    }
    else if (computer == 1){
       System.out.println("computer chose KNIGHT");
       oppclass = "KNIGHT";
    }
    else if (computer == 2){
       System.out.println("computer chose ARCHER");
       oppclass = "ARCHER";
    }
    else if (computer == 3){
       System.out.println("computer chose HEALER");
       oppclass = "HEALER";
    }
    else if (computer == 4){
       System.out.println("computer chose ASSASSIN");
       oppclass = "ASSASSIN";
    }
    else if (computer == 5){
       System.out.println("computer chose SHIELDSMAN");
       oppclass = "SHIELDSMAN";
    }
    else if (computer == 6){
       System.out.println("computer chose WARRIOR");
       oppclass = "WARRIOR";
    }
    else if (computer == 7){
       System.out.println("computer chose SWORDSMAN");
       oppclass = "SWORDSMAN";
    }
    
    double health = 0;
    double def = 0;
    double atk =  0;
    double matk =  0;
    double mdef =  0;
    double ohealth = 0;
    double odef = 0;
    double oatk = 0;
    double omatk =  0;
    double omdef =  0;
    
    if(player==0){
       health=  120;
       def= 1;
       atk= 0;
       matk= 7;
       mdef= 5;
    }else if(player==1){
       health= 200;
       def= 3;
       atk=  7;
       matk= 0;
       mdef= 1;
    }else if(player==2){
       health= 160;
       def= 2;
       atk= 5;
       matk= 0;
       mdef= 2;
    }else if(player==3){
       health= 200;
       def= 0;
       atk=  0;
       matk= 4;
       mdef= 10;
    }else if(player==4){
       health= 100;
       def= 0;
       atk=  0;
       matk= 0;
       mdef= 0;
    }else if(player==5){
       health= 100;
       def= 5;
       atk=  3;
       matk= 0;
       mdef= 5;
    }else if(player==6){
       health= 500;
       def= 0;
       atk=  0;
       matk= 0;
       mdef= 0;
    }else if(player==7){
       health= 200;
       def= 1;
       atk=  4;
       matk= 0;
       mdef= 10;
    }
    if(computer==0){
       ohealth=  120;
       odef= 1;
       oatk= 0;
       omatk= 7;
       omdef= 5;
    }else if(computer==1){
       ohealth= 200;
       odef= 3;
       oatk=  7;
       omatk= 0;
       omdef= 1;
    }else if(computer==2){
       ohealth= 160;
       odef= 2;
       oatk= 5;
       omatk= 0;
       omdef= 2;
    }else if(computer==3){
       ohealth= 200;
       odef= 0;
       oatk=  0;
       omatk= 4;
       omdef= 10;
    }else if(computer==4){
       ohealth= 100;
       odef= 0;
       oatk=  0;
       omatk= 0;
       omdef= 0;
    }else if(computer==5){
       ohealth= 100;
       odef= 5;
       oatk=  3;
       omatk= 0;
       omdef= 5;
    }else if(computer==6){
       ohealth= 500;
       odef= 0;
       oatk=  0;
       omatk= 0;
       omdef= 0;
    }else if(computer==7){
       ohealth= 200;
       odef= 1;
       oatk=  4;
       omatk= 0;
       omdef= 10;
    }
    
    boolean yes  = true;
    
    while(yes){
       System.out.println("\n");
       if(ohealth<0){
          ohealth=0;
       }
       if(health<0){
          health=0;
       }
       
       System.out.println(inp.toUpperCase()+" (You)                                                                          "+oppclass+" (Computer)");
       System.out.println("Health: "+health+"  Defence: "+def+ "                                                   "+"Opponent's Health: "+ohealth+"  Opponent's Defence: "+odef );
       System.out.println("Atk: "+atk+" mAtk:"+matk+" mDef:"+mdef+"                                                  Opponent's Atk:"+oatk+" Opponent's mAtk:"+omatk+" Opponent's mDef:"+omdef);
      
       /*death check*/
       if(health==0){
          System.out.print("\n");
          System.out.println("Computer wins <<You have fainted>>!");
          yes=false;
       }
       if(ohealth==0){
          System.out.print("\n");
           System.out.println("You win <<Opponent fainted>>!");
           yes=false;
       }
       
       if(player==0){
          System.out.print("\n");
          System.out.println("<<Cyborg Moves:>>");
          System.out.println("Explode: matk^2-opp.mdef*2");
          System.out.println("Beam: matk*4-opp.mdef^2");
          System.out.println("Ult: Energize: +1 matk");
          System.out.println("\n");
          Scanner Cyborgmove = new Scanner (System.in);
          String cyborg= Cyborgmove.next();
          String cy= cyborg.toLowerCase();
          cy.trim();
          if(cy.equals("explode")){
             ohealth-=(matk*matk)-(omdef*2);
          }else if(cy.equals("beam")){
             ohealth-=(matk*4)-(omdef*omdef);
          }else if(cy.equals("energize")){
             atk+=1;
          }else{
             System.out.println("\n");
             System.out.println("<<Move Wasted>>");
          }
       }
       else if(player==1){
          System.out.print("\n");
          System.out.println("<<Knight Moves:>>");
          System.out.println("Stab: atk*5-opp.def^2");
          System.out.println("Slash: atk*2-opp.def");
          System.out.println("Ult: Shine: +2 atk");
          System.out.println("\n");
          Scanner Knightmove = new Scanner (System.in);
          String knight= Knightmove.next();
          String k= knight.toLowerCase();
          k.trim();
          if(k.equals("stab")){
             ohealth-=(atk*5)-(odef*odef);
          }else if(k.equals("slash")){
             ohealth-=(atk*2)-(odef);
          }else if(k.equals("shine")){
             atk+=1;
          }else{
             System.out.println("\n");
             System.out.println("<<Move Wasted>>");
          }
       }
       else if(player==2){
          System.out.print("\n");
          System.out.println("<<Archer moves:>>");
          System.out.println("Shot: atk+ matk -opp.def");
          System.out.println("Snipe: +1 atk");
          System.out.println("Ult: Arrow Storm: Atk*3-opp.def^2");
          System.out.println("\n");
          Scanner Archermove = new Scanner (System.in);
          String archer= Archermove.next();
          String a= archer.toLowerCase();
          a.trim();
          if(a.equals("shot")){
             ohealth-=(atk+matk)-(odef);
          }else if(a.equals("snipe")){
            atk+=1;
          }else if(a.equals("arrow_storm")){
             ohealth-=(atk*3)-(odef*odef);
          }else{
             System.out.println("\n");
             System.out.println("<<Move Wasted>>");
          }     
          }
          else if(player==3){
             System.out.print("\n");
             System.out.println("<<Healer Moves:>>");
             System.out.println("Passive: Heal: +2.5 hp every turn");
             System.out.println("Stab: atk*2-opp.def");
             System.out.println("Ult: Shimmer: +2 health, +2 atk (perm)");
             System.out.println("\n");
             Scanner Healermove = new Scanner (System.in);
             String healer= Healermove.next();
             String h= healer.toLowerCase();
             h.trim();
          if(h.equals("stab")){
             ohealth-=(atk*2)-(odef);
             health+=2.5;
             System.out.println("\n");
             System.out.println("<<Healed for 2.5 hp>>");
          }else if(h.equals("shimmer")){
             health+=2;
             health+=2.5;
             atk+=2;
             System.out.println("\n");
             System.out.println("<<Healed for 2.5 hp>>");
          }else{   
             System.out.println("\n");
             System.out.println("<<Move Wasted>>");
             System.out.println("\n");
             System.out.println("<<Healed for 2.5 hp>>");
             health+=2.5;
          }
       }
       else if(player==4){
          System.out.print("\n");
          System.out.println("<<Assassin Moves:>>");
          System.out.println("Hidden Blade: atk^17-opp.def^2");
          System.out.println("Store: +.15 atk");
          System.out.println("Ult: Gaurd: +1 def");
          System.out.println("\n");
          Scanner Assassinmove = new Scanner (System.in);
          String assassin= Assassinmove.next();
          String as= assassin.toLowerCase();
          as.trim();
          if(as.equals("hidden_blade")){
             ohealth-=(atk*atk*atk*atk*atk*atk*atk*atk*atk*atk*atk*atk*atk*atk*atk*atk*atk)-(odef*odef);
          }else if(as.equals("store")){
             atk+=.15;
          }else if(as.equals("gaurd")){
             def+=1;
          }else{
             System.out.println("\n");
             System.out.println("<<Move Wasted>>");
          }
       }
       else if(player==5){
          System.out.print("\n");
          System.out.println("<<Shieldsman Moves:>>");
          System.out.println("Sheild Hit: atk*2.5-opp.def");
          System.out.println("Gaurd: +1 def, +1 mdef");
          System.out.println("Ult: Shield Bash: +1 atk");
          System.out.println("\n");
          Scanner Shieldsmanmove = new Scanner (System.in);
          String shieldsman= Shieldsmanmove.next();
          String shield= shieldsman.toLowerCase();
          shield.trim();
          if(shield.equals("shield_hit")){
             ohealth-=(atk*2.5)-(odef);
          }else if(shield.equals("gaurd")){
             def+=1;
             mdef+=1;
          }else if(shield.equals("shield_bash")){
             atk+=1;
          }else{
             System.out.println("\n");
             System.out.println("<<Move Wasted>>");
          }
       }
       else if(player==6){
          System.out.print("\n");
          System.out.println("<<Warrior Moves:>>");
          System.out.println("Punch: atk-o.def");
          System.out.println("Pushup: +1 atk");
          System.out.println("Ult: Enrage: atk doubles");
          System.out.println("\n");
          Scanner Warriormove = new Scanner (System.in);
          String warrior= Warriormove.next();
          String w= warrior.toLowerCase();
          w.trim();
          if(w.equals("punch")){
             ohealth-=(atk*2.5)-(odef);
          }else if(w.equals("pushup")){
            atk +=1;
          }else if(w.equals("enrage")){
            atk*=1.25;
          }else{
             System.out.println("\n");
             System.out.println("<<Move Wasted>>");
          }
       }
       else if(player==7){
          System.out.print("\n");
          System.out.println("<<Swordsman Moves:>>");
          System.out.println("Sharp Cut: (atk/3)");
          System.out.println("Intense Training: atk multiplies by 1.5");
          System.out.println("Ult: Ultimate Aura: +1 mdef, +5 health");
          System.out.println("\n");
          Scanner Swordsmanmove = new Scanner (System.in);
          String swordsman= Swordsmanmove.next();
          String sw= swordsman.toLowerCase();
          sw.trim();
          if(sw.equals("sharp_cut")){
             ohealth-=(atk/3);
          }else if(sw.equals("intense_training")){
            atk *= 1.5;
          }else if(sw.equals("ultimate_aura")){
            mdef+=1;
            health+=5;
          }else{
             System.out.println("\n");
             System.out.println("<<Move Wasted>>");
          }
       }
          if(computer==0){
             int dice = (int)(Math.random() * 3);
             if(dice==0){
                System.out.println("\n<<Opponent used explode>>");
                System.out.println("\n<<Opponent dealt "+((omatk*omatk)-(mdef*2))+" damage!>>");
                 health-=(omatk*omatk)-(mdef*2);
             }else if(dice==1){
                System.out.println("\n<<Opponent used beam>>");
                System.out.println("\n<<Opponent dealt "+((omatk*4)-(mdef*mdef))+" damage!>>");
                 health-=(omatk*4)-(mdef*mdef);
             }else  if(dice==2){
                System.out.println("\n<<Opponent used energize>>");
                System.out.println("\n<<Opponent gained one attack!>>");
                oatk+=1;
             }
          }
          else if(computer==1){
             int dice = (int)(Math.random() * 3);
             if(dice==0){
                System.out.println("\n<<Opponent Used Stab!>>");
                System.out.println("\n<<Opponent dealt "+((oatk*5)-(def*def))+" damage!");
                health-=(oatk*5)-(def*def);         
             }else if(dice==1){
                 System.out.println("\n<<Opponent Used Slash!>>");
                 System.out.println("\n<<Opponent dealt "+((oatk*2)-(def))+" damage!>>");
                 health-=(oatk*2)-(def);
             }else if(dice==2){
                System.out.println("\n<<Opponent Used Shine!>>");
                System.out.println("\n<<Opponent gained one attack!>>");
                oatk+=1;
             }
          }else if(computer==2){
            int dice = (int)(Math.random() * 3);
             if(dice==0){
             System.out.println("\n<<Opponent used Shot>>");
             System.out.println("\n<<Opponent dealt "+(oatk+ omatk -def)+" damage!>>");
             health-=oatk+ omatk -def;
             }else if(dice==1){
              System.out.println("\n<<Opponent used Snipe!>>"); 
              System.out.println("\n<<Opponent gained one attack!>>");
                oatk+=1;
             }else  if(dice==2){
                System.out.println("\n<<Opponent used Arrow Storm!>>");
                System.out.println("\n<<Opponent dealt "+((oatk*3)-(odef*odef))+" damage!>>");
                health-=(oatk*3)-(odef*odef);
             }
          }
          else if(computer==3){
             int dice = (int)(Math.random() * 2);
             if(dice==0){
             ohealth+=2.5;
             System.out.println("\n<<Opponent healed 2.5 hp!>>");
             System.out.println("\n<<Opponent used Shimmer>>"); 
             System.out.println("\n<<Opponent healed 2.5 hp and gained 2 attack!>>");
             ohealth+=2;
              oatk+=2;
             }else if(dice==1){
              System.out.println("\n<<Opponent healed 2.5 hp!>>");
                System.out.println("\n<<Opponent used Stab!>>");
                System.out.println("\n<<Opponent dealt "+(oatk*2-def)+" damage!>>");
                health-=oatk*2-def;
                ohealth+=2.5;
             }
          }
          else if(computer==4){
             int dice = (int)(Math.random() * 3);
             if(dice==0){
                System.out.println("\n<<Opponent used Hidden Blade!>>");
                System.out.println("\n<<Opponent dealt "+((oatk*oatk*oatk*oatk*oatk*oatk*oatk*oatk*oatk*oatk*oatk*oatk*oatk*oatk*oatk*oatk*oatk)-(def*def))+" damage!>>");
                health-=(oatk*oatk*oatk*oatk*oatk*oatk*oatk*oatk*oatk*oatk*oatk*oatk*oatk*oatk*oatk*oatk*oatk)-(def*def);
             }else if(dice==1){
                System.out.println("\n<<Opponent used Store!>>");
                System.out.println("\n<<Gained one attack!>>");
                oatk+=.15;
             }else  if(dice==2){
                System.out.println("\n<<Opponent used Gaurd!>>");
                System.out.println("\n<<Defence increased by one!>>");
                def+=1;
             }
          }  
        else if(computer==5){
             int dice = (int)(Math.random() * 3);
             if(dice==0){
                System.out.println("\n<<Opponent used Shield Hit!>>");
                System.out.println("\n<<Opponent dealt "+((oatk*2.5)-(def))+" damage");
                 health-=(oatk*2.5)-(def);
             }else if(dice==1){
                System.out.println("\n<<Opponent used Gaurd!>>");
                System.out.println("\n<<Opponent gained one def and mdef!>>");
                odef+=1;
                omdef+=1;
             }else  if(dice==2){
                System.out.println("\n<<Opponent used Shield Bash!>>");
                System.out.println("\n<<Opponent gained one atk!>>");
                oatk+=1;
             }
          }  
          else if(computer==6){
             int dice = (int)(Math.random() * 3);
             if(dice==0){
                System.out.println("\n<<Opponent used Punch!>>");
                System.out.println("\n<<Opponent dealt "+((oatk*2.5)-(def))+" damage");
                 health-=(oatk*2.5)-(def);
             }else if(dice==1){
                System.out.println("\n<<Opponent did a Pushup! Perfect Form!>>");
                System.out.println("\n<<Opponent gained one attack!>>");
                oatk+=1;
             }else  if(dice==2){
                System.out.println("\n<<Opponent used Enrage!>>");
                System.out.println("\n<<Opponent gained "+ oatk*1.25+" attack!>>");
                oatk*=1.25;
             }
          }  
          else if(computer==7){
             int dice = (int)(Math.random() * 3);
             if(dice==0){
                System.out.println("\n<<Opponent used Sharp Cut!>>");
                System.out.println("\n<<Opponent dealt "+(oatk/3)+" damage");
                 health-=(oatk/3);
             }else if(dice==1){
                System.out.println("\n<<Opponent did intense training! Worked up a sweat!>>");
                System.out.println("\n<<Opponent's attack increased by a scale of 1.5!!>>");
                oatk*=1.5;
             }else  if(dice==2){
                System.out.println("\n<<Opponent used Ultimate Aura!! The ground shook, too much power!!>>");
                System.out.println("\n<<Opponent gained 1 mdef!>>");
                System.out.println("\n<<Opponent healed 5 health!>>");
                omdef+=1;
                ohealth+=5;
             }
          }  

       }
    }else if(sta.equals("two")||sta.equals("2")){
       //2p code
        //2p code
        //2p code
        //2p code
        //2p code
        //2p code
        //2p code
        
    System.out.print("Tales of Jim - Fangame - pick your character, player one [Cyborg,Knight,Archer,Healer,Assassin,Shieldsman,Warrior,Swordsman]:: ");
    Scanner Startup = new Scanner (System.in);
    String input= Startup.next();
    String inp= input.toLowerCase();
    inp.trim(); 
    int player = 0;
    System.out.println("/");
    System.out.println("/");
    System.out.println("/");
    System.out.println("/");
    System.out.println("/");
     System.out.println("/");
     System.out.println("/");
     System.out.println("/");
     System.out.println("/");
     System.out.println("/");
     System.out.println("/");
     System.out.println("/");
     System.out.println("/");
     System.out.println("/");
     System.out.println("/");
    System.out.println("/");
    System.out.println("/");
    System.out.println("/");
     System.out.println("/");
     System.out.println("/");
     System.out.println("/");
     System.out.println("/");
     System.out.println("/");
     System.out.println("/");
     System.out.println("/");
     System.out.println("/");
     System.out.println("/");
     System.out.println("/");
     System.out.println("/");
     System.out.println("/");
     System.out.println("/");
     System.out.println("/");
     System.out.println("/");
    System.out.print("Tales of Jim - Fangame - pick your character, player two [Cyborg,Knight,Archer,Healer,Assassin,Shieldsman,Warrior,Swordsman]:: ");
    Scanner Startuptwo = new Scanner (System.in);
    String inputtwo= Startuptwo.next();
    String inptwo= inputtwo.toLowerCase();
    inptwo.trim(); 
    int computer = 0;
    
    
    if(inp.equals("cyborg") || inp.equals("knight") || inp.equals("archer") || inp.equals("healer") || inp.equals("assassin") || inp.equals("shieldsman") || inp.equals("warrior") || inp.equals("swordsman")){
       System.out.println("\n");
    }else{ 
       System.out.println("\nX An unknown error occured\n");
    }
    System.out.println("Player one chose "+ inp.toUpperCase());
    
    if(inptwo.equals("cyborg") || inptwo.equals("knight") || inptwo.equals("archer") || inptwo.equals("healer") || inptwo.equals("assassin") || inptwo.equals("shieldsman") || inptwo.equals("warrior") || inptwo.equals("swordsman")){
       System.out.println("\n");
    }else{ 
       System.out.println("\nX An unknown error occured\n");
    }
    System.out.println("Player two chose "+ inptwo.toUpperCase());
    
    
    if(inp.equals("cyborg")){
          player=0;
    }
    if(inp.equals("knight")){
       player=1;
    }
    if(inp.equals("archer")){
          player=2;
    } 
    if(inp.equals("healer")){
          player=3;
    } 
    if(inp.equals("assassin")){
          player=4;
    } 
     if(inp.equals("shieldsman")){
          player=5;
    } 
    if(inp.equals("warrior")){
          player=6;
    } 
    if(inp.equals("swordsman")){
       player=7;
    }
    
   if(inptwo.equals("cyborg")){
          computer=0;
    }
    if(inptwo.equals("knight")){
       computer=1;
    }
    if(inptwo.equals("archer")){
          computer=2;
    } 
    if(inptwo.equals("healer")){
          computer=3;
    } 
    if(inptwo.equals("assassin")){
          computer=4;
    } 
     if(inptwo.equals("shieldsman")){
          computer=5;
    } 
    if(inptwo.equals("warrior")){
          computer=6;
    } 
    if(inptwo.equals("swordsman")){
       computer=7;
    }
    double health = 0;
    double def = 0;
    double atk =  0;
    double matk =  0;
    double mdef =  0;
    double ohealth = 0;
    double odef = 0;
    double oatk = 0;
    double omatk =  0;
    double omdef =  0;
    
    if(player==0){
       health=  120;
       def= 1;
       atk= 0;
       matk= 7;
       mdef= 5;
    }else if(player==1){
       health= 200;
       def= 3;
       atk=  7;
       matk= 0;
       mdef= 1;
    }else if(player==2){
       health= 160;
       def= 2;
       atk= 5;
       matk= 0;
       mdef= 2;
    }else if(player==3){
       health= 200;
       def= 0;
       atk=  0;
       matk= 4;
       mdef= 10;
    }else if(player==4){
       health= 100;
       def= 0;
       atk=  0;
       matk= 0;
       mdef= 0;
    }else if(player==5){
       health= 100;
       def= 5;
       atk=  3;
       matk= 0;
       mdef= 5;
    }else if(player==6){
       health= 400;
       def= 0;
       atk=  0;
       matk= 0;
       mdef= 0;
    }else if(player==7){
       health= 200;
       def= 1;
       atk=  4;
       matk= 0;
       mdef= 10;
    }
    if(computer==0){
       ohealth=  120;
       odef= 1;
       oatk= 0;
       omatk= 7;
       omdef= 5;
    }else if(computer==1){
       ohealth= 200;
       odef= 3;
       oatk=  7;
       omatk= 0;
       omdef= 1;
    }else if(computer==2){
       ohealth= 160;
       odef= 2;
       oatk= 5;
       omatk= 0;
       omdef= 2;
    }else if(computer==3){
       ohealth= 200;
       odef= 0;
       oatk=  0;
       omatk= 4;
       omdef= 10;
    }else if(computer==4){
       ohealth= 100;
       odef= 0;
       oatk=  0;
       omatk= 0;
       omdef= 0;
    }else if(computer==5){
       ohealth= 100;
       odef= 5;
       oatk=  3;
       omatk= 0;
       omdef= 5;
    }else if(computer==6){
       ohealth= 400;
       odef= 0;
       oatk=  0;
       omatk= 0;
       omdef= 0;
    }else if(computer==7){
       ohealth= 200;
       odef= 1;
       oatk=  4;
       omatk= 0;
       omdef= 10;
    }
    //ended off on
    //ended off on
    //ended off on
    //ended off on
 //ended off on
 //ended off on
 //ended off on
    boolean yes  = true;
    
    while(yes){
       System.out.println("\n");
       if(ohealth<0){
          ohealth=0;
       }
       if(health<0){
          health=0;
       }
       
       System.out.println(inp.toUpperCase()+" (P1)                                                                          "+inptwo+" (P2)");
       System.out.println("Health: "+health+"  Defence: "+def+ "                                                   "+"Opponent's Health: "+ohealth+"  Opponent's Defence: "+odef );
       System.out.println("Atk: "+atk+" mAtk:"+matk+" mDef:"+mdef+"                                                  Opponent's Atk:"+oatk+" Opponent's mAtk:"+omatk+" Opponent's mDef:"+omdef);
      
       /*death check*/
       if(health==0){
          System.out.print("\n");
          System.out.println("P2 wins <<P1 fainted>>!");
          yes=false;
       }
       if(ohealth==0){
          System.out.print("\n");
           System.out.println("P1 win <<P2 fainted>>!");
           yes=false;
       }
       
       if(player==0){
          System.out.print("\n");
          System.out.println("<<Cyborg Moves:>>");
          System.out.println("Explode: matk^2-opp.mdef*2, deals matk damage to self");
          System.out.println("Beam: matk*4-opp.mdef^2");
          System.out.println("Ult: Energize: +1 matk");
          System.out.println("\n");
          Scanner Cyborgmove = new Scanner (System.in);
          String cyborg= Cyborgmove.next();
          String cy= cyborg.toLowerCase();
          cy.trim();
          if(cy.equals("explode")){
             System.out.println("\n<<P1 used explode>>");
            System.out.println("\n<<P1 dealt "+((matk*matk)-(omdef*2))+" damage!>>");
            System.out.println("\n<<P1 dealt "+(matk)+" damage to themselves!>>");
            health-=matk;
             ohealth-=(matk*matk)-(omdef*2);
          }else if(cy.equals("beam")){
             System.out.println("\n<<P1 used beam>>");
             System.out.println("\n<<P1 dealt "+((matk*4)-(omdef*omdef))+" damage!>>");
             ohealth-=(matk*4)-(omdef*omdef);
          }else if(cy.equals("energize")){  
          System.out.println("\n<<P1 used energize!>>");
            System.out.println("\n<<P1 gained one attack!>>");
             atk+=1;
          }else{
             System.out.println("\n");
             System.out.println("<<Move Wasted>>");
          }
       }
       else if(player==1){
          System.out.print("\n");
          System.out.println("<<Knight Moves:>>");
          System.out.println("Stab: atk*5-opp.def^2");
          System.out.println("Slash: atk*2-opp.def");
          System.out.println("Ult: Shine: +2 atk");
          System.out.println("\n");
          Scanner Knightmove = new Scanner (System.in);
          String knight= Knightmove.next();
          String k= knight.toLowerCase();
          k.trim();
          if(k.equals("stab")){
             System.out.println("\n<<P1  Used Stab!>>");
             System.out.println("\n<<P1 dealt "+((atk*5)-(odef*odef))+" damage!");
             ohealth-=(atk*5)-(odef*odef);
          }else if(k.equals("slash")){
             System.out.println("\n<<P1 Used Slash!>>");
              System.out.println("\n<<P1 dealt "+((atk*2)-(odef))+" damage!>>");
             ohealth-=(atk*2)-(odef);
          }else if(k.equals("shine")){
              System.out.println("\n<<P1  Used Shine!>>");
            System.out.println("\n<<P1 gained one attack!>>");
             atk+=1;
          }else{
             System.out.println("\n");
             System.out.println("<<Move Wasted>>");
          }
       }
       else if(player==2){
          System.out.print("\n");
          System.out.println("<<Archer moves:>>");
          System.out.println("Shot: atk+ matk -opp.def");
          System.out.println("Snipe: +1 atk");
          System.out.println("Ult: Arrow Storm: Atk*3-opp.def^2");
          System.out.println("\n");
          Scanner Archermove = new Scanner (System.in);
          String archer= Archermove.next();
          String a= archer.toLowerCase();
          a.trim();
          if(a.equals("shot")){
          System.out.println("\n<<P1 used Shot>>");
             System.out.println("\n<<P1 dealt "+(atk+ matk -odef)+" damage!>>");
             ohealth-=(atk+matk)-(odef);
          }else if(a.equals("snipe")){
          System.out.println("\n<<P1 used Snipe!>>"); 
              System.out.println("\n<<P1 gained one attack!>>");
            atk+=1;
          }else if(a.equals("arrow_storm")){
          System.out.println("\n<<P1 used Arrow Storm!>>");
                System.out.println("\n<<P1 dealt "+((atk*3)-(odef*odef))+" damage!>>");
             ohealth-=(atk*3)-(odef*odef);
          }else{
             System.out.println("\n");
             System.out.println("<<Move Wasted>>");
          }     
          }
          else if(player==3){
             System.out.print("\n");
             System.out.println("<<Healer Moves:>>");
             System.out.println("Passive: Heal: +2.5 hp every turn");
             System.out.println("Stab: atk*2-opp.def");
             System.out.println("Ult: Shimmer: +2 health, +2 atk (perm)");
             System.out.println("\n");
             Scanner Healermove = new Scanner (System.in);
             String healer= Healermove.next();
             String h= healer.toLowerCase();
             h.trim();
          if(h.equals("stab")){
             ohealth-=(atk*2)-(odef);
             health+=2.5;
               System.out.println("\n<<P1 healed 2.5 hp!>>");
                System.out.println("\n<<P1 used Stab!>>");
                System.out.println("\n<<P1 dealt "+(atk*2-odef)+" damage!>>");
          }else if(h.equals("shimmer")){
              System.out.println("\n<<P1 healed 2.5 hp!>>");
             System.out.println("\n<<P1 used Shimmer>>"); 
             System.out.println("\n<<P1 healed 2.5 hp and gained 2 attack!>>");
             health+=2;
             health+=2.5;
             atk+=2;
                        }else{   
             System.out.println("\n");
             System.out.println("<<Move Wasted>>");
             System.out.println("\n");
             System.out.println("<<Healed for 2.5 hp>>");
             health+=2.5;
          }
       }
       else if(player==4){
          System.out.print("\n");
          System.out.println("<<Assassin Moves:>>");
          System.out.println("Hidden Blade: atk^17-opp.def^2");
          System.out.println("Store: +.25 atk");
          System.out.println("Ult: Gaurd: +1 def");
          System.out.println("\n");
          Scanner Assassinmove = new Scanner (System.in);
          String assassin= Assassinmove.next();
          String as= assassin.toLowerCase();
          as.trim();
          if(as.equals("hidden_blade")){
             System.out.println("\n<<P1 used Hidden Blade!>>");
                System.out.println("\n<<P1 dealt "+((atk*atk*atk*atk*atk*atk*atk*atk*atk*atk*atk*atk*atk*atk*atk*atk*atk)-(odef*odef))+" damage!>>");
             ohealth-=(atk*atk*atk*atk*atk*atk*atk*atk*atk*atk*atk*atk*atk*atk*atk*atk*atk)-(odef*odef);
          }else if(as.equals("store")){
              System.out.println("\n<<P1 used Store!>>");
                System.out.println("\n<<Gained .25 attack!>>");
             atk+=.25;
          }else if(as.equals("gaurd")){
             System.out.println("\n<<P1 used Gaurd!>>");
                System.out.println("\n<<Defence increased by one!>>");
             def+=1;
          }else{
             System.out.println("\n");
             System.out.println("<<Move Wasted>>");
          }
       }
       else if(player==5){
          System.out.print("\n");
          System.out.println("<<"+inp+" Moves:>>");
          System.out.println("Sheild Hit: atk*2.5-opp.def");
          System.out.println("Gaurd: +1 def, +1 mdef");
          System.out.println("Ult: Shield Bash: +1 atk");
          System.out.println("\n");
          Scanner Shieldsmanmove = new Scanner (System.in);
          String shieldsman= Shieldsmanmove.next();
          String shield= shieldsman.toLowerCase();
          shield.trim();
          if(shield.equals("shield_hit")){
             System.out.println("\n<<P1 used Shield Hit!>>");
             System.out.println("\n<<P1 dealt "+((atk*2.5)-(odef))+" damage");
             ohealth-=(atk*2.5)-(odef);
          }else if(shield.equals("gaurd")){
                System.out.println("\n<<P1 used Gaurd!>>");
                System.out.println("\n<<P1 gained one def and mdef!>>");
             def+=1;
             mdef+=1;
          }else if(shield.equals("shield_bash")){
                System.out.println("\n<<P1 used Shield Bash!>>");
                System.out.println("\n<<P1 gained one atk!>>");
             atk+=1;
          }else{
             System.out.println("\n");
             System.out.println("<<Move Wasted>>");
          }
       }
       else if(player==6){
          System.out.print("\n");
          System.out.println("<<Warrior Moves:>>");
          System.out.println("Punch: atk-o.def");
          System.out.println("Pushup: +1 atk");
          System.out.println("Ult: Enrage: atk doubles");
          System.out.println("\n");
          Scanner Warriormove = new Scanner (System.in);
          String warrior= Warriormove.next();
          String w= warrior.toLowerCase();
          w.trim();
          if(w.equals("punch")){
          System.out.println("\n<<P1 used Punch!>>");
                System.out.println("\n<<P1 dealt "+((atk*2.5)-(odef))+" damage");
             ohealth-=(atk*2.5)-(odef);
          }else if(w.equals("pushup")){
                  System.out.println("\n<<P1 did a Pushup! Perfect Form!>>");
                System.out.println("\n<<P1 gained one attack!>>");
            atk +=1;
          }else if(w.equals("enrage")){
           System.out.println("\n<<P1 used Enrage!>>");
                System.out.println("\n<<P1 gained "+ atk*1.25+" attack!>>");
            atk*=1.25;
          }else{
             System.out.println("\n");
             System.out.println("<<Move Wasted>>");
          }
       }
       else if(player==7){
          System.out.print("\n");
          System.out.println("<<Swordsman Moves:>>");
          System.out.println("Sharp_Cut: atk/3");
          System.out.println("Intense Training: atk multiplies by 1.5");
          System.out.println("Ult: Ultimate Aura: +1 mdef, +5 health");
          System.out.println("\n");
          Scanner Swordsmanmove = new Scanner (System.in);
          String swordsman= Swordsmanmove.next();
          String sw= swordsman.toLowerCase();
          sw.trim();
          if(sw.equals("sharp_cut")){
          System.out.println("\n<<P1 used Sharp Cut!>>");
                System.out.println("\n<<P1 dealt "+(atk/3)+" damage");
             ohealth-=(atk/3);
          }else if(sw.equals("intense_training")){
                  System.out.println("\n<<P1 did Intense Training!! Max Gains!!>>");
                System.out.println("\n<<P1 gained "+ atk*.5 +" attack!>>");
            atk *= 1.5;
          }else if(sw.equals("ultimate_aura")){
           System.out.println("\n<<P1 used Ultimate Aura!! Maximum Aura!! The Ground Trembles with Power!!>>");
                System.out.println("\n<<P1 gained 1 mdef and 5 health!>>");
            mdef+=1;
            health+=5;
          }else{
             System.out.println("\n");
             System.out.println("<<Move Wasted>>");
          }
       }

        System.out.println("\n");
       if(ohealth<0){
          ohealth=0;
       }
       if(health<0){
          health=0;
       }
       
       System.out.println(inp+" (P1)                                                                          "+inptwo.toUpperCase()+" (P2)");
       System.out.println("Health: "+health+"  Defence: "+def+ "                                                   "+"Opponent's Health: "+ohealth+"  Opponent's Defence: "+odef );
       System.out.println("Atk: "+atk+" mAtk:"+matk+" mDef:"+mdef+"                                                  Opponent's Atk:"+oatk+" Opponent's mAtk:"+omatk+" Opponent's mDef:"+omdef);
      
       /*death check*/
       if(health==0){
          System.out.print("\n");
          System.out.println("P2 Wins<<P1 fainted>>!");
          yes=false;
       }
       if(ohealth==0){
          System.out.print("\n");
           System.out.println("P1 Wins <<P2 fainted>>!");
           yes=false;
       }
       
       if(computer==0){
          System.out.print("\n");
          System.out.println("<<Cyborg Moves:>>");
          System.out.println("Explode: matk^2-opp.mdef*2, deals matk damage to self" );
          System.out.println("Beam: matk*4-opp.mdef^2");
          System.out.println("Ult: Energize: +1 matk");
          System.out.println("\n");
          Scanner Cyborgmovetwo = new Scanner (System.in);
          String cyborgtwo= Cyborgmovetwo.next();
          String cytwo= cyborgtwo.toLowerCase();
          cytwo.trim();
          if(cytwo.equals("explode")){
            System.out.println("\n<<P2 used explode>>");
            System.out.println("\n<<P2 dealt "+((omatk*omatk)-(mdef*2))+" damage!>>");
            System.out.println("\n<<P2 dealt "+(omatk)+" damage to themselves!>>");
          ohealth-=(omatk);
            health-=(omatk*omatk)-(mdef*2);
          }else if(cytwo.equals("beam")){
          System.out.println("\n<<P2 used beam>>");
             System.out.println("\n<<P2 dealt "+((omatk*4)-(mdef*mdef))+" damage!>>");
             health-=(matk*4)-(mdef*mdef);
          }else if(cytwo.equals("energize")){
             System.out.println("\n<<P2 used energize!>>");
            System.out.println("\n<<P2 gained one attack!>>");
             oatk+=1;
          }else{
             System.out.println("\n");
             System.out.println("<<Move Wasted>>");
          }
       }
       else if(computer==1){
          System.out.print("\n");
          System.out.println("<<Knight Moves:>>");
          System.out.println("Stab: atk*5-opp.def^2");
          System.out.println("Slash: atk*2-opp.def");
          System.out.println("Ult: Shine: +2 atk");
          System.out.println("\n");
          Scanner Knightmovetwo = new Scanner (System.in);
          String knighttwo= Knightmovetwo.next();
          String ktwo= knighttwo.toLowerCase();
          ktwo.trim();
          if(ktwo.equals("stab")){
              System.out.println("\n<<P12 Used Stab!>>");
             System.out.println("\n<<P2 dealt "+((oatk*5)-(def*def))+" damage!");
             health-=(oatk*5)-(def*def);
          }else if(ktwo.equals("slash")){
             System.out.println("\n<<P2 Used Slash!>>");
              System.out.println("\n<<P2 dealt "+((oatk*2)-(def))+" damage!>>");
             health-=(oatk*2)-(def);
          }else if(ktwo.equals("shine")){
             System.out.println("\n<<P2  Used Shine!>>");
            System.out.println("\n<<P2 gained one attack!>>");
             oatk+=1;
          }else{
             System.out.println("\n");
             System.out.println("<<Move Wasted>>");
          }
       }
       else if(computer==2){
          System.out.print("\n");
          System.out.println("<<Archer moves:>>");
          System.out.println("Shot: atk+ matk -opp.def");
          System.out.println("Snipe: +1 atk");
          System.out.println("Ult: Arrow Storm: Atk*3-opp.def^2");
          System.out.println("\n");
          Scanner Archermovetwo = new Scanner (System.in);
          String archertwo= Archermovetwo.next();
          String atwo= archertwo.toLowerCase();
          atwo.trim();
          if(atwo.equals("shot")){
             System.out.println("\n<<P2 used Shot>>");
             System.out.println("\n<<P2 dealt "+(oatk+ omatk -def)+" damage!>>");
             health-=(oatk+omatk)-(def);
          }else if(atwo.equals("snipe")){
            oatk+=1;
          }else if(atwo.equals("arrow_storm")){
             System.out.println("\n<<P1 used Arrow Storm!>>");
             System.out.println("\n<<P1 dealt "+((oatk*3)-(def*def))+" damage!>>");
             health-=(oatk*3)-(def*def);
          }else{
             System.out.println("\n");
             System.out.println("<<Move Wasted>>");
          }     
          }
          else if(computer==3){
             System.out.print("\n");
             System.out.println("<<Healer Moves:>>");
             System.out.println("Passive: Heal: +2.5 hp every turn");
             System.out.println("Stab: atk*2-opp.def");
             System.out.println("Ult: Shimmer: +2 health, +2 atk (perm)");
             System.out.println("\n");
             Scanner Healermovetwo = new Scanner (System.in);
             String healertwo= Healermovetwo.next();
             String htwo= healertwo.toLowerCase();
             htwo.trim();
          if(htwo.equals("stab")){
             health-=(oatk*2)-(def);
             ohealth+=2.5;
             System.out.println("\n<<P2 healed 2.5 hp!>>");
             System.out.println("\n<<P2 used Stab!>>");
             System.out.println("\n<<P2 dealt "+(oatk*2-def)+" damage!>>");
          }else if(htwo.equals("shimmer")){
             ohealth+=2;
             ohealth+=2.5;
             oatk+=2;
             System.out.println("\n<<P2 healed 2.5 hp!>>");
             System.out.println("\n<<P2 used Shimmer>>"); 
             System.out.println("\n<<P2 healed 2.5 hp and gained 2 attack!>>");
          }else{   
             System.out.println("\n");
             System.out.println("<<Move Wasted>>");
             System.out.println("\n");
             System.out.println("<<Healed for 2.5 hp>>");
             ohealth+=2.5;
          }
       }
       else if(computer==4){
          System.out.print("\n");
          System.out.println("<<Assassin Moves:>>");
          System.out.println("Hidden Blade: atk^17-opp.def^2");
          System.out.println("Store: +.25 atk");
          System.out.println("Ult: Gaurd: +1 def");
          System.out.println("\n");
          Scanner Assassinmovetwo = new Scanner (System.in);
          String assassintwo= Assassinmovetwo.next();
          String astwo= assassintwo.toLowerCase();
          astwo.trim();
          if(astwo.equals("hidden_blade")){
             System.out.println("\n<<P1 used Hidden Blade!>>");
             System.out.println("\n<<P1 dealt "+((oatk*oatk*oatk*oatk*oatk*oatk*oatk*oatk*oatk*oatk*oatk*oatk*oatk*oatk*oatk*oatk*oatk)-(def*def))+" damage!>>");
             health-=(oatk*oatk*oatk*oatk*oatk*oatk*oatk*oatk*oatk*oatk*oatk*oatk*oatk*oatk*oatk*oatk*oatk)-(def*def);
          }else if(astwo.equals("store")){
             System.out.println("\n<<P2 used Store!>>");
              System.out.println("\n<<Gained .25 attack!>>");
             oatk+=.25;
          }else if(astwo.equals("gaurd")){
             System.out.println("\n<<P2 used Gaurd!>>");
             System.out.println("\n<<Defence increased by one!>>");
             odef+=1;
          }else{
             System.out.println("\n");
             System.out.println("<<Move Wasted>>");
          }
       }
       else if(computer==5){
          System.out.print("\n");
          System.out.println("<<Shieldsman Moves:>>");
          System.out.println("Sheild Hit: atk*2.5-opp.def");
          System.out.println("Gaurd: +1 def, +1 mdef");
          System.out.println("Ult: Shield Bash: +1 atk");
          System.out.println("\n");
          Scanner Shieldsmanmovetwo = new Scanner (System.in);
          String shieldsmantwo= Shieldsmanmovetwo.next();
          String shieldtwo= shieldsmantwo.toLowerCase();
          shieldtwo.trim();
          if(shieldtwo.equals("shield_hit")){
             System.out.println("\n<<P2 used Shield Hit!>>");
             System.out.println("\n<<P2 dealt "+((oatk*2.5)-(def))+" damage");
             health-=(oatk*2.5)-(def);
          }else if(shieldtwo.equals("gaurd")){
             System.out.println("\n<<P2 used Gaurd!>>");
             System.out.println("\n<<P2 gained one def and mdef!>>");
             odef+=1;
             omdef+=1;
          }else if(shieldtwo.equals("shield_bash")){
             System.out.println("\n<<P2 used Shield Bash!>>");
             System.out.println("\n<<P2 gained one atk!>>");
             oatk+=1;
          }else{
             System.out.println("\n");
             System.out.println("<<Move Wasted>>");
          }
       }
       else if(computer==6){
          System.out.print("\n");
          System.out.println("<<Warrior Moves:>>");
          System.out.println("Punch: atk-o.def");
          System.out.println("Pushup: +1 atk");
          System.out.println("Ult: Enrage: atk doubles");
          System.out.println("\n");
          Scanner Warriormovetwo = new Scanner (System.in);
          String warriortwo= Warriormovetwo.next();
          String wtwo= warriortwo.toLowerCase();
          wtwo.trim();
          if(wtwo.equals("punch")){
             System.out.println("\n<<P2 used Punch!>>");
             System.out.println("\n<<P2 dealt "+((oatk*2.5)-(def))+" damage");
             health-=(oatk*2.5)-(def);
          }else if(wtwo.equals("pushup")){
          System.out.println("\n<<P2 did a Pushup! Perfect Form!>>");
           System.out.println("\n<<P2 gained one attack!>>");
            oatk +=1;
          }else if(wtwo.equals("enrage")){
            System.out.println("\n<<P2 used Enrage!>>");
            System.out.println("\n<<P2 gained "+ oatk*1.25+" attack!>>");
            oatk*=1.25;
          }else{
             System.out.println("\n");
             System.out.println("<<Move Wasted>>");
          }
       }
       else if(computer==7){
          System.out.print("\n");
          System.out.println("<<Swordsman Moves:>>");
          System.out.println("Sharp Cut: atk/3");
          System.out.println("Intense Training: atkmultiplies by 1.5");
          System.out.println("Ult: Ultimate Aura: +1 mdef, +5 health");
          System.out.println("\n");
          Scanner Swordsmanmovetwo = new Scanner (System.in);
          String swordsmantwo= Swordsmanmovetwo.next();
          String swtwo= swordsmantwo.toLowerCase();
          swtwo.trim();
          if(swtwo.equals("sharp_cut")){
             System.out.println("\n<<P2 used Sharp Cut!>>");
             System.out.println("\n<<P2 dealt "+(oatk/3)+" damage");
             health-=(oatk/3);
          }else if(swtwo.equals("intense_training")){
             System.out.println("\n<<P2 did Intense Training!! Max Gains!!>>");
             System.out.println("\n<<P2 gained "+ oatk*.5 +" attack!>>");
            oatk *=1.5;
          }else if(swtwo.equals("ultimate_aura")){
             System.out.println("\n<<P2 used Ultimate Aura!! Maximum Aura!! The Ground Trembles with Power!!>>");
             System.out.println("\n<<P2 gained 1 mdef and 5 health!>>");
            omdef+=1;
            ohealth+=5;
          }else{
             System.out.println("\n");
             System.out.println("<<Move Wasted>>");
          }
       }

       
   }
    //2p code end
     //2p code end
      //2p code end
       //2p code end
        //2p code end
         //2p code end
          //2p code end
    }else if(sta.equals("training")){
    System.out.print("Tales of Jim - Fangame - pick your character[Cyborg,Knight,Archer,Healer,Assassin,Shieldsman,Warrior,Swordsman]:: ");
    Scanner Startup = new Scanner (System.in);
    String input= Startup.next();
    String inp= input.toLowerCase();
    inp.trim(); 
    String oppclass = " ";
    int player = 0;
    if(inp.equals("cyborg") || inp.equals("knight") || inp.equals("archer") || inp.equals("healer") || inp.equals("assassin") || inp.equals("shieldsman") || inp.equals("warrior") || inp.equals("swordsman")){
       System.out.println("\n");
    }else{ 
       System.out.println("\nX An unknown error occured\n");
    }
    System.out.println("Player chose "+ inp.toUpperCase());
    
    if(inp.equals("cyborg")){
          player=0;
    }
    if(inp.equals("knight")){
       player=1;
    }
    if(inp.equals("archer")){
          player=2;
    } 
    if(inp.equals("healer")){
          player=3;
    } 
    if(inp.equals("assassin")){
          player=4;
    } 
     if(inp.equals("shieldsman")){
          player=5;
    } 
    if(inp.equals("warrior")){
          player=6;
    } 
    if(inp.equals("swordsman")){
          player=7;
    } 
         
    double health = 0;
    double def = 0;
    double atk =  0;
    double matk =  0;
    double mdef =  0;
    double ohealth = 0;
    double odef = 0;
    double oatk = 0;
    double omatk =  0;
    double omdef =  0;
    int round = 0;
    
    if(player==0){
       health=  120;
       def= 1;
       atk= 0;
       matk= 7;
       mdef= 5;
    }else if(player==1){
       health= 200;
       def= 3;
       atk=  7;
       matk= 0;
       mdef= 1;
    }else if(player==2){
       health= 160;
       def= 2;
       atk= 5;
       matk= 0;
       mdef= 2;
    }else if(player==3){
       health= 200;
       def= 0;
       atk=  0;
       matk= 4;
       mdef= 10;
    }else if(player==4){
       health= 100;
       def= 0;
       atk=  0;
       matk= 0;
       mdef= 0;
    }else if(player==5){
       health= 100;
       def= 5;
       atk=  3;
       matk= 0;
       mdef= 5;
    }else if(player==6){
       health= 500;
       def= 0;
       atk=  0;
       matk= 0;
       mdef= 0;
    }else if(player==7){
       health= 200;
       def= 1;
       atk=  4;
       matk= 0;
       mdef= 10;
    }
       ohealth=  10*round;
       odef= 1+round;
       oatk= 1+round;
       omatk= 1+round;
       omdef= 1+round;
          boolean yes  = true;
    
    while(yes){
       System.out.println("\n");
       if(ohealth<0){
          ohealth=0;
       }
       if(health<0){
          health=0;
       }
       
       System.out.println(inp.toUpperCase()+" (You)                                                                          "+"Dummy"+" (Computer)");
       System.out.println("Health: "+health+"  Defence: "+def+ "                                                   "+"Opponent's Health: "+ohealth+"  Opponent's Defence: "+odef );
       System.out.println("Atk: "+atk+" mAtk:"+matk+" mDef:"+mdef+"                                                  Opponent's Atk:"+oatk+" Opponent's mAtk:"+omatk+" Opponent's mDef:"+omdef);
      
       /*death check*/
       if(health==0){
          System.out.print("\n");
          System.out.println("Computer wins <<You have fainted>>!");
          System.out.println("Submit Highscore:: https://forms.gle/vipQQz66FCMbigS46");
          yes=false;
       }
       if(ohealth==0){
          System.out.print("\n");
           System.out.println("You win <<Opponent fainted>>! Next Round!");
           round+=1;
           ohealth=  10*round;
           odef= 1+round;
           oatk= 1+round;
          omatk= 1+round;
           omdef= 1+round;
          System.out.println("Round "+round+", Fight!!");
       }
       
       if(player==0){
          System.out.print("\n");
          System.out.println("<<Cyborg Moves:>>");
          System.out.println("Explode: matk^2-opp.mdef*2");
          System.out.println("Beam: matk*4-opp.mdef^2");
          System.out.println("Ult: Energize: +1 matk");
          System.out.println("\n");
          Scanner Cyborgmove = new Scanner (System.in);
          String cyborg= Cyborgmove.next();
          String cy= cyborg.toLowerCase();
          cy.trim();
          if(cy.equals("explode")){
             ohealth-=(matk*matk)-(omdef*2);
          }else if(cy.equals("beam")){
             ohealth-=(matk*4)-(omdef*omdef);
          }else if(cy.equals("energize")){
             atk+=1;
          }else{
             System.out.println("\n");
             System.out.println("<<Move Wasted>>");
          }
       }
       else if(player==1){
          System.out.print("\n");
          System.out.println("<<Knight Moves:>>");
          System.out.println("Stab: atk*5-opp.def^2");
          System.out.println("Slash: atk*2-opp.def");
          System.out.println("Ult: Shine: +2 atk");
          System.out.println("\n");
          Scanner Knightmove = new Scanner (System.in);
          String knight= Knightmove.next();
          String k= knight.toLowerCase();
          k.trim();
          if(k.equals("stab")){
             ohealth-=(atk*5)-(odef*odef);
          }else if(k.equals("slash")){
             ohealth-=(atk*2)-(odef);
          }else if(k.equals("shine")){
             atk+=1;
          }else{
             System.out.println("\n");
             System.out.println("<<Move Wasted>>");
          }
       }
       else if(player==2){
          System.out.print("\n");
          System.out.println("<<Archer moves:>>");
          System.out.println("Shot: atk+ matk -opp.def");
          System.out.println("Snipe: +1 atk");
          System.out.println("Ult: Arrow Storm: Atk*3-opp.def^2");
          System.out.println("\n");
          Scanner Archermove = new Scanner (System.in);
          String archer= Archermove.next();
          String a= archer.toLowerCase();
          a.trim();
          if(a.equals("shot")){
             ohealth-=(atk+matk)-(odef);
          }else if(a.equals("snipe")){
            atk+=1;
          }else if(a.equals("arrow_storm")){
             ohealth-=(atk*3)-(odef*odef);
          }else{
             System.out.println("\n");
             System.out.println("<<Move Wasted>>");
          }     
          }
          else if(player==3){
             System.out.print("\n");
             System.out.println("<<Healer Moves:>>");
             System.out.println("Passive: Heal: +2.5 hp every turn");
             System.out.println("Stab: atk*2-opp.def");
             System.out.println("Ult: Shimmer: +2 health, +2 atk (perm)");
             System.out.println("\n");
             Scanner Healermove = new Scanner (System.in);
             String healer= Healermove.next();
             String h= healer.toLowerCase();
             h.trim();
          if(h.equals("stab")){
             ohealth-=(atk*2)-(odef);
             health+=2.5;
             System.out.println("\n");
             System.out.println("<<Healed for 2.5 hp>>");
          }else if(h.equals("shimmer")){
             health+=2;
             health+=2.5;
             atk+=2;
             System.out.println("\n");
             System.out.println("<<Healed for 2.5 hp>>");
          }else{   
             System.out.println("\n");
             System.out.println("<<Move Wasted>>");
             System.out.println("\n");
             System.out.println("<<Healed for 2.5 hp>>");
             health+=2.5;
          }
       }
       else if(player==4){
          System.out.print("\n");
          System.out.println("<<Assassin Moves:>>");
          System.out.println("Hidden Blade: atk^17-opp.def^2");
          System.out.println("Store: +.15 atk");
          System.out.println("Ult: Gaurd: +1 def");
          System.out.println("\n");
          Scanner Assassinmove = new Scanner (System.in);
          String assassin= Assassinmove.next();
          String as= assassin.toLowerCase();
          as.trim();
          if(as.equals("hidden_blade")){
             ohealth-=(atk*atk*atk*atk*atk*atk*atk*atk*atk*atk*atk*atk*atk*atk*atk*atk*atk)-(odef*odef);
          }else if(as.equals("store")){
             atk+=.15;
          }else if(as.equals("gaurd")){
             def+=1;
          }else{
             System.out.println("\n");
             System.out.println("<<Move Wasted>>");
          }
       }
       else if(player==5){
          System.out.print("\n");
          System.out.println("<<Shieldsman Moves:>>");
          System.out.println("Sheild Hit: atk*2.5-opp.def");
          System.out.println("Gaurd: +1 def, +1 mdef");
          System.out.println("Ult: Shield Bash: +1 atk");
          System.out.println("\n");
          Scanner Shieldsmanmove = new Scanner (System.in);
          String shieldsman= Shieldsmanmove.next();
          String shield= shieldsman.toLowerCase();
          shield.trim();
          if(shield.equals("shield_hit")){
             ohealth-=(atk*2.5)-(odef);
          }else if(shield.equals("gaurd")){
             def+=1;
             mdef+=1;
          }else if(shield.equals("shield_bash")){
             atk+=1;
          }else{
             System.out.println("\n");
             System.out.println("<<Move Wasted>>");
          }
       }
       else if(player==6){
          System.out.print("\n");
          System.out.println("<<Warrior Moves:>>");
          System.out.println("Punch: atk-o.def");
          System.out.println("Pushup: +1 atk");
          System.out.println("Ult: Enrage: atk doubles");
          System.out.println("\n");
          Scanner Warriormove = new Scanner (System.in);
          String warrior= Warriormove.next();
          String w= warrior.toLowerCase();
          w.trim();
          if(w.equals("punch")){
             ohealth-=(atk*2.5)-(odef);
          }else if(w.equals("pushup")){
            atk +=1;
          }else if(w.equals("enrage")){
            atk*=1.25;
          }else{
             System.out.println("\n");
             System.out.println("<<Move Wasted>>");
          }
       }
       else if(player==7){
          System.out.print("\n");
          System.out.println("<<Swordsman Moves:>>");
          System.out.println("Sharp Cut: (atk/3)");
          System.out.println("Intense Training: atk multiplies by 1.5");
          System.out.println("Ult: Ultimate Aura: +1 mdef, +5 health");
          System.out.println("\n");
          Scanner Swordmove = new Scanner (System.in);
          String swordsman= Swordmove.next();
          String sm= swordsman.toLowerCase();
          sm.trim();
          if(sm.equals("sharp_cut")){
             ohealth-=(atk/3);
          }else if(sm.equals("intense_training")){
            atk *= 1.5;
          }else if(sm.equals("ultimate_aura")){
            mdef+=1;
            health+=5;
          }else{
             System.out.println("\n");
             System.out.println("<<Move Wasted>>");
          }
       }
    
             int dice = (int)(Math.random() * 8);
             if(dice==0){
                System.out.println("\n<<Opponent used explode>>");
                System.out.println("\n<<Opponent dealt "+((omatk*omatk)-(mdef*2))+" damage!>>");
                 health-=(omatk*omatk)-(mdef*2);
             }else if(dice==1){
                System.out.println("\n<<Opponent used beam>>");
                System.out.println("\n<<Opponent dealt "+((omatk*4)-(mdef*mdef))+" damage!>>");
                 health-=(omatk*4)-(mdef*mdef);
             }else  if(dice==2){
                System.out.println("\n<<Opponent used energize>>");
                System.out.println("\n<<Opponent gained one attack!>>");
                oatk+=1;
             }else if(dice==3){
                 System.out.println("\n<<Opponent Used Slash!>>");
                 System.out.println("\n<<Opponent dealt "+((oatk*2)-(def))+" damage!>>");
                 health-=(oatk*2)-(def);
             }else if(dice==4){
                System.out.println("\n<<Opponent Used Stab!>>");
                System.out.println("\n<<Opponent dealt "+((oatk*5)-(def*def))+" damage!");
                health-=(oatk*5)-(def*def);         
             }else if(dice==5){
              System.out.println("\n<<Opponent used Snipe!>>"); 
              System.out.println("\n<<Opponent gained one attack!>>");
                oatk+=1;
             }else  if(dice==6){
                System.out.println("\n<<Opponent used Arrow Storm!>>");
                System.out.println("\n<<Opponent dealt "+((oatk*3)-(def*def))+" damage!>>");
                health-=(oatk*3)-(def*def);
             }else if(dice==7){
             ohealth+=2.5;
             System.out.println("\n<<Opponent healed 2.5 hp!>>");
             System.out.println("\n<<Opponent used Shimmer>>"); 
             System.out.println("\n<<Opponent healed 2.5 hp and gained 2 attack!>>");
             ohealth+=2;
              oatk+=2;
             }
          }

       }


 }
 }
