import org.luaj.vm2.*;
import org.luaj.vm2.lib.*;
public class testNoReturnValuesPlainCall extends VarArgFunction {
   public Varargs onInvoke(Varargs $arg) {
      final LuaValue testtable = LuaValue.tableOf();
      return new TailcallVarargs(env.get(pcall),new ZeroArgFunction(env) {
         public LuaValue call() {
            testtable.set(ONE,_2);
            return NONE;
         }
      });
   }
   static final LuaValue pcall = valueOf("pcall");
   static final LuaValue _2 = valueOf(2);
}