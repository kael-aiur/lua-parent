import org.luaj.vm2.*;
import org.luaj.vm2.lib.*;
public class testNumericForUpvalues extends VarArgFunction {
   public Varargs onInvoke(Varargs $arg) {
      for ( double i$0=_3.checkdouble(), i$limit=_4.checkdouble(); i$0<=i$limit; ++i$0 ) {
         final LuaValue[] i = {valueOf(i$0)};
         i[0] = valueOf(i[0].checkdouble()+5);
         final LuaValue a = new ZeroArgFunction(env) {
            public LuaValue call() {
               return i[0];
            }
         };
         return new TailcallVarargs(a,NONE);
      }
      return NONE;
   }
   static final LuaValue _3 = valueOf(3);
   static final LuaValue _4 = valueOf(4);
}