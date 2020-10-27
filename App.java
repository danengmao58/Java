import java.util.Scanner;
public class App {
    public static void main(String[] args) {  
        Scanner sc=new Scanner(System.in);
        
        Task task = new Task();
        /*
        String str=null;
        System.out.print("请输入任务量:");
        str = sc.nextLine();
        task.volume = Double.valueOf(str);
    */
        task.volume = 200.00;
        task.taskname = "java第一次debug作业";  // 任务名
        
        Post post = new Post(); //       
        post.title = "Manager"; // 领导名字
        post.Leaderpower = 100;
        post.print(); // 领导名字
        System.out.println(task.taskname );//安排的任务名

        
        Staff staff = new Staff(post,task);
        staff.SolveAbility = 123;
        staff.name = "Manong";//员工名
        
        //solve()
        /*
        staff.Speed = post.Leaderpower * 1.5 + staff.SolveAbility;
        staff.Speed1 = String.valueOf(task.volume / staff.Speed);
        */
        staff.gongzuo();
        staff.print1();
        //创建输入对象
        
  
  //获取用户输入的字符串
      /*  String str1=null;
        System.out.print("请输入任意字符:");
        str1=sc.nextLine();
        System.out.println("你输入的字符为:"+str1);
  */
 }



        
    }
