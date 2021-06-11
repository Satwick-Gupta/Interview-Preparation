import java.util.Scanner;

public class eduprogram {
    private String eduProgramName;
    private String sponsor;
    private int noOfPeopleAttended;
    private boolean stillAvailable;
    private boolean withinCountry;

    public String getEduProgramName() {
        return eduProgramName;
    }

    public void setEduProgramName(String eduProgramName) {
        this.eduProgramName = eduProgramName;
    }

    public String getSponsor() {
        return sponsor;
    }

    public void setSponsor(String sponsor) {
        this.sponsor = sponsor;
    }

    public int getNoOfPeopleAttended() {
        return noOfPeopleAttended;
    }

    public void setNoOfPeopleAttended(int noOfPeopleAttended) {
        this.noOfPeopleAttended = noOfPeopleAttended;
    }

    public boolean isStillAvailable() {
        return stillAvailable;
    }

    public void setStillAvailable(boolean stillAvailable) {
        this.stillAvailable = stillAvailable;
    }

    public boolean isWithinCountry() {
        return withinCountry;
    }

    public void setWithinCountry(boolean withinCountry) {
        this.withinCountry = withinCountry;
    }

    static String findEduProgramClassification(eduprogram arr[]) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].noOfPeopleAttended >= 1000) {
                return "EverGreen";
            } else if (arr[i].noOfPeopleAttended >= 500 && arr[i].noOfPeopleAttended < 1000) {
                return "Golden";
            } else if (arr[i].noOfPeopleAttended < 500) {
                return "Emerging Star";
            }
        }
        return "eduPrograms are not available now";
    }

    static eduprogram[] findEduProgramBySponsor(eduprogram arr[], String s) {
        return null;
    }
}
    class Myclass
    {
        public static void main(String[] args) {
            Scanner s=new Scanner(System.in);
            /*int tot=s.nextInt();
            s.next();
            eduprogram arr[]=new eduprogram[tot];
            for(int i=0;i<tot;i++)
            {
                eduprogram ed=new eduprogram();
                ed.setEduProgramName(s.next());
                ed.setSponsor(s.next());
                ed.setNoOfPeopleAttended(s.nextInt());
                ed.setStillAvailable(s.nextBoolean());
                ed.setWithinCountry(s.nextBoolean());
                arr[i]=ed;

        }
        */


            //System.out.println(eduprogram.findEduProgramClassification(arr));
    }
}

