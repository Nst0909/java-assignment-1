package shiivt;

public class Managers extends Developers{
    String President1;
    String Managers;
    String Department1;
    int ServiceNow =2 ;
    int Java =3 ;
    int MuleSoft=4;
    int  AWS=5;
    int Azure=6;
    public Managers(String prednt1 ,String Managers,String Department){
        super(Department);
        this.President1 = prednt1;
        this.Managers= Managers;
        this.Department1=Department;
    }


//    public Managers(String president) {
//        super();
//    }


    void M1(){
        Managers m1=new Managers("Poornaveer","Raja","Servicenow");
        Managers m2=new Managers("President","managers","Aws");
        Managers m3=new Managers("President","managers" , "mulesoft");
        Managers m4=new Managers("President","managers","Java");
        Managers m5=new Managers("President","managers","Azure");

    }




}
