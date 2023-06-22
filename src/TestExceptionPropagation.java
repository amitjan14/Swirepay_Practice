import java.io.IOException;

class TestExceptionPropagation {
    void m()throws IOException {
        throw new java.io.IOException("device error");//checked exception
    }

    void p(){
        try{

                m();

        }catch(Exception e){System.out.println("exception handeled");}
        finally{System.out.println("Hey");}
    }
    public static void main(String args[]){
        TestExceptionPropagation obj=new TestExceptionPropagation();
        obj.p();
        System.out.println("normal flow");
    }
}  