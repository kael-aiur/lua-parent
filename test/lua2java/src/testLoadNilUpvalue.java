import org.luaj.vm2.*;
import org.luaj.vm2.lib.*;
public class testLoadNilUpvalue extends VarArgFunction {
   public Varargs onInvoke(Varargs $arg) {
      env.set(tostring$1,new ZeroArgFunction(env) {
         public LuaValue call() {
            return NONE;
         }
      });
      final LuaValue pcall = new VarArgFunction(env) {
         public Varargs invoke(Varargs $arg) {
            final LuaValue arg = NIL;
            NIL.invoke($arg);
            return NONE;
         }
      };
      return env.get(NIL$1);
   }
   static final LuaValue tostring$1 = valueOf("tostring");
   static final LuaValue NIL$1 = valueOf("NIL");
}