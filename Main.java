package assigment.pkg2;


public class Assigment2 {
    
        public static void main(String[] args) {
       
        subject subj=new subject(25,"ESlam",36);
        address addr=new address(5,"sammlout" ,"Egypt" );
         student st=new student("Eslam",3.3,subj,addr);
        st.setId(12);
        st.getId();
        st.show();    
        
    }
    
}