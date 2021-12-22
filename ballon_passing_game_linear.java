
public class ballon_passing_game_linear {
    public static void main(String[] args) {
        int f=3,t=11,round=0;
        int temp=t;

        if(f>t)
        {
            System.out.print(t+" "+(t+1));
        }
        else if(f<t)
        {
            while(t>=f)
            {
                t=t-(f-1);
                round++;
               
            }
            System.out.println("round:"+round +" time:"+ t);
            if(round%2==0)
            {
                System.out.print(t+" "+(t+1));
            }
            else {

               System.out.print((f-t+1)+ " " + (f-t));
            }

        }
    }  
}
