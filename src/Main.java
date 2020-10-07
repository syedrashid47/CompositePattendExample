public class Main {

    public static void main(String[] args) {
	// write your code here


        Tourist tourist1=new Tourist("Rashid");
        Tourist tourist2=new Tourist("Adil");
        Tourist tourist3=new Tourist("Majid");
        Tourist tourist4=new Tourist("Kashif");
        Tourist tourist5=new Tourist("Irfan");


        TourTeam team01=new TourTeam();

        TourTeam team02=new TourTeam();


        team01.add(tourist1);
        team01.add(tourist2);
        team01.add(tourist4);
        team02.add(tourist3);
        team02.add(tourist4);





        team01.AllowTrip("Swat", "15th august");
        team02.AllowTrip("Gilgit","17 August" );


        tourist5.AllowTrip("Waziristan", "23 rd March");





    }
}
