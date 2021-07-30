import org.luaj.vm2.*;
import org.luaj.vm2.lib.*;
public class function extends VarArgFunction {
   public Varargs onInvoke(Varargs $arg) {
      env.get(print).call(table_lo);
      env.get(print).call(after_em);
      return NONE;
   }
   static final LuaValue print = valueOf("print");
   static final LuaValue table_lo = valueOf("table loaded");
   static final LuaValue after_em = valueOf("after empty string");
}