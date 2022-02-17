package shiivt;

public class Vsoftmain {


    public static void main(String[] args) {
        President p1= new President("Poorna veer");
        System.out.println("President of V-soft is "+p1.President);

        System.out.println("");
        Developers d1 = new Developers("PoornaVeer");
        System.out.println("NO. of developers in Service now Department = "+d1.ServiceNow);
        System.out.println("NO. of developers in Java Department = "+d1.Java);
        System.out.println("NO. of developers in Mulesoft Department = "+d1.MuleSoft);
        System.out.println("NO. of developers in AWS Department = "+d1.AWS);
        System.out.println("NO. of developers in Azure Department = "+d1.Azure);
        System.out.println("Total no. of Developers From All Departments = " + (d1.Azure+d1.AWS+d1.Java+d1.ServiceNow+d1.MuleSoft));

        System.out.println("");

        /*Managers m2 = new Managers("Poornaveer","Raja","Servicenow");
        System.out.println("Service now manager is : " + m2.M1());*/
        Managers M1 = new Managers("PoornaVeer","Raja","Servicenow");
        System.out.println("NO. of Managers in Service now Department = "+M1.ServiceNow);
        System.out.println("NO. of Managers in Azure Department = "+M1.Azure);
        System.out.println("NO. of Managers in AWS Department = "+M1.AWS);
        System.out.println("NO. of Managers in Jave Department = "+M1.Java);
        System.out.println("NO. of Managers in Mule soft Department = "+M1.MuleSoft);
        System.out.println("Total number of managers in each department under President :" + (M1.Azure+M1.AWS+M1.Java+M1.ServiceNow+M1.MuleSoft));
        System.out.println(" ");

    }
}
