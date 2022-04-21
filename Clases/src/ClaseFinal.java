//final abstract class ClaseFinalAbstracta{   // clases abstracta y final no va
//    protected static int i;
//    void doStuff(){}
//    abstract void doIt();
//}

class A4{
    //protected static final int i;    // final hay que siempre inicializarla
    private void doStuff(){}
}




//final abstract class A5{ - antes final no se puede sobrescribir
  final class A5{
    protected static int i;
    void doStuff(){}
//    abstract void doIt();
}

// la clase solo puede ser final o public final
final class ClaseFinal {
    protected static final double E = 2.7182818284590452354;
    // las variables pueden ser static y final e inicialitarla
}