import org.luaj.vm2.*;
import org.luaj.vm2.lib.*;
public class testPhiUpvalue extends VarArgFunction {
   public Varargs onInvoke(Varargs $arg) {
      LuaValue $b;
      final LuaValue[] a = {(($b=env.get(foo)).toboolean()?$b:ZERO)};
      final LuaValue b = new OneArgFunction(env) {
         public LuaValue call(LuaValue c) {
            if ( c.gt_b(a[0]) ) {
               a[0] = c;
            }
            return a[0];
         }
      };
      b.call(_6);
      return a[0];
   }
   static final LuaValue foo = valueOf("foo");
   static final LuaValue _6 = valueOf(6);
}