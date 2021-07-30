import org.luaj.vm2.*;
import org.luaj.vm2.lib.*;
public class testSetUpvalueTableInitializer extends VarArgFunction {
   public Varargs onInvoke(Varargs $arg) {
      final LuaValue aliases = LuaValue.tableOf(new LuaValue[]{a,b,});
      final LuaValue foo = new ZeroArgFunction(env) {
         public LuaValue call() {
            return aliases;
         }
      };
      return foo.call().get(a);
   }
   static final LuaValue a = valueOf("a");
   static final LuaValue b = valueOf("b");
}