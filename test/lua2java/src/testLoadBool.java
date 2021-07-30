import org.luaj.vm2.*;
import org.luaj.vm2.lib.*;
public class testLoadBool extends VarArgFunction {
   public Varargs onInvoke(Varargs $arg) {
      env.get(print).call(env.get(type$1).call(env.get(foo)).eq(string));
      LuaValue b = NIL;
      if ( env.get(print).call().toboolean() ) {
         b = new ZeroArgFunction(env) {
            public LuaValue call() {
               return NIL;
            }
         };
      }
      return NONE;
   }
   static final LuaValue print = valueOf("print");
   static final LuaValue type$1 = valueOf("type");
   static final LuaValue foo = valueOf("foo");
   static final LuaValue string = valueOf("string");
}