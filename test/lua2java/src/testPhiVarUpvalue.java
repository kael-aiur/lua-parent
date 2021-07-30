import org.luaj.vm2.*;
import org.luaj.vm2.lib.*;
public class testPhiVarUpvalue extends VarArgFunction {
   public Varargs onInvoke(Varargs $arg) {
      final LuaValue[] a = {ONE};
      final LuaValue b = new ZeroArgFunction(env) {
         public LuaValue call() {
            a[0] = valueOf(a[0].checkdouble()+1);
            return new ZeroArgFunction(env) {
               public LuaValue call() {
                  return NONE;
               }
            };
         }
      };
      LuaValue f,s,var;
      Varargs v;
      final Varargs v$1 = b.invoke();
      f = v$1.arg1();
      s = v$1.arg(2);
      var = v$1.arg(3);
      while (true) {
         v = f.invoke(varargsOf(s,var));
         if ((var=v.arg1()).isnil()) break;
         final LuaValue i = var;
         a[0] = _3;
      }
      return a[0];
   }
   static final LuaValue _3 = valueOf(3);
}