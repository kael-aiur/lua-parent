import org.luaj.vm2.*;
import org.luaj.vm2.lib.*;
public class testSimpleRepeatUntil extends VarArgFunction {
   public Varargs onInvoke(Varargs $arg) {
      LuaValue a = NIL;
      do {
         a = NIL;
      } while (!(!a.toboolean()));
      return _5;
   }
   static final LuaValue _5 = valueOf(5);
}