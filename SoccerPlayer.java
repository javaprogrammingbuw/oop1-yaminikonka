
public class SoccerPlayer{
	private String name;
	private int number;
	private SoccerTeam team;
	private int  yellowcard,redcard;
	private int goalsscored;
	public SoccerPlayer(String name){
		this.name=name;
	}
	public void redCard(){
         if(yellowcard==1){
      	redcard=1;
      }else{
      	redcard=1;
      }
	}
	public void yellowCard(){
      yellowcard=1;
	}
	public int getNumber(){
		return number;
	}
	public void setNumber(int number){
        this.number=number;
	}
	public String getName(){
		return name;
	}
	public SoccerTeam getTeam(){
		return team;
	}
	public int increaseGoalCount(){
         return  goalsscored+=1;
	}
	public void setTeam(SoccerTeam newTeam){
		team=newTeam;
	}
	public String toString(){
		return "Player: "+name+"  Number: "+number+"  Team: "+team.getName()+"  Goals: "+goalsscored;
	}
}