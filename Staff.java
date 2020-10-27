public class Staff {
    Integer SolveAbility; // 成员变量
    Double Speed;
    String Time;
    String name; // 成员变量
	Post post;
    Staff(Post post,Task task){
    	this.post = post;
    	this.task = task;
    }
    Staff(){
    	
    }
    Task task;
    /*Staff(Task task){
    	this.task = task;
    }*/
    public void gongzuo() {
		this.Speed = this.post.Leaderpower * 1.5 + this.SolveAbility;
    	this.Time = String.valueOf(this.task.volume / this.Speed);
		
	}

    void print1() {
        System.out.println("员工" + name + "解决了问题");
        System.out.println("解决速度是" + Time);
        
    }
	
}
