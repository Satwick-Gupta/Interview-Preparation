class Event
{
    String name;
    String detail;
    String organizer;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public String getOrganizer() {
        return organizer;
    }

    public void setOrganizer(String organizer) {
        this.organizer = organizer;
    }

    Event(String name, String detail, String organizer)
    {
        this.name=name;
        this.detail=detail;
        this.organizer=organizer;
    }
    public void totalCredit()
    {
        System.out.println("This is base class total credit");
    }
    public void tostring()
    {
        System.out.println(name+detail+organizer);
    }
}
public class Exhibition extends Event{
    private int StallCount;


    Exhibition(String name,String detail,String organizer,int StallCount)
    {
        super(name,detail,organizer);
        this.StallCount=StallCount;
    }

    public int getStallCount() {
        return StallCount;
    }

    public void setStallCount(int stallCount) {
        this.StallCount = stallCount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public String getOrganizer() {
        return organizer;
    }

    public void setOrganizer(String organizer) {
        this.organizer = organizer;
    }
    public void totalCredit()
    {
        super.totalCredit();
        System.out.println(StallCount*50);
    }
}
class StageEvent extends Event
{

    private int totalShow;
    private int seatsPerShow;
    StageEvent(String name,String detail ,String organizer,int totalShow,int seatsPerShow)
    {

        super(name,detail,organizer);

        this.totalShow=totalShow;
        this.seatsPerShow=seatsPerShow;
    }

    public int getTotalShow() {
        return totalShow;
    }

    public void setTotalShow(int totalShow) {
        this.totalShow = totalShow;
    }

    public int getSeatsPerShow() {
        return seatsPerShow;
    }

    public void setSeatsPerShow(int seatsPerShow) {
        this.seatsPerShow = seatsPerShow;
    }

    @Override
    public void totalCredit() {
        {
            super.totalCredit();
            System.out.println((totalShow*seatsPerShow)*100);
        }
    }
}
class main1
{
    public static void main(String[] args) {

        StageEvent s=new StageEvent("satwick","Gupta","good",10,20);

        System.out.println(s.getName());


    }
}