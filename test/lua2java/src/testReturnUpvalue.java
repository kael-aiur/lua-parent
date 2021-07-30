import org.luaj.vm2.*;
import org.luaj.vm2.lib.*;
public class testReturnUpvalue extends VarArgFunction {
   public Varargs onInvoke(Varargs $arg) {
      final LuaValue[] b = {NIL};
      env.set(c,new ZeroArgFunction(env) {
         public LuaValue call() {
            b[0] = _5;
            return ONE;
         }
      });
      return varargsOf(env.get(c).call(),b[0]);
   }
   static final LuaValue _5 = valueOf(5);
   static final LuaValue c = valueOf("c");
}