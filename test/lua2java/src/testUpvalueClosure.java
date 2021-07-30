import org.luaj.vm2.*;
import org.luaj.vm2.lib.*;
public class testUpvalueClosure extends VarArgFunction {
   public Varargs onInvoke(Varargs $arg) {
      env.get(print).call();
      final LuaValue f2 = new ZeroArgFunction(env) {
         public LuaValue call() {
            return NONE;
         }
      };
      final LuaValue[] f3 = new LuaValue[1];
      f3[0] = new ZeroArgFunction(env) {
         public LuaValue call() {
            return f3[0];
         }
      };
      return env.get(NIL$1);
   }
   static final LuaValue print = valueOf("print");
   static final LuaValue NIL$1 = valueOf("NIL");
}