import java.util.Scanner;

public class reg {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int reg=s.nextInt();
        int nonreg=s.nextInt();
        int time=0;
        time=time+reg;

        if(reg>nonreg)
        {
            while(reg>nonreg)
            {
                time=time+(reg/nonreg);
                reg=(reg/nonreg);
            }
        }
        System.out.println(time);

    }
}
