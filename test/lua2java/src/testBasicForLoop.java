import org.luaj.vm2.*;
import org.luaj.vm2.lib.*;
public class testBasicForLoop extends VarArgFunction {
   public Varargs onInvoke(Varargs $arg) {
      final LuaValue[] data = {NIL};
      for ( double i$0=ONE.checkdouble(), i$limit=_2.checkdouble(); i$0<=i$limit; ++i$0 ) {
         final LuaValue i = valueOf(i$0);
         data[0] = i;
      }
      final LuaValue bar = new ZeroArgFunction(env) {
         public LuaValue call() {
            return data[0];
         }
      };
      return new TailcallVarargs(bar,NONE);
   }
   static final LuaValue _2 = valueOf(2);
}