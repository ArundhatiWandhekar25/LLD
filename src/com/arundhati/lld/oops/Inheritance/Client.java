package com.arundhati.lld.oops.Inheritance;

public class Client {
    public static void main(String [] args){
        TA ta=new TA();
        ta.name="Arundhati";
        Student st=new Student();
        st.name="Prithviraj"; //this name attribute is ovewritten by student class
        st.age=22;
        st.geneder="male";
        st.pauseBatch();
    }
}
