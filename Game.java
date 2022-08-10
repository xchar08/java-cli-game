import java.util.*;
class Character{
    String name;
    String ctype;
    float hp;
    float def;
    float rdef;
    float atk;
    float ratk;
    float range;
    Character(String name, String ctype, float hp, float def, float rdef, float atk, float ratk, float range) {
        this.name = name;
        this.ctype = ctype;
        this.hp = hp;
        this.def = def;
        this.rdef = rdef;
        this.atk = atk;
        this.ratk = ratk;
        this.range = range;
    }
    public void getStats(){
        System.out.printf("name: %d%f\nctype: %d%f\nhp: %d%f\ndef: %d%f\nrdef: %d%f\natk: %d%f\nratk: %d%f\nrange: %d%f\n",name,ctype,hp,def,rdef,atk,ratk,range);
    }
}
public class Knight extends Character{
    Knight(String name, String ctype, float hp, float def, float rdef, float atk, float ratk, float range) {
        this.name = name;
        super(ctype);
        super(hp);
        super(def);
        super(rdef);
        super(atk);
        super(ratk);
        super(range);
    }
    int movestr;
    List moves = new ArrayList<String>();
    moves.add("1. stab: (atk * 2)\n");
    moves.add("2. slash: (atk * 3, +1 temp range)\n");
    moves.add("3. guard: +3 def 2 rounds\n");    
    public void displayMoves(){
        System.out.println(moves);
    }
    public void getMove(){
        System.out.println("What is your move?\n");
        Scanner move = new Scanner(System.in);
        movestr = Integer.parseInt(move.nextLine());
    }
    switch (movestr){

    }
}
class Knight extends Character{
    int movestr;
    List moves = new ArrayList<String>();
    moves.add("1. stab: (atk * 2)\n");
    moves.add("2. slash: (atk * 3, +1 temp range)\n");
    moves.add("3. guard: +3 def 2 rounds\n");    
    public void displayMoves(){
        System.out.println(moves);
    }
    public void getMove(){
        System.out.println("What is your move?\n");
        Scanner move = new Scanner(System.in);
        movestr = Integer.parseInt(move.nextLine());
    }
    switch (movestr){

    }
}
public class Game {
    
}
