package assigment.pkg2;

public class student {
    public String StudName;
    private int StudId;
    public double studGpa;
    public subject subj;
    public address addr;
    
     public student(String Name ,double gpa,subject s,address ad)
    {
        this.StudName=Name;
        //this.StudId=id;
        this.studGpa=gpa;
        this.subj =s;
        this.addr =ad;
    }
     public void setId(int id)
     {
         this.StudId=id;
     }
     public int getId()
     {
         return StudId;
     }
     public void show()
     {
         System.out.println("Id is "+this.StudId+"  Name Is "+this.StudName+"  Gpa is "+this.studGpa);
         System.out.println("Id is "+subj.SubjId+"  Subject Name is "+subj.SubjName+"  Hourse is "+subj.SubjHoures);
         System.out.println("Adress Is "+addr.streetNum+"  "+addr.streetCity+"  "+addr.streetCuntry);   
  
     }
}