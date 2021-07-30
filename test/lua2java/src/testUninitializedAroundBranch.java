import org.luaj.vm2.*;
import org.luaj.vm2.lib.*;
public class testUninitializedAroundBranch extends VarArgFunction {
   public Varargs onInvoke(Varargs $arg) {
      LuaValue state = NIL;
      if ( env.get(_G).toboolean() ) {
         state = _333;
      }
      return state;
   }
   static final LuaValue _G = valueOf("_G");
   static final LuaValue _333 = valueOf(333);
}