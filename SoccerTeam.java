
public class SoccerTeam{
	private String name;
	private SoccerTrainer trainer;
	private int tablePosition;
	private int goalsScored;
	private int goalsAgainst;
	// private int check=0;
	private SoccerPlayer[] players= new SoccerPlayer[11];
	public SoccerTeam(String name, SoccerTrainer trainer, int tablePosition){
		this.name=name;
		this.trainer=trainer;
		this.tablePosition=tablePosition;
	}
	public String getName(){
		return name;
	}
	public boolean addPlayer(SoccerPlayer player){
		int check=0;
        //players[check].setNumber(check++);
        
        while(check<players.length){
            if(players[check]==null){
        	   players[check]=player ;
        	   players[check].setNumber(check+1);
        	   players[check].setTeam(this);
        	return true;
           }
            check++;
            // System.out.println("check : " + check);
        	// return true;
        }
        // else{
        	return false;
        // }
	}
	public void goal(int playerNumber){
         players[playerNumber-1].increaseGoalCount();

         goalsScored+=1;
	}
	public void goalAgainst(){
		goalsAgainst+=1;
	}
	public String ratioString(){
		return goalsScored+":"+goalsAgainst;
	}
	public String toString(){
		// System.out.println( "-----> Hello?" );
		String result = "Name: "+name+"  Trainer: "+trainer.getName()+"  Ratio: "+ratioString()+"  Players: \n";
        String result1="";
		for(int i=0;i<players.length;i++){
			result1+=players[i].toString()+"\n";
		}

		return result+result1;
	}
}