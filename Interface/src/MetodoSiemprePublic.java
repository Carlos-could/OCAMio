interface Exportable{
    void export();      //ya es public implicitamente
}
class Tool implements Exportable{
    public void export() {  // estaba como protectec
        System.out.println("Tool::export");
    } // protected void export(), no porque
}                                                               // se hereda de interface y este es public
public class MetodoSiemprePublic extends Tool implements Exportable{
    public void export(){ //line n2
        System.out.println("RTool::export");
    }
    public static void main(String[] args) {
        Tool aTool=new MetodoSiemprePublic();
        Tool bTool=new Tool();
        callExport(aTool);
        callExport(bTool);
    }
    public static void callExport(Exportable ex){ //line n2
        ex.export();
    }
}