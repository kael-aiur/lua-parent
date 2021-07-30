import org.luaj.vm2.*;
import org.luaj.vm2.lib.*;
public class testUninitializedUpvalue extends VarArgFunction {
   public Varargs onInvoke(Varargs $arg) {
      {
         env.set(g,new ZeroArgFunction(env) {
            public LuaValue call() {
               env.get(print).invoke(NIL.invoke());
               return NONE;
            }
         });
      }
      return env.get(NIL$1);
   }
   static final LuaValue print = valueOf("print");
   static final LuaValue g = valueOf("g");
   static final LuaValue NIL$1 = valueOf("NIL");
}