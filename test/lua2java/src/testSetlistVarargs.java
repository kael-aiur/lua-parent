import org.luaj.vm2.*;
import org.luaj.vm2.lib.*;
public class testSetlistVarargs extends VarArgFunction {
   public Varargs onInvoke(Varargs $arg) {
      final LuaValue f = new ZeroArgFunction(env) {
         public LuaValue call() {
            return abc;
         }
      };
      final LuaValue g = LuaValue.listOf(new LuaValue[]{}, f.invoke());
      return g.get(ONE);
   }
   static final LuaValue abc = valueOf("abc");
}